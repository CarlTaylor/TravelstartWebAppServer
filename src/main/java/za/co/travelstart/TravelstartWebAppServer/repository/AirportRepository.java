package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.travelstart.TravelstartWebAppServer.model.Airport;

public interface AirportRepository extends JpaRepository<Airport, Long> {

}
