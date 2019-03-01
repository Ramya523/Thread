package mypack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Cust implements Callable
{
	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		int i=0;
		ExecutorService  s=Executors.newFixedThreadPool(3);
		ArrayList<Future<String>> arraylist=new ArrayList<>();
		Callable task=new Cust();
		for(i=0;i<3;i++)
		{
			Future obj=s.submit(task);
			arraylist.add(obj);
		}
		
		for(Future<String> obj1: arraylist)
		{
			System.out.println(obj1.get());
		}
		
	}

	 String name;
	
	public String call()
	{
		Scanner sc=new Scanner(System.in);
		this.name=sc.nextLine();
		return name;
	}

}
