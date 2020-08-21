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

package org.elypia.elypiai.poe.data;

import com.google.gson.annotations.SerializedName;

/**
 * @author seth@elypia.org (Seth Falco)
 */
public enum MatchStyle {

	UNKNOWN("Unknown"),

	@SerializedName("Swiss")
	SWISS("Swiss"),

	@SerializedName("Arena")
	ARENA("Arena"),

	@SerializedName("Blitz")
	BLITZ("Blitz");

	private final String NAME;

	MatchStyle(String name) {
		NAME = name;
	}

	public static MatchStyle get(String name) {
		for (MatchStyle style : MatchStyle.values()) {
			if (style.NAME.equals(name))
				return style;
		}

		return UNKNOWN;
	}
}
