package com.security_project.securityproject.repository;

import com.security_project.securityproject.model.Heroes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroesRepository extends JpaRepository<Heroes, Integer> {

}
