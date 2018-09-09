package com.elypia.elypiai.osu.deserializers;

import com.elypia.elypiai.osu.*;
import com.elypia.elypiai.utils.gson.deserializers.UtcDateDeserializer;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.*;

public class BeatMapDeserializer implements JsonDeserializer<List<BeatMap>> {

    private static final Gson GSON = new Gson();

    @Override
    public List<BeatMap> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray array = json.getAsJsonArray();
        List<BeatMap> maps = GSON.fromJson(array, typeOfT);

        for (int i = 0; i < maps.size(); i++) {
            JsonObject map = array.get(i).getAsJsonObject();
            maps.get(i).setDifficulty(GSON.fromJson(map, MapDifficulty.class));
        }

        return maps;
    }
}
