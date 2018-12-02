package com.elypia.elypiai.osu.deserializers;

import com.elypia.elypiai.osu.Match;
import com.google.gson.*;

import java.lang.reflect.Type;

public class OsuMatchDeserializer implements JsonDeserializer<Match> {

    private static final Gson GSON = new Gson();

    @Override
    public Match deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject object = json.getAsJsonObject();
        JsonObject match = object.getAsJsonObject("match");
        match.add("games", object.getAsJsonArray("games"));
        return GSON.fromJson(match, typeOfT);
    }
}
