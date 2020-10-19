package com.example.realestate.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "realestate")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class RealEstate {
    @Id
    private long loanNo;

    private String borrower;

    
    private String dateOfBirth;
    
    private String propAddress;
    
    private double cost;
    

    private String floodRisk;
    
    

	public RealEstate() {
		super();
	
	}

	

	public RealEstate(long loanNo, String borrower, String dateOfBirth, String propAddress, double cost,
			String floodRisk) {
		super();
		this.loanNo = loanNo;
		this.borrower = borrower;
		this.dateOfBirth = dateOfBirth;
		this.propAddress = propAddress;
		this.cost = cost;
		this.floodRisk = floodRisk;
	}



	public long getLoanNo() {
		return loanNo;
	}



	public void setLoanNo(long loanNo) {
		this.loanNo = loanNo;
	}



	public String getBorrower() {
		return borrower;
	}



	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getPropAddress() {
		return propAddress;
	}



	public void setPropAddress(String propAddress) {
		this.propAddress = propAddress;
	}






	public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}



	public String getFloodRisk() {
		return floodRisk;
	}



	public void setFloodRisk(String floodRisk) {
		this.floodRisk = floodRisk;
	}



	@Override
	public String toString() {
		return "RealEstate [loanNo=" + loanNo + ", borrower=" + borrower + ", dateOfBirth=" + dateOfBirth
				+ ", propAddress=" + propAddress + ", cost=" + cost + ", floodRisk=" + floodRisk + "]";
	}

	
	


	
   
}
