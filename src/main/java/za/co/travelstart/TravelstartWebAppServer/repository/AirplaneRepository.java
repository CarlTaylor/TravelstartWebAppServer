package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.travelstart.TravelstartWebAppServer.model.Airplane;

public interface AirplaneRepository extends JpaRepository<Airplane, Long> {

}
