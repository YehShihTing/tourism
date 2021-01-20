package idv.yst.tourism.gateway.persistence;

import java.util.List;

import idv.yst.tourism.entity.Traveler;

public interface TravelerDataAccessor {

	public boolean addNewTraveler(Traveler traveler);

	public List<Traveler> getAllTraveler();

	public boolean updateTraveler(Traveler traveler);

	public boolean removeTraveler(Traveler traveler);
}
