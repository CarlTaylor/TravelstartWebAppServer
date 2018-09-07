package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.travelstart.TravelstartWebAppServer.model.Class;
import za.co.travelstart.TravelstartWebAppServer.model.ClassId;

import java.util.List;

public interface ClassRepository extends JpaRepository<Class, ClassId> {

    List<Class> findByClassIdAirplaneId(Long airplaneId);
}
