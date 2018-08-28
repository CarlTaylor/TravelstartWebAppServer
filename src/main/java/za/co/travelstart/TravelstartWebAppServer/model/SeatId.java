package za.co.travelstart.TravelstartWebAppServer.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SeatId implements Serializable {

    @Column(name="num")
    private Long num;

    @Column(name="class_name")
    private  String className;

    public SeatId() {}

    public SeatId(Long num, String className) {
        this.num = num;
        this.className = className;
    }

    public Long getNum() {
        return num;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeatId)) return false;
        SeatId that = (SeatId) o;
        return Objects.equals(getNum(), that.getNum()) &&
                Objects.equals(getClassName(), that.getClassName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNum(), getClassName());
    }
}
