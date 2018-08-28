package za.co.travelstart.TravelstartWebAppServer.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "passenger_type")
public class PassengerType {

    @Id
    @Size(max = 6)
    @Column
    private String name;

    public PassengerType() {}

    public PassengerType(@Size(max = 6) String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
