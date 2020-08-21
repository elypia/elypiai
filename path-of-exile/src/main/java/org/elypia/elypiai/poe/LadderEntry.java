/*
 * Copyright 2019-2020 Elypia CIC and Contributors
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

package org.elypia.elypiai.poe;

import com.google.gson.annotations.SerializedName;

/**
 * @author seth@elypia.org (Seth Falco)
 */
public class LadderEntry {

	@SerializedName("rank")
	private int rank;

	@SerializedName("dead")
	private boolean dead;

	@SerializedName("online")
	private boolean online;

	@SerializedName("character")
	private Exile exile;

	@SerializedName("account")
	private Account account;

	public int getRank() {
		return rank;
	}

	public boolean isDead() {
		return dead;
	}

	public boolean isOnline() {
		return online;
	}

	public Exile getExile() {
		return exile;
	}

	public Account getAccount() {
		return account;
	}
}
