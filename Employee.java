import java.util.*;
class Employee 
{
	long pan;
	String name;
	double taxincome,tax;

	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Name : ");
		name=sc.next();
		System.out.println("Enter The Pan Number : ");
		pan=sc.nextLong();
		System.out.println("Enter The Taxable Income : ");
		taxincome=sc.nextDouble();
	}

	void cal(){
		if(taxincome>=1000000){
			tax = 50000 + (taxincome - 1000000) * 0.3;
		}
		else if (taxincome>=500001 && taxincome<=1000000)
		{
			tax = 30000 + (taxincome - 500000) * 0.2;
		}
		else if (taxincome>=250001 && taxincome<=500000)
		{
			tax = (taxincome - 250000) * 0.1;
		}
		else
			tax=0;
	}
	void display(){
		System.out.println("Name : "+name);
		System.out.println("Pan  : "+pan);
		System.out.println("Tax Income : "+taxincome);
		System.out.println("Payable Tax : "+tax);

		
	}
	public static void main(String[] args){
		Employee e= new Employee();
		e.input();
		e.cal();
		e.display();

	}
}

