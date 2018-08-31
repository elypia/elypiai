package com.elypia.elypiai.osu;

import com.elypia.elypiai.osu.data.*;
import com.elypia.elypiai.osu.deserializers.*;
import com.elypia.elypiai.osu.impl.IOsuService;
import com.elypia.elypiai.utils.gson.deserializers.UtcDateDeserializer;
import com.elypia.elypiai.utils.okhttp.RestAction;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import okhttp3.*;
import retrofit2.Call;
import retrofit2.*;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.*;

public class Osu {

	public static final String OSU_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	private static final String BASE_URL = "https://osu.ppy.sh/api/";

	private final String API_KEY;

	private IOsuService service;
	private Collection<OsuPlayer> cache;

	/**
	 * Creates an OSU object for making calls to the osu API.
	 * Using this you can call information on each user, as well
	 * as beatmaps, and recentplay data for users.
	 *
	 * @param 	apiKey	The API obtained from the osu! website.
	 */

	public Osu(String apiKey) {
		this(BASE_URL, apiKey);
	}

	public Osu(String baseUrl, String apiKey) {
		API_KEY = apiKey;
		cache = new ArrayList<>();

		OkHttpClient client = new OkHttpClient.Builder().addInterceptor((chain) -> {
			Request request = chain.request();
			HttpUrl url = request.url().newBuilder().addQueryParameter("k", apiKey).build();
			request = request.newBuilder().url(url).build();
			return chain.proceed(request);
		}).build();

		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(Date.class, new UtcDateDeserializer(OSU_DATE_FORMAT));
		gsonBuilder.registerTypeAdapter(new TypeToken<List<OsuMod>>(){}.getType(), new OsuModDeserializer());
		gsonBuilder.registerTypeAdapter(OsuMatch.class, new OsuMatchDeserializer());
		gsonBuilder.registerTypeAdapter(OsuPlayer.class, new OsuPlayerDeserializer());
		gsonBuilder.registerTypeAdapter(new TypeToken<List<BeatMap>>(){}.getType(), new BeatMapDeserializer());

		Retrofit.Builder retrofitBuilder = new Retrofit.Builder().baseUrl(baseUrl);
		retrofitBuilder.addConverterFactory(GsonConverterFactory.create(gsonBuilder.create()));

		service = retrofitBuilder.client(client).build().create(IOsuService.class);
	}

	/**
	 * Calls the OSU API for the osuplayer by id.
	 *
	 * @param 	id		The players id.
	 * @param	mode	The gamemode to view data for.
	 */

	public RestAction<OsuPlayer> getPlayer(int id, OsuMode mode, int days) {
		return getPlayer(String.valueOf(id), OsuId.USER_ID, mode, days);
	}

	/**
	 * Calls the OSU API for the osuplayer by username.
	 *
	 * @param 	username	The players username.
	 * @param	mode		The gamemode to view data for.
	 */

	public RestAction<OsuPlayer> getPlayer(String username, OsuMode mode, int days) {
		return getPlayer(username, OsuId.USERNAME, mode, days);
	}

	private RestAction<OsuPlayer> getPlayer(String username, OsuId type, OsuMode mode, int days) {
		Call<OsuPlayer> call = service.getPlayer(username, type.getType(), mode.getId(), days);
		return new RestAction<>(call);
	}

	/**
	 * Get the all BeatMap information associated with a BeatMap id.
	 *
	 * @param	id	The id of the beatmap to search grab.
	 */

	public RestAction<List<BeatMap>> getBeatMaps(int id, OsuMode mode, int limit) {
		Call<List<BeatMap>> call = service.getBeatMaps(id, mode.getId(), limit);
		return new RestAction<>(call);
	}

	public RestAction<List<RecentPlay>> getRecentPlays(int id, OsuMode mode, int limit) {
		return getRecentPlays(String.valueOf(id), OsuId.USER_ID, mode, limit);
	}

	public RestAction<List<RecentPlay>> getRecentPlays(String id, OsuMode mode, int limit) {
		return getRecentPlays(id, OsuId.USERNAME, mode, limit);
	}

	private RestAction<List<RecentPlay>> getRecentPlays(String id, OsuId type, OsuMode mode, int limit) {
		Call<List<RecentPlay>> call = service.getRecentPlays(id, type.getType(), mode.getId(), limit);
		return new RestAction<>(call);
	}

	public RestAction<OsuMatch> getMatch(int id) {
		Call<OsuMatch> call = service.getMatch(id);
		return new RestAction<>(call);
	}

	public String getApiKey() {
		return API_KEY;
	}
}
