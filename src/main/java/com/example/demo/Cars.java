package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 2)
    private String year;

    @NotNull
    @Size(min = 2)
    private String make;

    @NotNull
    @Size(min = 2)
    private String cmodel;

    public Cars(@NotNull @Size(min = 2) String year, @NotNull @Size(min = 2) String make, @NotNull @Size(min = 2) String cmodel) {
        this.year = year;
        this.make = make;
        this.cmodel = cmodel;
    }

    public Cars() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getCmodel() {
        return cmodel;
    }

    public void setCmodel(String cmodel) {
        this.cmodel = cmodel;
    }
}
