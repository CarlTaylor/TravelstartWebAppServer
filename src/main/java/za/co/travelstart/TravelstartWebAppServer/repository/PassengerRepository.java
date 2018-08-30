package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.travelstart.TravelstartWebAppServer.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
