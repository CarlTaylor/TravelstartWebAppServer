package za.co.travelstart.TravelstartWebAppServer.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "airplane")
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Size(max = 35)
    @Column
    private String name;

    public Airplane() {}

    public Airplane(@Size(max = 35) String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
