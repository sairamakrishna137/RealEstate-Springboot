package com.example.realestate.helper;

import com.example.realestate.model.RealEstate; 

public class HelperRealEstate {
	
	  public static boolean validateLoanNo(Object obj) {
	        RealEstate p = (RealEstate) obj;
	        if (p.getLoanNo()==0) {
	            return false;
	        }
	        return true;
	    }
	  
}
