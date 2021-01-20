package idv.yst.tourism.gateway.persistence;

import java.util.List;

import idv.yst.tourism.entity.Trip;

public interface TripDataAccessor {

	public boolean addNewTrip(Trip trip);

	public List<Trip> getAllTrips();

	public boolean updateTrip(Trip trip);

	public boolean removeTrip(Trip trip);

}
