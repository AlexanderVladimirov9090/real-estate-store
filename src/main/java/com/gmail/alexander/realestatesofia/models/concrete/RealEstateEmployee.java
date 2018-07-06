package com.gmail.alexander.realestatesofia.models.concrete;

import com.gmail.alexander.realestatesofia.models.abstracts.Properties;
import com.gmail.alexander.realestatesofia.models.costumers.Buyer;
import com.gmail.alexander.realestatesofia.models.costumers.Seller;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

/**
 * Created on 05.07.18.
 *
 * @author Alexander Vladimirov
 * <alexandervladimirov1902@gmail.com>
 */
@Entity
public class RealEstateEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    private String name;
    private String address;
    private String phone;
    @Transient
    private List<Seller> sellers;
    @Transient
    private List<Buyer> buyers;
    @Transient
    private Map<Properties, List<Buyer>> visitedByBuyers;


    public RealEstateEmployee(Long id,
                              String name,
                              String address,
                              String phone,
                              List<Seller> sellers,
                              List<Buyer> buyers,
                              Map<Properties, List<Buyer>> visitedByBuyers) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.sellers = sellers;
        this.buyers = buyers;
        this.visitedByBuyers = visitedByBuyers;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }

    public List<Buyer> getBuyers() {
        return buyers;
    }

    public void setBuyers(List<Buyer> buyers) {
        this.buyers = buyers;
    }

    public Map<Properties, List<Buyer>> getVisitedByBuyers() {
        return visitedByBuyers;
    }

    public void setVisitedByBuyers(Map<Properties, List<Buyer>> visitedByBuyers) {
        this.visitedByBuyers = visitedByBuyers;
    }
}
