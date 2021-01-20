package idv.yst.tourism.service;

import java.util.List;

import idv.yst.tourism.entity.Traveler;
import idv.yst.tourism.gateway.persistence.TravelerDataAccessor;

public class TravelerManager {
	private TravelerDataAccessor travelerInfoDataAccessor;

	public boolean addNewTraveler(Traveler traveler) {
		return travelerInfoDataAccessor.addNewTraveler(traveler);
	}

	public List<Traveler> getAllTraveler() {
		return travelerInfoDataAccessor.getAllTraveler();
	}

	public boolean updateTraveler(Traveler traveler) {
		return travelerInfoDataAccessor.updateTraveler(traveler);
	}

	public boolean removeTraveler(Traveler traveler) {
		return travelerInfoDataAccessor.removeTraveler(traveler);
	}
}
