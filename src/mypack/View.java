package mypack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class View  {
	
	ArrayList<Customer> arraylist=new ArrayList<>();
	
	public void name()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		String name=sc.nextLine();
	}
	
	 void generatingaccountno()
		{
			long rand = ThreadLocalRandom.current().nextInt(); 
			 System.out.println("your account number is : "+Math.abs(rand));
			 Customer c2=new Customer(null, rand);
			 arraylist.add(c2);
			
		}
	 
	 public static void main(String[] args) {
		View v=new View();
		
		for(int i=0;i<3;i++)
		{
		v.name();
		v.generatingaccountno();
		}
		

	}

}
