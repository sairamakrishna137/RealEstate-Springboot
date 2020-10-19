package com.example.realestate.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.example.realestate.RealEstateApplication;
import com.example.realestate.model.RealEstate;
import com.example.realestate.repository.LoanRepository;
import com.example.realestate.service.FileServiceimpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RealEstateApplication.class)
@SpringBootTest
public class RealEstateFileServiceTest {

	@Mock
	private LoanRepository loanRepository;

	@InjectMocks
	private FileServiceimpl fileService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	// save data Test Case 
	@Test
	public void addLoanInfoTest() {

		RealEstate mock = new RealEstate(12, "borrower", "08/18/95", "propAddress", 23, "floodRisk");
		when(loanRepository.save(new RealEstate(12, "borrower", "08/18/95", "propAddress", 23, "floodRisk"))).thenReturn(mock);
		List<RealEstate> realEstateListmock = new ArrayList<RealEstate>();
		RealEstate mocks = new RealEstate(12, "borrower", "08/18/95", "propAddress", 23, "floodRisk");
		realEstateListmock.add(mocks);
		List<RealEstate> result = fileService.addLoanInfo(realEstateListmock);
		assertEquals(realEstateListmock, result);
	}
	
	// list data Test Case 

	@Test
	public void getAllLoanDetailsTest() {
		List<RealEstate> realEstateListmock = new ArrayList<RealEstate>();
		RealEstate mock = new RealEstate(12, "borrower", "08/18/95", "propAddress", 23, "floodRisk");
		realEstateListmock.add(mock);
		when(loanRepository.findAll()).thenReturn(realEstateListmock);
		List<RealEstate> result = fileService.getAllLoanDetails();
		assertEquals(1, result.size());
	}
	
	

}
