package idv.yst.tourism.service;

import java.util.List;

import idv.yst.tourism.entity.Trip;
import idv.yst.tourism.gateway.persistence.TripDataAccessor;

public class TripManager {
	private TripDataAccessor tripInfoDataAccessor;

	public boolean addNewTrip(Trip trip) {
		return tripInfoDataAccessor.addNewTrip(trip);
	}

	public List<Trip> getAllTrips() {
		return tripInfoDataAccessor.getAllTrips();
	}

	public boolean updateTrip(Trip trip) {
		return tripInfoDataAccessor.updateTrip(trip);
	}

	public boolean removeTrip(Trip trip) {
		return tripInfoDataAccessor.removeTrip(trip);
	}
}
