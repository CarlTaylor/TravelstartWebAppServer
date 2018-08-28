package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.travelstart.TravelstartWebAppServer.model.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long> {

}
