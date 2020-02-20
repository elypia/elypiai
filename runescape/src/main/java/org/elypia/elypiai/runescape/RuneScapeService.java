/*
 * Copyright 2019-2019 Elypia CIC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.elypia.elypiai.runescape;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * @author seth@elypia.org (Seth Falco)
 */
public interface RuneScapeService {

    @GET("profile/profile")
    Call<Player> getUser(
        @Query("user") String user
    );

    @GET("quests")
    Call<List<QuestStats>> getQuestStats(
        @Query("user") String user
    );
}
