package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javahelps.restservice.entity.Classe;

@RepositoryRestResource(path = "/class")
public interface UserRepository extends JpaRepository<Classe, Integer> {

}