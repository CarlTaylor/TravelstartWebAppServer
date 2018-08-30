package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.travelstart.TravelstartWebAppServer.model.Traveller;

public interface TravellerRepository extends JpaRepository<Traveller, Long> {

}
