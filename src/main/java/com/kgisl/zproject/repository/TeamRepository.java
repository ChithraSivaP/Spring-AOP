package com.kgisl.zproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.zproject.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team,Integer>{
    
}
