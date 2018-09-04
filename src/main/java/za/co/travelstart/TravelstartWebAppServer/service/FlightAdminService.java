package za.co.travelstart.TravelstartWebAppServer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.travelstart.TravelstartWebAppServer.model.*;
import za.co.travelstart.TravelstartWebAppServer.model.Class;
import za.co.travelstart.TravelstartWebAppServer.repository.*;

import java.util.List;
import java.util.Optional;

@Service
@RequestMapping("/admin")
public class FlightAdminService {


    private AirlineRepository airlineRepository;
    private AirplaneRepository airplaneRepository;
    private AirportRepository airportRepository;
    private ClassRepository classRepository;
    private ExtraRepository extraRepository;
    private FlightRepository flightRepository;
    private PricingRepository pricingRepository;
    private SeatRepository seatRepository;
    private TaxesRepository taxesRepository;

    @Autowired
    public FlightAdminService(AirlineRepository airlineRepository, AirplaneRepository airplaneRepository,
                              AirportRepository airportRepository, ClassRepository classRepository,
                              ExtraRepository extraRepository, FlightRepository flightRepository,
                              PricingRepository pricingRepository, SeatRepository seatRepository,
                              TaxesRepository taxesRepository){

        this.airlineRepository = airlineRepository;
        this.airplaneRepository = airplaneRepository;
        this.airportRepository = airportRepository;
        this.classRepository = classRepository;
        this.extraRepository = extraRepository;
        this.flightRepository = flightRepository;
        this.pricingRepository = pricingRepository;
        this.seatRepository = seatRepository;
        this.taxesRepository = taxesRepository;
    }

    public void saveAirline(Airline airline){
        airlineRepository.save(airline);
    }

    public void deleteAirlineById(Long id){
        airlineRepository.deleteById(id);
    }

    public List<Airline> findAllAirlineList(){
        return airlineRepository.findAll();
    }

    public Optional<Airline> findAirlineById(Long id) {
        return airlineRepository.findById(id);
    }

    public void saveAirplane(Airplane airplane){
        airplaneRepository.save(airplane);
    }

    public void deleteAirplaneById(Long id){
        airplaneRepository.deleteById(id);
    }

    public List<Airplane> findAllAirplaneList(){
        return airplaneRepository.findAll();
    }

    public Optional<Airplane> findAirplaneById(Long id) {
        return airplaneRepository.findById(id);
    }

    public void saveAirport(Airport airport){
        airportRepository.save(airport);
    }

    public void deleteAirportById(Long id){
        airportRepository.deleteById(id);
    }

    public List<Airport> findAllAirportList(){
        return airportRepository.findAll();
    }

    public Optional<Airport> findAirportById(Long id) {
        return airportRepository.findById(id);
    }

    public void saveClass(Class _class){
        classRepository.save(_class);
    }

    public void deleteClassById(ClassId classId){
        classRepository.deleteById(classId);
    }

    public List<Class> findAllClassList(){
        return classRepository.findAll();
    }

    public Optional<Class> findClassById(ClassId classId) {
        return classRepository.findById(classId);
    }

    public void saveExtra(Extra extra){
        extraRepository.save(extra);
    }

    public void deleteExtraById(Long id){
        extraRepository.deleteById(id);
    }

    public List<Extra> findAllExtraList(){
        return extraRepository.findAll();
    }

    public Optional<Extra> findExtraById(Long id) {
        return extraRepository.findById(id);
    }

    public void saveFlight(Flight flight){
        flightRepository.save(flight);
    }

    public void deleteFlightById(Long id){
        flightRepository.deleteById(id);
    }

    public List<Flight> findAllFlightList(){
        return flightRepository.findAll();
    }

    public Optional<Flight> findFlightById(Long id) {
        return flightRepository.findById(id);
    }

    public void savePricing(Pricing pricing){
        pricingRepository.save(pricing);
    }

    public void deletePricingById(Long id){
        pricingRepository.deleteById(id);
    }

    public List<Pricing> findAllPricingList(){
        return pricingRepository.findAll();
    }

    public Optional<Pricing> findPricingById(Long id) {
        return pricingRepository.findById(id);
    }

    public void saveSeat(Seat seat){
        seatRepository.save(seat);
    }

    public void deleteSeatById(SeatId seatId){
        seatRepository.deleteById(seatId);
    }

    public List<Seat> findAllSeatList(){
        return seatRepository.findAll();
    }

    public Optional<Seat> findSeatById(SeatId id) {
        return seatRepository.findById(id);
    }

    public void saveTaxes(Taxes taxes){
        taxesRepository.save(taxes);
    }

    public void deleteTaxesById(Long id){
        taxesRepository.deleteById(id);
    }

    public List<Taxes> findAllTaxesList(){
        return taxesRepository.findAll();
    }

    public Optional<Taxes> findTaxesById(Long id) {
        return taxesRepository.findById(id);
    }
}
