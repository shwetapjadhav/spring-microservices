package com.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

public class LimitsConfiguration {

	private int minimum;
	private int maximum;
		
	protected LimitsConfiguration() {
	
	}
	
	public LimitsConfiguration(int minimum, int maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}
	
	
	public int getMaximum() {
		return maximum;
	}
	
}
