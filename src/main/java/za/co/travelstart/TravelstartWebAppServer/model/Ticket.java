package za.co.travelstart.TravelstartWebAppServer.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "reservation_id", nullable = false)
    private Reservation reservation;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "passenger_id", nullable = false)
    private Passenger passenger;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "flight_num", nullable = false)
    private Flight flight;

    // Many to one as a child can sit on an adults lap
    @ManyToOne
    @JoinColumns({
            @JoinColumn(
                    name = "num",
                    referencedColumnName = "num"),
            @JoinColumn(
                    name = "class_name",
                    referencedColumnName = "class_name")
    })
    @Size(max = 2)
    private Seat seat;

    public Ticket() {}

    public Ticket(Reservation reservation, Passenger passenger, Flight flight, Seat seat) {
        this.reservation = reservation;
        this.passenger = passenger;
        this.flight = flight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
