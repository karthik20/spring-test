package com.karthik.train.springtest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Participant {
    
    @Id
    private Long id;
    private String name;

    @Column(name = "training_id")
    private Long trainingId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "training_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Training training;

    public Participant() {
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
    public Long getTrainingId() {
        return trainingId;
    }
    public void setTrainingId(Long trainingId) {
        this.trainingId = trainingId;
    }
    public Training getTraining() {
        return training;
    }
    public void setTraining(Training training) {
        this.training = training;
    }
    


}
