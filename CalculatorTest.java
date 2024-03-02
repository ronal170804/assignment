package assignment;

import java.util.Scanner;

public class CalculatorTest {
	
	double principal;
    double rate;
    double time;
    double amount;
    double maxMarks;
    double marksObtained;

    
    public double getPrincipal() {
    	return principal;
    						     }

    public void setPrincipal(double principal) {
    	this.principal = principal;
    											}

    public double getRate() {
        return rate;
    						}

    public void setRate(double rate) {
    	this.rate = rate;
    								 } 
    
    public double getTime() {
        return time;
    						}

    public void setTime(double time) {
    	this.time = time;
    								 }

    public double getAmount() {
        return amount;
    						  }

    public void setAmount(double amount) {
        this.amount = amount;
    									}
    
    public double getMaxMarks() {
        return maxMarks;
    							}

    public void setMaxMarks(double totalMarks) {
        this.maxMarks = totalMarks;
    											}

    public double getMarks() {
        return marksObtained;
    						}

    public void setMarks(double obtainedMarks) {
        this.marksObtained = obtainedMarks;
    											}

    public double simpleInterest() {
        amount = (principal * rate * time)/100; 
        
        return amount;
    							   }
    
    public double compoundInterest() {
        amount = principal * Math.pow((1 + rate), time);
        double result = amount - principal;
        return result;
    								 }
    
    public double mean() {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter number of values:");        
		int n = scanner .nextInt();
        double[] numbers = new double[n];
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }
    	
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        						   }
        double result = sum / numbers.length;
        
        return result;
    						}
    
    public double factorial(int n) {
        
    	int fact = 1;
    	for(int i=1; i<=n; i++) {
    	  fact = fact * i;
    							}
    	return fact;
  								}
    
    public double percentage() {
       double result =  (marksObtained * 100)/maxMarks;
       return result;
    						   }
    
    public void show1() {
    	System.out.println("Enter Principal Amount, Rate, Time:");
    					  }
    
    public void show2() {
    	System.out.println("Enter max marks and marks obtained:");
    					  }

}
