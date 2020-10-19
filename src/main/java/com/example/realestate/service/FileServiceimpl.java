package com.example.realestate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.realestate.helper.HelperRealEstate;
import com.example.realestate.model.RealEstate;
import com.example.realestate.repository.LoanRepository;

@Service("fileService")
public class FileServiceimpl implements FileService{
	
    @Autowired
    LoanRepository loanRepository;

	@Override
	public List<RealEstate> getAllLoanDetails() {
		 return loanRepository.findAll();
	}

	@Override
	public List<RealEstate> addLoanInfo(List<RealEstate> loan) {
		for (RealEstate realEstate : loan) {
    		if(HelperRealEstate.validateLoanNo(realEstate)) {
    			loanRepository.save(realEstate);
    		}
		}
    	return loan;
	}

}
