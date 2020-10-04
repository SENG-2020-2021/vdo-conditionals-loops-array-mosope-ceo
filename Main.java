class Main{
    public static void main(String[] args) {
     // kindly use appropriate data types for your declaration
     //declare an array variable and assign the days of the month debtor defaulted,

     byte []defaultedDays={5,7,8,15,16,17,30};
     
     // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
    
     float amountPerDay=100.00f;
     float amountPaid=400.00f;

    // declare all the variables needed for your calculations

     float totalToPay=0f;
     byte daysPaidFor;
     float incompleteAmount=0f;
     float amountLeftToPay=0f;
     byte daysNotPaidFor;
     float extraAmount=0f;
    
 
    

    // calculate and print total amount the debtor is to pay using for each loop
			for(byte i: defaultedDays){
				totalToPay+=amountPerDay;
			}
			  System.out.println("total amount debtor is to pay =  $"+totalToPay);
			  
			  
		 
    // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
			
			daysPaidFor=(byte)(amountPaid/amountPerDay);
			  System.out.println("Debtor paid for  "+daysPaidFor+" day(s)");
			 
		   
	        for(int i=0; i<defaultedDays.length &&i<daysPaidFor; i++){
              System.out.println("The "+defaultedDays[i] + "th has been paid for");    
	         
		    }
		  
	        if(amountPaid%amountPerDay>0){  
              incompleteAmount=amountPerDay-(amountPaid%amountPerDay);
              System.out.println("The Incomplete amount in day "+defaultedDays[daysPaidFor]+ " left to pay is $"+incompleteAmount);   
			  System.out.println(" ");
            }
    // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the 	exact amount needed to be paid and print likewise
	
			if(totalToPay>amountPaid) { 
            amountLeftToPay=totalToPay-amountPaid;
              System.out.println("The amount left to pay is "+amountLeftToPay);
			  System.out.println(" ");
			  daysNotPaidFor=(byte)(defaultedDays.length-daysPaidFor);
			  System.out.println("The number of days not paid for are "+daysNotPaidFor+" day(s)"); 
			  System.out.println(" ");
			}	
			else if(totalToPay<amountPaid){
		      extraAmount=amountPaid-totalToPay;
			  System.out.println("you've paid an excess of $"+extraAmount); 
	        }
	   
	        else if(totalToPay==amountPaid){
			  System.out.println("Debt has been fully settled");
	        }
        

  }
  }