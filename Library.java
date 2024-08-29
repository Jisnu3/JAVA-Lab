import java.util.*;
class Library 
{
	int price,day;
	String name;
	double fine,total;
	
	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the Book : ");
		name=sc.nextLine();
		System.out.println("Enter the Price of the Book : ");
		price=sc.nextInt();
		System.out.println("Enter the retun day of the Book : ");
		day=sc.nextInt();
	}

	void cal(){
		if(day>=1 && day<=7){
			fine=day*.25;
		}
		else if(day>=8 && day<=15){
			fine=day*.40;
		}
		else if(day>=16 && day<=30){
			fine=day*.60;
		}
		else
			fine=day*.80;
		total=price+fine;
	}

	void display(){
		System.out.println("Book Name : "+name);
		System.out.println("Book Price : "+price);
		System.out.println("Fine  : "+fine);
		System.out.println("Total amount to be Paid  : "+total);

	}

	public static void main(String[] args){
		Library l=new Library();
		l.input();
		l.cal();
		l.display();
	}
}
