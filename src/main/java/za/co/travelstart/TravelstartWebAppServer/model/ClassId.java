package za.co.travelstart.TravelstartWebAppServer.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ClassId  implements Serializable {

    @Column(name="airplane_id")
    private Long airplaneId;

    @Column(name="class_name")
    private String className;

    public ClassId() {}

    public ClassId(Long airplaneId, String className) {
        this.airplaneId = airplaneId;
        this.className = className;
    }

    public Long getAirplaneId() {
        return airplaneId;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassId)) return false;
        ClassId that = (ClassId) o;
        return Objects.equals(getAirplaneId(), that.getAirplaneId()) &&
                Objects.equals(getClassName(), that.getClassName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAirplaneId(), getClassName());
    }
}
