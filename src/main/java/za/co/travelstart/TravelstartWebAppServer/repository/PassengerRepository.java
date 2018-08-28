package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.travelstart.TravelstartWebAppServer.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
