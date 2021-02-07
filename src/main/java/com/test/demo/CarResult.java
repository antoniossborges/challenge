package com.test.demo;

public class CarResult implements Comparable<CarResult>{

    private String name;
    private String producer;
    private String model;
    private String dateModel;
    private Double totalLitersSpent;
    private Double totalSpentReal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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

    public Double getTotalLitersSpent() {
        return totalLitersSpent;
    }

    public void setTotalLitersSpent(Double totalLitersSpent) {
        this.totalLitersSpent = totalLitersSpent;
    }

    public Double getTotalSpentReal() {
        return totalSpentReal;
    }

    public void setTotalSpentReal(Double totalSpentReal) {
        this.totalSpentReal = totalSpentReal;
    }

    @Override
    public int compareTo(CarResult carResult) {
        if (this.totalLitersSpent > carResult.getTotalLitersSpent()) {
            return 1;
        } if (this.totalLitersSpent < carResult.getTotalLitersSpent()) {
            return -1;
        }
        return 0;
    }
}
