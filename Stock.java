import java.util.*;
class Stock 
{
	int noc;
	String title,author,pub;
	
	void getdata(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Title of the Book : ");
		title=sc.nextLine();
		System.out.println("Enter the Author of the Book : ");
		author=sc.nextLine();
		System.out.println("Enter the Publisher of the Book : ");
		pub=sc.nextLine();
		System.out.println("Enter the Number of Copies : ");
		noc=sc.nextInt();

	}

	void purchase(String t, String a, String p, int n){
		if(title.equals(t) && author.equals(a) && pub.equals(p)){
			if(noc>n){
				noc=noc-n;
				System.out.println("Avaliable Boks Are : "+noc);		
			}
			else
				System.out.println("Book is not Avaliable");
		}
		else
			System.out.println("Book is not Found");
	}

	public static void main(String args[])
	{
		Stock s=new Stock();
		s.getdata();
		Scanner sc=new Scanner(System.in);
		System.out.println("Check The Stock is Avaliable or Not");
		System.out.println("ReEnter the Title of the Book : ");
		String t=sc.nextLine();

		System.out.println("ReEnter the Author of the Book : ");
		String a=sc.nextLine();

		System.out.println("ReEnter the Publisher of the Book : ");
		String p=sc.nextLine();

		System.out.println("Enter the Number of Copies : ");
		int n=sc.nextInt();

		s.purchase(t,a,p,n);
	}
}
