package com.example.realestate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.realestate.model.RealEstate;
import com.example.realestate.service.FileService;

@RestController
@RequestMapping("/api")
public class FileController {

	@Autowired
	private FileService fileService;

	// add the Loan Info handlers
	@CrossOrigin(origins = "*")
	@PostMapping("/loans")
	public List<RealEstate> addLoanInfo(@Valid @RequestBody List<RealEstate> loan) {
		return fileService.addLoanInfo(loan);
	}

	// get All the Loan Info handlers
	@CrossOrigin(origins = "*")
	@GetMapping("/loans")
	public List<RealEstate> getAllLoanDetails() {
		return fileService.getAllLoanDetails();
	}

}
