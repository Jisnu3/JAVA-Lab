import java.util.*;
class Loan 
{
	int time;
	String name;
	double principle,rate,interest,amt;
	void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle : ");
		principle=sc.nextDouble();
		System.out.println("Enter the Time in Year: ");
		time=sc.nextInt();
	}
	void cal(){
		if(time>=1 && time<=5){
			interest=(principle * .15 * time)/100;
		}
		else if(time>5 && time<=10){
			interest=(principle * .12 * time)/100;		
		}
		else
			interest=(principle * .10 * time)/100;
		
		amt=(principle + interest);
	}
	void display(){
		System.out.println("Interest : "+interest);
		System.out.println("Total Amount : "+amt);
	}

	public static void main(String[] args){
		Loan l=new Loan();
		l.getData();
		l.cal();
		l.display();
	}
}
