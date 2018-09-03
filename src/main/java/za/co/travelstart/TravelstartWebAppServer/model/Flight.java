package za.co.travelstart.TravelstartWebAppServer.model;

import javax.persistence.*;
import java.time.Duration;
import java.util.Date;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @Column
    private Long num;

    @Column
    private Date departDateTime;

    @Column
    private Duration duration;

    @Column
    private Boolean spaceAvailableFlag = true;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "airline_id", nullable = false)
    private Airline airline;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "airport_depart_id", nullable = false)
    private Airport airportDepart;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "airport_arrive_id", nullable = false)
    private Airport airportArrival;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "airplane_id", nullable = false)
    private Airplane airplane;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "taxes_id", nullable = false)
    private Taxes taxes;

    public Flight() {}

    public Flight(Long num, Date departDateTime, Duration duration, Boolean spaceAvailableFlag, Airline airline, Airport airportDepart, Airport airportArrival, Airplane airplane, Taxes taxes) {
        this.num = num;
        this.departDateTime = departDateTime;
        this.duration = duration;
        this.spaceAvailableFlag = spaceAvailableFlag;
        this.airline = airline;
        this.airportDepart = airportDepart;
        this.airportArrival = airportArrival;
        this.airplane = airplane;
        this.taxes = taxes;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Date getDepartDateTime() {
        return departDateTime;
    }

    public void setDepartDateTime(Date departDateTime) {
        this.departDateTime = departDateTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Boolean getSpaceAvailableFlag() {
        return spaceAvailableFlag;
    }

    public void setSpaceAvailableFlag(Boolean spaceAvailableFlag) {
        this.spaceAvailableFlag = spaceAvailableFlag;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Airport getAirportDepart() {
        return airportDepart;
    }

    public void setAirportDepart(Airport airportDepart) {
        this.airportDepart = airportDepart;
    }

    public Airport getAirportArrival() {
        return airportArrival;
    }

    public void setAirportArrival(Airport airportArrival) {
        this.airportArrival = airportArrival;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public Taxes getTaxes() {
        return taxes;
    }

    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
    }
}
