package interfaceAbstractDemo;


import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1= new Customer(1, "Munise Dilara", "Özkaynak", LocalDate.of(1997, 9, 10),"35182374496"); //tc doðru yazýnca çalýþýyor.
		
		Customer customer2=new Customer(2,"Timurhan","Kurtuluþ",LocalDate.of(1997, 2, 13),"58318353196");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer2);
		
		//BaseCustomerManager neroCustomerManager=new NeroCustomerManager(new CustomerCheckManager());
		//neroCustomerManager.save(customer2);

	}

}
