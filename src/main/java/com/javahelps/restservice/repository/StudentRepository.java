/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javahelps.restservice.repository;

import com.javahelps.restservice.entity.Classe;
import com.javahelps.restservice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author pietrobonechi
 */
@RepositoryRestResource(path = "student")
public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
