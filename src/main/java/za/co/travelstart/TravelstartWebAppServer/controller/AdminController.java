package za.co.travelstart.TravelstartWebAppServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import za.co.travelstart.TravelstartWebAppServer.model.*;
import za.co.travelstart.TravelstartWebAppServer.model.Class;
import za.co.travelstart.TravelstartWebAppServer.service.FlightAdminService;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private FlightAdminService flightAdminService;

    // Create new airline as well as edit existing airline
    @RequestMapping(path = "/airline", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveAirline(@RequestBody Airline airline){
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

    // Create new airplane as well as edit existing airplane
    @RequestMapping(path = "/airplane", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveAirplane(@RequestBody Airplane airplane){
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

    // Create new airport as well as edit existing airport
    @RequestMapping(path = "/airport", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveAirport(@RequestBody Airport airport){
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

    // Create new class as well as edit existing class
    @RequestMapping(path = "/class", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveClass(@RequestBody Class _class){
        flightAdminService.saveClass(_class);
    }

    // Delete class
    @RequestMapping(value = "/class/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteClass(@PathVariable("id") Long id) {
        flightAdminService.deleteClassById(id);
    }

    // List all classes
    @RequestMapping(value = "/class", method = RequestMethod.GET)
    public List findAllClassList(){
        return flightAdminService.findAllClassList();
    }

    // Create new extra as well as edit existing extra
    @RequestMapping(path = "/extra", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveExtra(@RequestBody Extra extra){
        flightAdminService.saveExtra(extra);
    }

    // Delete extra
    @RequestMapping(value = "/extra/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteExtra(@PathVariable("id") Long id) {
        flightAdminService.deleteExtraById(id);
    }

    // List all classes
    @RequestMapping(value = "/extra", method = RequestMethod.GET)
    public List findAllExtraList(){
        return flightAdminService.findAllExtraList();
    }

    // Create new flight as well as edit existing flight
    @RequestMapping(path = "/flight", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveFlight(@RequestBody Flight flight){
        flightAdminService.saveFlight(flight);
    }

    // Delete flight
    @RequestMapping(value = "/flight/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteFlight(@PathVariable("id") Long id) {
        flightAdminService.deleteFlightById(id);
    }

    // List all flights
    @RequestMapping(value = "/flight", method = RequestMethod.GET)
    public List findAllFlightList(){
        return flightAdminService.findAllFlightList();
    }

    // Create new pricing as well as edit existing pricing
    @RequestMapping(path = "/pricing", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void savePricing(@RequestBody Pricing pricing){
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

    // Create new seat as well as edit existing seat
    @RequestMapping(path = "/seat", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveSeat(@RequestBody Seat seat){
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

    // Create new taxes as well as edit existing taxes
    @RequestMapping(path = "/taxes", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveTaxes(@RequestBody Taxes taxes){
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
}
