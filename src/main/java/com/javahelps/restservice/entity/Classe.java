/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javahelps.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author pie
 */
@Entity(name = "class")
public class Classe {
    
    @Id
    private int id;
    private int year;
    private String section;

    public Classe(int id, int year, String section) {
        this.id = id;
        this.year = year;
        this.section = section;
    }

    public Classe() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
