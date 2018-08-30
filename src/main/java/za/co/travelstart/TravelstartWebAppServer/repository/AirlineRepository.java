package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.travelstart.TravelstartWebAppServer.model.Airline;

public interface AirlineRepository extends JpaRepository<Airline, Long> {

}
