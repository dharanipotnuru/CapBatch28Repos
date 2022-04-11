package controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Address;
import model.Employee;

public class TestEmployee {
	
	public static void main(String[] args) {
		   Employee e=new Employee(); //new
		   Scanner scanner=new Scanner(System.in);
		   System.out.println("Enter emp id");
		   int id=Integer.parseInt(scanner.nextLine());
		   System.out.println("enter employee name");
		   String name =scanner.nextLine();
		   System.out.println("Enter emp salary");
		  double sal=Double.parseDouble(scanner.nextLine());
		  System.out.println("Enter emp mail id");
		 String mailId=scanner.nextLine();
		   e.setEmpId(id);
		   e.setEmpMailId(mailId);
		   e.setEmpName(name);
		   e.setEmpSalary(sal);
		   
		   System.out.println("Enter city name");
		   String city=scanner.nextLine();
		   System.out.println("Enter pin code");
		   long pin=Long.parseLong(scanner.nextLine());
		   System.out.println("Enter district name");
		   String dis=scanner.nextLine();
		   System.out.println("Enter state name");
		   String state=scanner.nextLine();
		   
		   
		   /*
		    *Class.forName( 
		    * Connection con=DriverMangager.getConnection(url, user, name)
		    *    con.prepareStatement()
		    * 
		    */
		   
		   Address  address=new Address();
		   address.setCityName(city);
		   address.setDistrict(dis);
		   address.setPinCode(pin);
		   address.setState(state);
		   
		   e.setAddress(address);
		   
		   
		   EntityManagerFactory factory=Persistence.createEntityManagerFactory("PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		//whichb is used to persistv the entity object into persistence conetxt
		em.persist(e);

		em.getTransaction().commit();
	
	

}
}