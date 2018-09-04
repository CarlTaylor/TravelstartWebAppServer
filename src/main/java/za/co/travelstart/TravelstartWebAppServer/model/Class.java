package za.co.travelstart.TravelstartWebAppServer.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "class")
public class Class  implements Serializable {

    @EmbeddedId
    @Column
    private ClassId classId;

    @Column
    private Long maxSeats;

    @Column
    private Boolean spaceAvailableFlag = true;

    public Class() {}

    public ClassId getClassId() {
        return classId;
    }

    public void setClassId(ClassId classId) {
        this.classId = classId;
    }

    public Long getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(Long maxSeats) {
        this.maxSeats = maxSeats;
    }

    public Boolean getSpaceAvailableFlag() {
        return spaceAvailableFlag;
    }

    public void setSpaceAvailableFlag(Boolean spaceAvailableFlag) {
        this.spaceAvailableFlag = spaceAvailableFlag;
    }
}
