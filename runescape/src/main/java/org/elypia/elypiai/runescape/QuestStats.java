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

import com.google.gson.annotations.SerializedName;
import org.elypia.elypiai.runescape.data.*;

/**
 * @author seth@elypia.org (Seth Falco)
 */
public class QuestStats implements Comparable<QuestStats> {

	@SerializedName("title")
	private String title;

	@SerializedName("status")
	private CompletionStatus status;

	@SerializedName("difficulty")
	private Difficulty difficulty;

	@SerializedName("members")
	private boolean members;

	@SerializedName("questPoints")
	private int questPoints;

	@SerializedName("userEligible")
	private boolean userEligible;

	public String getTitle() {
		return title;
	}

	public CompletionStatus getStatus() {
		return status;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public boolean isMembers() {
		return members;
	}

	public int getQuestPoints() {
		return questPoints;
	}

	public boolean isUserEligible() {
		return userEligible;
	}

	@Override
	public int compareTo(QuestStats o) {
		return title.compareToIgnoreCase(o.title);
	}
}
