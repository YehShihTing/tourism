package idv.yst.tourism.service;

import java.util.List;

import idv.yst.tourism.entity.Traveler;
import idv.yst.tourism.gateway.persistence.TravelerDataAccessor;

public class TravelerManager {
	private TravelerDataAccessor travelerInfoDataAccessor;
	private List<Traveler> travelers;

	public boolean addNewTraveler(Traveler traveler) {
		return travelerInfoDataAccessor.addNewTraveler(traveler);
	}

	public List<Traveler> getAllTraveler() {
		return getAllTraveler(false);
	}

	public List<Traveler> getAllTraveler(boolean reload) {
		if (travelers == null || reload) {
			travelers = travelerInfoDataAccessor.getAllTraveler();
		}
		return travelers;
	}

	public Traveler getTravelerByName(String name) {
		for (Traveler traveler : getAllTraveler()) {
			if (traveler.getName().equalsIgnoreCase(name)) {
				return traveler;
			}
		}
		return null;
	}

	public boolean updateTraveler(Traveler traveler) {
		return travelerInfoDataAccessor.updateTraveler(traveler);
	}

	public boolean removeTraveler(Traveler traveler) {
		return travelerInfoDataAccessor.removeTraveler(traveler);
	}
}
