package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.travelstart.TravelstartWebAppServer.model.Class;
import za.co.travelstart.TravelstartWebAppServer.model.ClassId;

public interface ClassRepository extends JpaRepository<Class, ClassId> {

}
