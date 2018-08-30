package za.co.travelstart.TravelstartWebAppServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.travelstart.TravelstartWebAppServer.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
