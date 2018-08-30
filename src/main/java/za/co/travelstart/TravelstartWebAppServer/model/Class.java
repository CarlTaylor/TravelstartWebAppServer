package za.co.travelstart.TravelstartWebAppServer.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "class")
public class Class {

    @Id
    @Size(max = 35)
    @Column
    private String name;

    @Column
    private Integer maxSeats;

    @Column
    private Boolean spaceAvailableFlag = true;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "airplane_id", nullable = false)
    private Airplane airplane;

    public Class() {}

    public Class(@Size(max = 35) String name, Integer maxSeats,
                 Boolean spaceAvailableFlag, Airplane airplane) {

        this.name = name;
        this.maxSeats = maxSeats;
        this.spaceAvailableFlag = spaceAvailableFlag;
        this.airplane = airplane;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(Integer maxSeats) {
        this.maxSeats = maxSeats;
    }

    public Boolean getSpaceAvailableFlag() {
        return spaceAvailableFlag;
    }

    public void setSpaceAvailableFlag(Boolean spaceAvailableFlag) {
        this.spaceAvailableFlag = spaceAvailableFlag;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
}
