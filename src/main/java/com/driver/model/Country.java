package com.driver.model;// Note: Do not write @Enumerated annotation above CountryName in this model.

import javax.persistence.*;

@Entity
@Table
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private CountryName countryName;

    private String code;

    @OneToOne
    private User user;

    @ManyToOne
    private ServiceProvider serviceProvider;

    public Country() {
    }

    public Country(Integer id, CountryName countryName, String code, User user, ServiceProvider serviceProvider) {
        Id = id;
        this.countryName = countryName;
        this.code = code;
        this.user = user;
        this.serviceProvider = serviceProvider;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public CountryName getCountryName() {
        return countryName;
    }

    public void setCountryName(CountryName countryName) {
        this.countryName = countryName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}