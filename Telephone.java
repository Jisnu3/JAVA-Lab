import java.util.*;
class Telephone 
{
	int pre,prv,call;
	String name;
	double amt,total;
	
	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the Coustomer : ");
		name=sc.nextLine();
		System.out.println("Enter the Present Reading : ");
		pre=sc.nextInt();
		System.out.println("Enter the Previous Reading : ");
		prv=sc.nextInt();
		call=pre-prv;
	}
	void cal(){
		if(call<=100){
			amt=0;
		}
		else if(call<=200){
			amt=(call-100)*.90;
		}
		else if(call<=400){
			amt=(100*.90)+(call-200)*.80;
		}
		else
			amt=(100*.90)+(200*.80)+(call-400)*.70;
	
	total =amt+180;
	}
	void display(){
		System.out.println("Name : "+name);
		System.out.println("Calls Made : "+call);
		System.out.println("Amount : "+amt);
		System.out.println("Total Amount : "+total);
	}

	public static void main(String[] args){
		Telephone t=new Telephone();
		t.input();
		t.cal();
		t.display();
	}
}
