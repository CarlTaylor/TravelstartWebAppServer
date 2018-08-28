package za.co.travelstart.TravelstartWebAppServer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.travelstart.TravelstartWebAppServer.model.*;
import za.co.travelstart.TravelstartWebAppServer.model.Class;
import za.co.travelstart.TravelstartWebAppServer.repository.*;

@Service
@RequestMapping("/admin")
public class FlightAdminService {

    @Autowired
    private AirlineRepository airlineRepository;

    @Autowired
    private AirplaneRepository airplaneRepository;

    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private ExtraRepository extraRepository;

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private PricingRepository pricingRepository;

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private TaxesRepository taxesRepository;

    public void saveAirline(Airline airline){
        airlineRepository.save(airline);
    }

    public void deleteAirlineById(Long id){
        airlineRepository.deleteById(id);
    }

    public void saveAirplane(Airplane airplane){
        airplaneRepository.save(airplane);
    }

    public void deleteAirplaneById(Long id){
        airplaneRepository.deleteById(id);
    }

    public void saveAirport(Airport airport){
        airportRepository.save(airport);
    }

    public void deleteAirportById(Long id){
        airportRepository.deleteById(id);
    }

    public void saveClass(Class _class){
        classRepository.save(_class);
    }

    public void deleteClassById(Long id){
        airlineRepository.deleteById(id);
    }

    public void saveExtra(Extra extra){
        extraRepository.save(extra);
    }

    public void deleteExtraById(Long id){
        extraRepository.deleteById(id);
    }

    public void saveFlight(Flight flight){
        flightRepository.save(flight);
    }

    public void deleteFlightById(Long id){
        flightRepository.deleteById(id);
    }

    public void savePricing(Pricing pricing){
        pricingRepository.save(pricing);
    }

    public void deletePricingById(Long id){
        pricingRepository.deleteById(id);
    }

    public void saveSeat(Seat seat){
        seatRepository.save(seat);
    }

    public void deleteSeatById(SeatId seatId){
        seatRepository.deleteById(seatId);
    }

    public void saveTaxes(Taxes taxes){
        taxesRepository.save(taxes);
    }

    public void deleteTaxesById(Long id){
        taxesRepository.deleteById(id);
    }

}