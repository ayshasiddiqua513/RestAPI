package com.example.springapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="empadd")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long addressId;
    String city;
    Integer addressType;
    public Long getAddressId() {
        return addressId;
    }
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Integer getAddressType() {
        return addressType;
    }
    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }
}
