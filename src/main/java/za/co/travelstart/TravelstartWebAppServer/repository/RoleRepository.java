package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.travelstart.TravelstartWebAppServer.model.Role;
import za.co.travelstart.TravelstartWebAppServer.model.RoleNameEnum;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
