package idv.yst.tourism.spending.track.entity;

import idv.yst.tourism.entity.Traveler;

public class ExpenseShared {
private Traveler traveler;
	private double percentage;

	public Traveler getTraveler() {
		return traveler;
	}

	public void setTraveler(Traveler traveler) {
		this.traveler = traveler;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}
