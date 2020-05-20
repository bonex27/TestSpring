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
 * @author bonex27
 */
@Entity(name="student_class")
public class StudentClass {
    @Id
    private int id;
    private int idStudent;
    private int idClass;

    public StudentClass(int id, int idStudent, int idClass) {
        this.id = id;
        this.idStudent = idStudent;
        this.idClass = idClass;
    }

    public StudentClass() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }
    
}
