/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javahelps.restservice.repository;

import com.javahelps.restservice.entity.Classe;
import com.javahelps.restservice.entity.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author pietrobonechi
 */
@RepositoryRestResource(path = "studentClass")
public interface StudentClassRepository extends JpaRepository<StudentClass, Integer>{
    
}
