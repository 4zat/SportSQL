package org.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "sportsman")
public class Sportsman {

    @Id
    @Column(name = "sportsman_id")
    private int sportsman_id;

    @Column(name = "sportsman_name")
    private String sportsman_name;

    @Column(name = "rank")
    private int rank;

    @Column(name = "year_of_birth")
    LocalDate year_of_birth;

    @Column(name = "personal_record")
    private int personal_record;

    @Column(name = "country")
    private String country;

    public int getSportsman_id() {
        return sportsman_id;
    }

    public void setSportsman_id(int sportsman_id) {
        this.sportsman_id = sportsman_id;
    }

    public String getSportsman_name() {
        return sportsman_name;
    }

    public void setSportsman_name(String sportsman_name) {
        this.sportsman_name = sportsman_name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public LocalDate getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(LocalDate year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public int getPersonal_record() {
        return personal_record;
    }

    public void setPersonal_record(int personal_record) {
        this.personal_record = personal_record;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
