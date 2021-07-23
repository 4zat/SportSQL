package org.example.entity;


import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "competition")
public class Competition {

    @Id
    @Column(name = "competition_id")
    private int competition_id;

    @Column(name = "competition_name")
    private String competition_name;

    @Column(name = "world_record")
    private int world_record;

    @Column(name = "set_date")
    private LocalDate set_date;

    public int getCompetition_id() {
        return competition_id;
    }

    public void setCompetition_id(int competition_id) {
        this.competition_id = competition_id;
    }

    public String getCompetition_name() {
        return competition_name;
    }

    public void setCompetition_name(String competition_name) {
        this.competition_name = competition_name;
    }

    public int getWorld_record() {
        return world_record;
    }

    public void setWorld_record(int world_record) {
        this.world_record = world_record;
    }

    public LocalDate getSet_date() {
        return set_date;
    }

    public void setSet_date(LocalDate set_date) {
        this.set_date = set_date;
    }
}
