package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.travelstart.TravelstartWebAppServer.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
