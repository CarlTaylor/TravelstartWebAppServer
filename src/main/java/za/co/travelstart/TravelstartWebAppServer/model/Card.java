package za.co.travelstart.TravelstartWebAppServer.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.time.Instant;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Size(min = 14, max = 16)
    @Column
    private BigInteger num;

    @Size(max = 35)
    @Column
    private String nickName;

    @Size(max = 35)
    @Column
    private String nameOnCard;

    @Column
    private Instant expirationDate;

    @Size(max = 95)
    private String billAddress;

    @Size(max = 10)
    @Column
    private String billPostalCode;

    @Size(max = 35)
    private String billCity;

    @Size(max = 35)
    @Column
    private String billCountry;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Card() {}

    public Card(@Size(min = 14, max = 16) BigInteger num, @Size(max = 35) String nickName,
                @Size(max = 35) String nameOnCard, Instant expirationDate,
                @Size(max = 95) String billAddress, @Size(max = 10) String billPostalCode,
                @Size(max = 35) String billCity, @Size(max = 35) String billCountry, User user) {

        this.num = num;
        this.nickName = nickName;
        this.nameOnCard = nameOnCard;
        this.expirationDate = expirationDate;
        this.billAddress = billAddress;
        this.billPostalCode = billPostalCode;
        this.billCity = billCity;
        this.billCountry = billCountry;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigInteger getNum() {
        return this.num;
    }

    public void setNum(BigInteger num) {
        this.num = num;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public Instant getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Instant expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress;
    }

    public String getBillPostalCode() {
        return billPostalCode;
    }

    public void setBillPostalCode(String billPostalCode) {
        this.billPostalCode = billPostalCode;
    }

    public String getBillCity() {
        return billCity;
    }

    public void setBillCity(String billCity) {
        this.billCity = billCity;
    }

    public String getBillCountry() {
        return billCountry;
    }

    public void setBillCountry(String billCountry) {
        this.billCountry = billCountry;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
