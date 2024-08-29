import java.util.*;
class Honda 
{
	int type,cost;
	double newcost;
	void gettype(){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter The type of Engine (2 for 2 stroke , 4 for 4 stroke)");
			type=sc.nextInt();
			if(type==2 || type==4){
			System.out.println("Enter The Cost : ");
			cost=sc.nextInt();
		}
		else{
			System.out.println("Cannot print cost due to invalid engine type.");
		}
	}

	void find(){
		if(type==2){
			newcost=cost+(.10*cost);
		}
		else if(type==4){
			newcost=cost+(.12*cost);
		}
		else{
			System.out.println("Invalid Vehicle Type ");
		}
	}
	void printcost(){
			System.out.println("Type of Engine"+type+" Stoke");
			System.out.print("New cost of the vehicle : "+newcost);
	}
	public static void main(String[] args){
		Honda h= new Honda();
		h.gettype();
		h.find();
		h.printcost();

	}
}

