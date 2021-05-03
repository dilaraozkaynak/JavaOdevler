package interfaceAbstractDemo;


import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1= new Customer(1, "Dilara", "�zkaynak", LocalDate.of(1997, 9, 10),"11111111111"); //tc do�ru yaz�nca �al���yor.
		
		Customer customer2=new Customer(2,"Dilara","Kurtulu�",LocalDate.of(1997, 2, 13),"22222222222");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);
		
		//BaseCustomerManager neroCustomerManager=new NeroCustomerManager(new CustomerCheckManager());
		//neroCustomerManager.save(customer2);

	}

}
