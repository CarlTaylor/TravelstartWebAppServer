package za.co.travelstart.TravelstartWebAppServer.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "taxes")
public class Taxes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(precision=19, scale=2)
    private BigDecimal amount;

    public Taxes() {}

    public Taxes(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
