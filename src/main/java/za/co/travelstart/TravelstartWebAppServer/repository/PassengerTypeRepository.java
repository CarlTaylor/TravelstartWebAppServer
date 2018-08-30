package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.travelstart.TravelstartWebAppServer.model.PassengerType;

public interface PassengerTypeRepository extends JpaRepository<PassengerType, String> {

}
