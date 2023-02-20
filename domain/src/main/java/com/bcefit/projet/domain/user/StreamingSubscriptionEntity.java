package com.bcefit.projet.domain.user;

public class StreamingSubscriptionEntity {

    private int id;
    private String name;

    public StreamingSubscriptionEntity() {
    }

    public StreamingSubscriptionEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
