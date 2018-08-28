package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.travelstart.TravelstartWebAppServer.model.PassengerType;

@Repository
public interface PassengerTypeRepository extends JpaRepository<PassengerType, String> {

}
