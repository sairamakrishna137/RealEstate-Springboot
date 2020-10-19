package com.example.realestate.service;

import java.util.List;

import com.example.realestate.model.RealEstate;

public interface FileService {
	
	// get all the loan info from database
	public List<RealEstate> getAllLoanDetails();

	// add the loanInfo into DataBase
	public List<RealEstate> addLoanInfo(List<RealEstate> todo);
}
