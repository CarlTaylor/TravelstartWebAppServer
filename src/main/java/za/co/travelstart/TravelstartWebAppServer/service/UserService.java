package za.co.travelstart.TravelstartWebAppServer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.travelstart.TravelstartWebAppServer.model.Card;
import za.co.travelstart.TravelstartWebAppServer.model.Passenger;
import za.co.travelstart.TravelstartWebAppServer.model.Payment;
import za.co.travelstart.TravelstartWebAppServer.model.Reservation;
import za.co.travelstart.TravelstartWebAppServer.repository.CardRepository;
import za.co.travelstart.TravelstartWebAppServer.repository.PassengerRepository;
import za.co.travelstart.TravelstartWebAppServer.repository.PaymentRepository;
import za.co.travelstart.TravelstartWebAppServer.repository.ReservationRepository;

@Service
@RequestMapping("/user")
public class UserService {

}
