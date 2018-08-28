package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.travelstart.TravelstartWebAppServer.model.Seat;
import za.co.travelstart.TravelstartWebAppServer.model.SeatId;

@Repository
public interface SeatRepository extends JpaRepository<Seat, SeatId> {

}
