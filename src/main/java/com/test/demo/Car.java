package com.test.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Car {

    private @Id @GeneratedValue Long id;
    private String name;
    private String producer;
    private String model;
    private String dateModel;
    private String avgCity;
    private String avgHighway;

    Car() {}

    Car(String name, String model, String dateModel, String avgCity, String avgHighway, String producer) {

        this.name = name;
        this.model = model;
        this.dateModel = dateModel;
        this.avgCity = avgCity;
        this.avgHighway = avgHighway;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDateModel() {
        return dateModel;
    }

    public void setDateModel(String dateModel) {
        this.dateModel = dateModel;
    }

    public String getAvgCity() {
        return avgCity;
    }

    public void setAvgCity(String avgCity) {
        this.avgCity = avgCity;
    }

    public String getAvgHighway() {
        return avgHighway;
    }

    public void setAvgHighway(String avgHighway) {
        this.avgHighway = avgHighway;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}