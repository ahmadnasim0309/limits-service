package com.java.microservice.limitsmicroservice.bean;

public class limits {
	
	private int minimum;
	private int maximum;
	
	public limits() {
		super();
	}

	public limits(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	@Override
	public String toString() {
		return "limits [minimum=" + minimum + ", maximum=" + maximum + "]";
	}
}
