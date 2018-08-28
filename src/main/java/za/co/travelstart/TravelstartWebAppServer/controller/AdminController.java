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

    @RequestMapping(path = "/airline", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveAirline(@RequestBody Airline airline){
        flightAdminService.saveAirline(airline);
    }

    @RequestMapping(value = "/airline/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteAirline(@PathVariable("id") Long id) {
        flightAdminService.deleteAirlineById(id);
    }

    @RequestMapping(path = "/airplane", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveAirplane(@RequestBody Airplane airplane){
        flightAdminService.saveAirplane(airplane);
    }

    @RequestMapping(value = "/airplane/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteAirplane(@PathVariable("id") Long id) {
        flightAdminService.deleteAirplaneById(id);
    }

    @RequestMapping(path = "/airport", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveAirport(@RequestBody Airport airport){
        flightAdminService.saveAirport(airport);
    }

    @RequestMapping(value = "/airport/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteAirport(@PathVariable("id") Long id) {
        flightAdminService.deleteAirportById(id);
    }

    @RequestMapping(path = "/class", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveClass(@RequestBody Class _class){
        flightAdminService.saveClass(_class);
    }

    @RequestMapping(value = "/class/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteClass(@PathVariable("id") Long id) {
        flightAdminService.deleteClassById(id);
    }

    @RequestMapping(path = "/extra", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveExtra(@RequestBody Extra extra){
        flightAdminService.saveExtra(extra);
    }

    @RequestMapping(value = "/extra/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteExtra(@PathVariable("id") Long id) {
        flightAdminService.deleteExtraById(id);
    }

    @RequestMapping(path = "/flight", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveFlight(@RequestBody Flight flight){
        flightAdminService.saveFlight(flight);
    }

    @RequestMapping(value = "/flight/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteFlight(@PathVariable("id") Long id) {
        flightAdminService.deleteFlightById(id);
    }

    @RequestMapping(path = "/pricing", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void savePricing(@RequestBody Pricing pricing){
        flightAdminService.savePricing(pricing);
    }

    @RequestMapping(value = "/pricing/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deletePricing(@PathVariable("id") Long id) {
        flightAdminService.deletePricingById(id);
    }

    @RequestMapping(path = "/seat", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveSeat(@RequestBody Seat seat){
        flightAdminService.saveSeat(seat);
    }

    @RequestMapping(value = "/seat/{className}/{num}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteSeat(@PathVariable("className") String className, @PathVariable("num") Long num) {
        flightAdminService.deleteSeatById(new SeatId(num, className));
    }

    @RequestMapping(path = "/taxes", method = {RequestMethod.PUT, RequestMethod.POST } , consumes = "application/json")
    public void saveTaxes(@RequestBody Taxes taxes){
        flightAdminService.saveTaxes(taxes);
    }

    @RequestMapping(value = "/taxes/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteTaxes(@PathVariable("id") Long id) {
        flightAdminService.deleteTaxesById(id);
    }

}
