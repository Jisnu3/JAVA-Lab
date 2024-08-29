import java.util.*;
class Discount 
{
	int cost;
	String name;
	double dc;
	double amt;

	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the Coustomer : ");
		name=sc.nextLine();
		System.out.println("Enter the Cost of the Article : ");
		cost=sc.nextInt();
	}
	void cal(){
		if(cost>15000){
			dc=cost*.20;
		}
		else if(cost>=10001 && cost<=15000){
			dc=cost*.15;
		}
		else if(cost>=5001 && cost<=10000){
			dc=cost*.10;
		}
		else
			dc=0;
	
	amt =cost-dc;
	}
	void display(){
		System.out.println("Name : "+name);
		System.out.println("Cost : "+cost);
		System.out.println("Discount : "+dc);
		System.out.println("Total Amount to be Paid : "+amt);
	}

	public static void main(String[] args){
		Discount d=new Discount();
		d.input();
		d.cal();
		d.display();
	}
}
