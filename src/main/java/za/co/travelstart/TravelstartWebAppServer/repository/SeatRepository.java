package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.travelstart.TravelstartWebAppServer.model.Seat;
import za.co.travelstart.TravelstartWebAppServer.model.SeatId;

public interface SeatRepository extends JpaRepository<Seat, SeatId> {

}
