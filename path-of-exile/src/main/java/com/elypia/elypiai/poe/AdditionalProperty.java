package com.elypia.elypiai.poe;

import com.google.gson.annotations.SerializedName;

public class AdditionalProperty extends ItemProperty {

	@SerializedName("progress")
	private double progress;

	public double getProgress() {
		return progress;
	}
}