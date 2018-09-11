package za.co.travelstart.TravelstartWebAppServer.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "seat")
public class Seat implements Serializable {

    @EmbeddedId
    @Column
    private SeatId seatId;

    @Column
    private Boolean seatAvailableFlag = true;

    public Seat() {}

    public Seat(SeatId seatId, Boolean seatAvailableFlag) {
        this.seatId = seatId;
        this.seatAvailableFlag = seatAvailableFlag;
    }

    public SeatId getSeatId() {
        return seatId;
    }

    public void setSeatId(SeatId seatId) {
        this.seatId = seatId;
    }

    public Boolean getSeatAvailableFlag() {
        return seatAvailableFlag;
    }

    public void setSeatAvailableFlag(Boolean seatAvailableFlag) {
        this.seatAvailableFlag = seatAvailableFlag;
    }
}
