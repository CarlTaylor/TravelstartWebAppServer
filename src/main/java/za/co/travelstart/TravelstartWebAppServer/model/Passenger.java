package za.co.travelstart.TravelstartWebAppServer.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "passenger")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 3)
    @Column
    private String title;

    @Size(max = 35)
    @Column
    private String name;

    @Size(max = 35)
    @Column
    private String middleName;

    @Size(max = 35)
    @Column
    private String surname;

    @Column
    private Instant dateOfBirth;

    @Size(max = 254)
    @Email
    @Column
    private String email;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "passenger_type_name", nullable = false)
    private PassengerType passengerType;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "passenger_extra",
            joinColumns = @JoinColumn(name = "passenger_id"),
            inverseJoinColumns = @JoinColumn(name = "extra_id"))
    private Set<Extra> extras = new HashSet<>();

    public Passenger() {}

    public Passenger(@Size(max = 3) String title, @Size(max = 35) String name,
                     @Size(max = 35) String middleName, @Size(max = 35) String surname,
                     Instant dateOfBirth, @Size(max = 254) @Email String email, User user) {

        this.title = title;
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Instant getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Instant dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Extra> getExtras() { return extras; }

    public void setExtras(Set<Extra> extras) { this.extras = extras; }
}
