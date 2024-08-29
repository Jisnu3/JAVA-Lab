import java.util.*;
class Mobike 
{
	int day,charge;
	long phno;
	String name,bno;	
	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Coustomer Name : ");
		name=sc.nextLine();
		System.out.println("Enter the Bike Number : ");
		bno=sc.nextLine();
		System.out.println("Enter the Phone Number : ");
		phno=sc.nextLong();
		System.out.println("Enter the number of days the bike is taken on rent : ");
		day=sc.nextInt();
	}

	void compute(){
		if(day<=5){
			charge=500*day;
		}
		else if(day<=10){
			charge=(5*500)+((day-5)*400);
		}
		else
			charge=(5*500)+(5*400)+((day-10)*200);
	}

	void display(){
		System.out.println("Coustomer Name : "+name);
		System.out.println("Bike Number    : "+bno);
		System.out.println("Phone Number   : "+phno);
		System.out.println("No Of Day      : "+day);
		System.out.println("Total Charges  : "+charge);

	}

	public static void main(String[] args){
		Mobike m=new Mobike();
		m.input();
		m.compute();
		m.display();
	}
}
