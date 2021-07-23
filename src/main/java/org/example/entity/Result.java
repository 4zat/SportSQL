package org.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "result")
public class Result {

    @Column(name = "competition_id")
    private int competition_id;

    @Id
    @Column(name = "sportsman_id")
    private int sportsman_id;

    @Column(name = "result")
    private int result;

    @Column(name = "city")
    private String city;

    @Column(name = "hold_date")
    private LocalDate hold_date;

    public int getCompetition_id() {
        return competition_id;
    }

    public void setCompetition_id(int competition_id) {
        this.competition_id = competition_id;
    }

    public int getSportsman_id() {
        return sportsman_id;
    }

    public void setSportsman_id(int sportsman_id) {
        this.sportsman_id = sportsman_id;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getHold_date() {
        return hold_date;
    }

    public void setHold_date(LocalDate hold_date) {
        this.hold_date = hold_date;
    }
}
