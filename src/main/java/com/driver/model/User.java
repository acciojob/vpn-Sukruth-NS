package com.driver.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String password;
    private String originalIp;
    private String maskedIP;

    private Boolean connected;

    @ManyToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private List<ServiceProvider> serviceProvidersList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Connection> connectionList;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Country country;

    public User() {
    }

    public User(Integer id, String username, String password, String originalIp, String maskedIP, Boolean connected, List<ServiceProvider> serviceProvidersList, List<Connection> connectionList, Country country) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.originalIp = originalIp;
        this.maskedIP = maskedIP;
        this.connected = connected;
        this.serviceProvidersList = serviceProvidersList;
        this.connectionList = connectionList;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOriginalIp() {
        return originalIp;
    }

    public void setOriginalIp(String originalIp) {
        this.originalIp = originalIp;
    }

    public String getMaskedIP() {
        return maskedIP;
    }

    public void setMaskedIP(String maskedIP) {
        this.maskedIP = maskedIP;
    }

    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    public List<ServiceProvider> getServiceProvidersList() {
        return serviceProvidersList;
    }

    public void setServiceProvidersList(List<ServiceProvider> serviceProvidersList) {
        this.serviceProvidersList = serviceProvidersList;
    }

    public List<Connection> getConnectionList() {
        return connectionList;
    }

    public void setConnectionList(List<Connection> connectionList) {
        this.connectionList = connectionList;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
