package com.fisa.gym.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fisa.gym.model.domain.Drink;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long>{

}