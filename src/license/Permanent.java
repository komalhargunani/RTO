package license;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Permanent  extends Learning implements LicenseDetails {

	String age;
	Calendar futureCal = Calendar.getInstance();
	 
	   
	 
	
	@Override
	public int ageValidate() throws Exception{
	InputStreamReader s=new InputStreamReader(System.in);    
    BufferedReader sr=new BufferedReader(s);
    System.out.println();
    System.out.println("Enter your age: ");    
    age=sr.readLine();
    int i=Integer.parseInt(age);  
    if(i>=18){
        System.out.println();
    	System.out.println("Congrats! you are elegible for Permanent license");
    	Permanent p = new Permanent();
    	p.validateLearningDate();
    	
    	
    }
    else{
    	throw new UserException("oops! Sorry you are below 18 years old");
    	/*System.out.println();
    	System.out.println("oops! Sorry you are below 18 years old");*/
    }
    return i;
    
	}
	
	public Calendar validateLearningDate() throws Exception{
		
		Calendar futureCal = Calendar.getInstance();
		Calendar learningexpirydate = Calendar.getInstance();
		System.out.println();
		System.out.println("Learning License details are as below: ");
		learningexpirydate = Learning.learningLicenseIssued();
		futureCal=learningexpirydate;
		futureCal.add(Calendar.MONTH,6);
	
		
		 
		 
		
		    if(futureCal.after(learningexpirydate)==false){
		    	System.out.println();
		    	System.out.println("Permanent license will get isuue because your learning license is valid");
		    	  System.out.println();
				     System.out.println("Permanent license issue date : " + (futureCal.get(Calendar.MONTH)+ 1)
				                        + "-"
				                        + futureCal.get(Calendar.DATE)
				                        + "-"
				                        + futureCal.get(Calendar.YEAR));
				     
		    	Permanent p = new Permanent();
		    	p.setPermanentExpiry();
		    	p.trial();
		    	p.documentVerification();
		    }
		    else{
		    	//throw new UserException("Your learning license is expired");
		    	System.out.println();
		    	System.out.println("Your learning license is expired");
		    }
		
		
		return futureCal;
		
	}
	
	public Calendar setPermanentExpiry(){
		
		   futureCal.add(Calendar.YEAR, 20);
			 
		    System.out.println();
		     System.out.println("Permanent license expiry date : " + (futureCal.get(Calendar.MONTH)+ 1)
		                        + "-"
		                        + futureCal.get(Calendar.DATE)
		                        + "-"
		                        + futureCal.get(Calendar.YEAR));
		
		
		
		return futureCal;
		//return futureCal;
	}
	
	public void trial(){
		System.out.println();
		System.out.println("your trial is successfull");
		
		
	}
	@Override
	public void documentVerification() {
		System.out.println();
		System.out.println("documents verified for Permanent licence");
		System.out.println("Congrats! your Permanent license is issued");
		
	}

	

}
