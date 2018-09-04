package za.co.travelstart.TravelstartWebAppServer.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ClassId  implements Serializable {

    @Column(name="name")
    private String name;

    @Column(name="airplane_id")
    private  Long airplaneId;

    public ClassId() {}

    public ClassId(String name, Long airplaneId) {
        this.name = name;
        this.airplaneId = airplaneId;
    }

    public String getName() {
        return name;
    }

    private Long getAirplaneId() {
        return airplaneId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassId)) return false;
        ClassId that = (ClassId) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getAirplaneId(), that.getAirplaneId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAirplaneId());
    }
}
