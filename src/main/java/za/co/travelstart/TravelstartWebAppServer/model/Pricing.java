package za.co.travelstart.TravelstartWebAppServer.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "pricing")
public class Pricing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "flight_num", nullable = false)
    private Flight flight;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "class_name", referencedColumnName = "class_name", nullable = false),
            @JoinColumn(name="airplane_id", referencedColumnName = "airplane_id",  nullable = false)
    })
    private Class _class;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "passenger_type_name", nullable = false)
    private PassengerType passengerType;

    @Column(name="amount", precision=19, scale=2)
    private BigDecimal amount;

    public Pricing() {}

    public Pricing(Flight flight, Class _class, PassengerType passengerType, BigDecimal amount) {
        this.flight = flight;
        this._class = _class;
        this.passengerType = passengerType;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Class get_class() {
        return _class;
    }

    public void set_class(Class _class) {
        this._class = _class;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
