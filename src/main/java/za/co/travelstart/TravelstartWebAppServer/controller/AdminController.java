package za.co.travelstart.TravelstartWebAppServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import za.co.travelstart.TravelstartWebAppServer.model.*;
import za.co.travelstart.TravelstartWebAppServer.model.Class;
import za.co.travelstart.TravelstartWebAppServer.service.FlightAdminService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/admin")
public class AdminController {

    private FlightAdminService flightAdminService;

    @Autowired
    AdminController(FlightAdminService flightAdminService){
        this.flightAdminService = flightAdminService;
    }

    // Create new airline
    @RequestMapping(path = "/airline", method = RequestMethod.POST, consumes = "application/json")
    public void saveAirline(@RequestBody Airline airline){
        flightAdminService.saveAirline(airline);
    }

    // Edit existing airline
    @RequestMapping(path = "/airline/{id}", method = RequestMethod.PUT, consumes = "application/json")
    public void editAirline(@PathVariable("id") Long id, @RequestBody Airline airline){
        airline.setId(id);
        flightAdminService.saveAirline(airline);
    }

    // Delete airline
    @RequestMapping(value = "/airline/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteAirline(@PathVariable("id") Long id) {
        flightAdminService.deleteAirlineById(id);
    }

    // List all airlines
    @RequestMapping(value = "/airline", method = RequestMethod.GET)
    public List findAllAirlineList(){
        return flightAdminService.findAllAirlineList();
    }

    // return one airline by its id
    @RequestMapping(path = "/airline/{id}", method = RequestMethod.GET, produces = "application/json")
    public Airline getAirline(@PathVariable("id") Long id){
        Optional<Airline> airline = flightAdminService.findAirlineById(id);
        if(airline.isPresent()) {
            return airline.get();
        }
        throw new RuntimeException("Airline Not Found");
    }

    // Create new airplane
    @RequestMapping(path = "/airplane", method = RequestMethod.POST, consumes = "application/json")
    public void saveAirplane(@RequestBody Airplane airplane){
        flightAdminService.saveAirplane(airplane);
    }

    // Edit existing airplane
    @RequestMapping(path = "/airplane/{id}", method = RequestMethod.PUT, consumes = "application/json")
    public void editAirplane(@PathVariable("id") Long id, @RequestBody Airplane airplane){
        airplane.setId(id);
        flightAdminService.saveAirplane(airplane);
    }

    // Delete airplane
    @RequestMapping(value = "/airplane/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteAirplane(@PathVariable("id") Long id) {
        flightAdminService.deleteAirplaneById(id);
    }

    // List all airplanes
    @RequestMapping(value = "/airplane", method = RequestMethod.GET)
    public List findAllAirplaneList(){
        return flightAdminService.findAllAirplaneList();
    }

    // return one airplane by its id
    @RequestMapping(path = "/airplane/{id}", method = RequestMethod.GET, produces = "application/json")
    public Airplane getAirplane(@PathVariable("id") Long id){
        Optional<Airplane> airplane = flightAdminService.findAirplaneById(id);
        if(airplane.isPresent()) {
            return airplane.get();
        }
        throw new RuntimeException("Airplane Not Found");
    }

    // Create new airport
    @RequestMapping(path = "/airport", method = RequestMethod.POST, consumes = "application/json")
    public void saveAirport(@RequestBody Airport airport){
        flightAdminService.saveAirport(airport);
    }

    // Edit existing airport
    @RequestMapping(path = "/airport/{id}", method = RequestMethod.PUT, consumes = "application/json")
    public void editAirport(@PathVariable("id") Long id, @RequestBody Airport airport){
        airport.setId(id);
        flightAdminService.saveAirport(airport);
    }

    // Delete airport
    @RequestMapping(value = "/airport/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteAirport(@PathVariable("id") Long id) {
        flightAdminService.deleteAirportById(id);
    }

    // List all airports
    @RequestMapping(value = "/airport", method = RequestMethod.GET)
    public List findAllAirportList(){
        return flightAdminService.findAllAirportList();
    }

    // return one airport by its id
    @RequestMapping(path = "/airport/{id}", method = RequestMethod.GET, produces = "application/json")
    public Airport getAirport(@PathVariable("id") Long id){
        Optional<Airport> airport = flightAdminService.findAirportById(id);
        if(airport.isPresent()) {
            return airport.get();
        }
        throw new RuntimeException("Airport Not Found");
    }

    // Create new class
    @RequestMapping(path = "/class", method = RequestMethod.POST, consumes = "application/json")
    public void saveClass(@RequestBody Class _class){
        flightAdminService.saveClass(_class);
    }

    // Edit existing class
    @RequestMapping(path = "/class/{airplaneId}/{className}", method = RequestMethod.PUT, consumes = "application/json")
    public void editAirport(@PathVariable("airplaneId") Long airplaneId, @PathVariable("className") String className,
                            @RequestBody Class _class){
        _class.setClassId(new ClassId(airplaneId, className));
        flightAdminService.saveClass(_class);
    }

    // Delete class
    @RequestMapping(value = "/class/{airplaneId}/{className}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteClass(@PathVariable("airplaneId") Long airplaneId, @PathVariable("className") String className) {
        flightAdminService.deleteClassById(new ClassId(airplaneId, className));
    }

    // List all classes
    @RequestMapping(value = "/class", method = RequestMethod.GET)
    public List findAllClassList(){
        return flightAdminService.findAllClassList();
    }

    // return one class by its id
    @RequestMapping(path = "/class/{airplaneId}/{className}", method = RequestMethod.GET, produces = "application/json")
    public Class getClass(@PathVariable("airplaneId") Long airplaneId, @PathVariable("className") String className){
        Optional<Class> _class = flightAdminService.findClassById(new ClassId(airplaneId, className));
        if(_class.isPresent()) {
            return _class.get();
        }
        throw new RuntimeException("Class Not Found");
    }

    // Create new extra
    @RequestMapping(path = "/extra", method = RequestMethod.POST, consumes = "application/json")
    public void saveExtra(@RequestBody Extra extra){
        flightAdminService.saveExtra(extra);
    }

    // Edit existing extra
    @RequestMapping(path = "/extra/{id}", method = RequestMethod.PUT, consumes = "application/json")
    public void editExtra(@PathVariable("id") Long id, @RequestBody Extra extra){
        extra.setId(id);
        flightAdminService.saveExtra(extra);
    }

    // Delete extra
    @RequestMapping(value = "/extra/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteExtra(@PathVariable("id") Long id) {
        flightAdminService.deleteExtraById(id);
    }

    // List all extras
    @RequestMapping(value = "/extra", method = RequestMethod.GET)
    public List findAllExtraList(){
        return flightAdminService.findAllExtraList();
    }

    // return one extra by its id
    @RequestMapping(path = "/extra/{id}", method = RequestMethod.GET, produces = "application/json")
    public Extra getExtra(@PathVariable("id") Long id){
        Optional<Extra> extra = flightAdminService.findExtraById(id);
        if(extra.isPresent()) {
            return extra.get();
        }
        throw new RuntimeException("Extra Not Found");
    }

    // Create new flight
    @RequestMapping(path = "/flight", method = RequestMethod.POST, consumes = "application/json")
    public void saveFlight(@RequestBody Flight flight){
        flightAdminService.saveFlight(flight);
    }

    // Edit existing flight
    @RequestMapping(path = "/flight/{num}", method = RequestMethod.PUT, consumes = "application/json")
    public void editFlight(@PathVariable("num") Long num, @RequestBody Flight flight){
        flight.setNum(num);
        flightAdminService.saveFlight(flight);
    }

    // Delete flight
    @RequestMapping(value = "/flight/{num}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteFlight(@PathVariable("num") Long num) {
        flightAdminService.deleteFlightById(num);
    }

    // List all flights
    @RequestMapping(value = "/flight", method = RequestMethod.GET)
    public List findAllFlightList(){
        return flightAdminService.findAllFlightList();
    }

    // return one flight by its id
    @RequestMapping(path = "/flight/{id}", method = RequestMethod.GET, produces = "application/json")
    public Flight getFlight(@PathVariable("id") Long id){
        Optional<Flight> flight = flightAdminService.findFlightById(id);
        if(flight.isPresent()) {
            return flight.get();
        }
        throw new RuntimeException("Flight Not Found");
    }

    // Create new pricing
    @RequestMapping(path = "/pricing", method = RequestMethod.POST, consumes = "application/json")
    public void savePricing(@RequestBody Pricing pricing){
        flightAdminService.savePricing(pricing);
    }

    // Edit existing pricing
    @RequestMapping(path = "/pricing/{id}", method = RequestMethod.PUT, consumes = "application/json")
    public void editPricing(@PathVariable("id") Long id, @RequestBody Pricing pricing){
        pricing.setId(id);
        flightAdminService.savePricing(pricing);
    }

    // Delete pricing
    @RequestMapping(value = "/pricing/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deletePricing(@PathVariable("id") Long id) {
        flightAdminService.deletePricingById(id);
    }

    // List all pricing
    @RequestMapping(value = "/pricing", method = RequestMethod.GET)
    public List findAllPricingList(){
        return flightAdminService.findAllPricingList();
    }

    // return one pricing record by its id
    @RequestMapping(path = "/pricing/{id}", method = RequestMethod.GET, produces = "application/json")
    public Pricing getPricing(@PathVariable("id") Long id){
        Optional<Pricing> pricing = flightAdminService.findPricingById(id);
        if(pricing.isPresent()) {
            return pricing.get();
        }
        throw new RuntimeException("Pricing Not Found");
    }

    // Create new seat as well as edit existing seat
    @RequestMapping(path = "/seat", method = RequestMethod.POST, consumes = "application/json")
    public void saveSeat(@RequestBody Seat seat){
        flightAdminService.saveSeat(seat);
    }

    // Edit existing seat
    @RequestMapping(path = "/seat/{className}/{num}", method = RequestMethod.PUT, consumes = "application/json")
    public void editSeat(@PathVariable("className") String className, @PathVariable("num") Long num, @RequestBody Seat seat){
        seat.setSeatId(new SeatId(num, className));
        flightAdminService.saveSeat(seat);
    }

    // Delete seat
    @RequestMapping(value = "/seat/{className}/{num}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteSeat(@PathVariable("className") String className, @PathVariable("num") Long num) {
        flightAdminService.deleteSeatById(new SeatId(num, className));
    }

    // List all seats
    @RequestMapping(value = "/seat", method = RequestMethod.GET)
    public List findAllSeatList(){
        return flightAdminService.findAllSeatList();
    }

    // return one seat by its id
    @RequestMapping(path = "/seat/{className}/{num}", method = RequestMethod.GET, produces = "application/json")
    public Seat getPricing(@PathVariable("className") String className, @PathVariable("num") Long num){
        Optional<Seat> seat = flightAdminService.findSeatById(new SeatId(num, className));
        if(seat.isPresent()) {
            return seat.get();
        }
        throw new RuntimeException("Seat Not Found");
    }

    // Create new record for taxes
    @RequestMapping(path = "/taxes", method = RequestMethod.POST, consumes = "application/json")
    public void saveTaxes(@RequestBody Taxes taxes){
        flightAdminService.saveTaxes(taxes);
    }

    // Edit existing taxes record
    @RequestMapping(path = "/taxes/{id}", method = RequestMethod.PUT, consumes = "application/json")
    public void editTaxes(@PathVariable("id") Long id, @RequestBody Taxes taxes){
        taxes.setId(id);
        flightAdminService.saveTaxes(taxes);
    }

    // Delete taxes
    @RequestMapping(value = "/taxes/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteTaxes(@PathVariable("id") Long id) {
        flightAdminService.deleteTaxesById(id);
    }

    // List all taxes
    @RequestMapping(value = "/taxes", method = RequestMethod.GET)
    public List findAllTaxesList(){
        return flightAdminService.findAllTaxesList();
    }

    // return taxes record by its id
    @RequestMapping(path = "/taxes/{id}", method = RequestMethod.GET, produces = "application/json")
    public Taxes getTaxes(@PathVariable("id") Long id){
        Optional<Taxes> taxes = flightAdminService.findTaxesById(id);
        if(taxes.isPresent()) {
            return taxes.get();
        }
        throw new RuntimeException("Taxes Not Found");
    }
}
