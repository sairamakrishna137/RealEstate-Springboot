package com.example.realestate.repository;

import com.example.realestate.model.RealEstate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoanRepository extends JpaRepository<RealEstate, Long> {

}
