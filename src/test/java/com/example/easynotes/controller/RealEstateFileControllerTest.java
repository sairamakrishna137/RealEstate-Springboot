package com.example.easynotes.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.realestate.RealEstateApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RealEstateApplication.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RealEstateFileControllerTest {

	private MockMvc mockMvc;
	
	@Autowired
    private WebApplicationContext wac;

	@Before
	public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

	}
	
	@Test
	public void verifgetAllLoanDetails() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/loans").accept(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$.loanNo").doesNotExist()).andDo(print());
	}
	
	
	@Test
	public void verifyaddLoanInfo() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.post("/loans")
        .contentType(MediaType.APPLICATION_JSON)
        .content("[\r\n"
        		+ "  {\r\n"
        		+ "    \"loanNo\": 12,\r\n"
        		+ "    \"borrower\": \"test\",\r\n"
        		+ "    \"dateOfBirth\": \"ets\",\r\n"
        		+ "    \"propAddress\": \"s\",\r\n"
        		+ "    \"cost\": 0,\r\n"
        		+ "    \"floodRisk\": \"ss\"\r\n"
        		+ "  }\r\n"
        		+ "]")
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$[0].loanNo").doesNotExist())
		.andExpect(jsonPath("$[0].borrower").doesNotExist())
		.andExpect(jsonPath("$[0].dateOfBirth").doesNotExist())
		.andExpect(jsonPath("$[0].propAddress").doesNotExist())
		.andExpect(jsonPath("$[0].dateOfBirth").doesNotExist())
		.andExpect(jsonPath("$[0].cost").doesNotExist())
		.andExpect(jsonPath("$[0].floodRisk").doesNotExist())
		.andDo(print());
	}
}
