package stringmethods;

class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
	  super(s);  
	 }  
	}  
	class Validate{  
	  
	   static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	      System.out.println("u cant vote");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(11);  
	      }
	      catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	        
	  }  
	}  