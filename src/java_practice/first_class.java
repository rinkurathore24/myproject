package java_practice;

import java.util.Date;

public class first_class 
{

	public static void main(String[] arg)
	{
      System.out.println("Hello");
      
      /*** variable declaration ***/
      String name;
      int salary;
      String country;
      String dob;
      boolean country_flag;
      int country_bonus = 999;
      
      /*** assign values ***/
      
      name = "sampada";
      salary = 1000;
      country = "canada";
      dob = "15-May-1983";
      country_flag=false;
      System.out.println("Hello my name is " + name + " i am from " + country + " my dob is " + dob);
      
      
      if (country == "india")
      {
    	  country_flag=true;
      }
      
      if (country_flag == true)
      {
    	  System.out.println("Indian citizen");      
      }
      else
      {
    	  System.out.println("Not an indian citizen");  
      }
      
      
      if (country_flag == true)
      {
    	  salary = salary + salary*10/100 + country_bonus;
      }
      else
      {
    	  salary = salary - salary*10/100+ country_bonus*5/100;
      }
	
      if (salary % 2==0)
      {
    	  System.out.println("salary is even");  
      }
      else
      {
    	  System.out.println("salary is odd");  
      }
      
      
      System.out.println("Sampada salary is " + salary);  
      
      
}
}

