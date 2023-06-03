package com.driver.model;

import javax.persistence.*;

@Entity
@Table
public class Connection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne
    private User user;

    @ManyToOne
    private ServiceProvider serviceProvider;

    public Connection() {
    }

    public Connection(Integer id, User user, ServiceProvider serviceProvider) {
        Id = id;
        this.user = user;
        this.serviceProvider = serviceProvider;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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
