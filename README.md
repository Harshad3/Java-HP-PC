import java.nio.ShortBuffer;
import java.util.Scanner; 
public class yeda {

	public static int mult_table8(){
		//________Creating Multiplication Table of 8__________//
	int c=0;
	for(int i=1;i<=10;i++){
		c = 8*i;
		if (i==10){
			System.out.println("8 X "+i+"= "+c);
		}
		
		else{
			System.out.println("8 X "+i+" = "+c);
		}
		
	}
	return c;
	}
	public void checkpositive(double num){
		
		if (num>0){
			System.out.println("number is positive");
		}else if (num<0){
			System.out.println("number is negative");
		}else {
			System.out.println("number is zero");
		}
	}
	public void quadratic_root(double a, double b,double c){
		//---------Solving Quadratic Equation-------//
		double r1=0;
		double r2=0;
		double r3=0;
		double res=b*b-4*a*c;
		if (res>0){
			r1=(-b+Math.pow(res, 0.5))/(2*a);		//Power function
			r2=(-b-Math.pow(res, 0.5))/(2*a);
		
			System.out.println("Roots are :"+r1+" and "+r2);
			
		}else if(res==0){
			r3=-b/(2*a);
			
			System.out.println("Root is :"+r3);
		}else{
			System.out.println("Equation does not have real roots");
		}
		}
	public int greatest_num(int a, int b, int c){

		int res=0;
		if ((a>b)||(a>c)){
			res=a;
			System.out.println("Greatest num is : "+a);
			
		}else if (b>c){
			res=b;
			System.out.println("Greatest num is : "+b);
		}else {
			res=c;
			System.out.println("Greatest num is : "+c);
		}
		return res;
	}
	public void weekday(int a){
		switch(a){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
	}
 	public void isnumssame(double a, double b){
 		//_________check if two float nos same upto 3 decimal places__________//
 		
 		double c = Math.round(a*1000);
 		c = c/1000;
 		double d = Math.round(b*1000);
 		d = d/1000;
 		if (c==d){
 			System.out.println("Both nos are same");
 		}else{
 			System.out.println("Both nos are different");
 		}
 	}
 	public void array(){
 		int [] a=new int [10];
 		String s1 = "Harshad";
 		String s2 = "Harshad";
 		System.out.println(s1.equals(s2));
 		s1.compareTo(s2);
 		
 		//String Buffer methods
 		StringBuffer x = new StringBuffer("Happy"); 
 		System.out.println("\nString Buffer :"+x);
 		x.append("Harshad");  
 		System.out.println("\nAppend :"+x); 
 		x.insert(0, "Hi");					//inserts at position without deleting existing characters		
 		System.out.println("\nInsert :"+x);
 		x.replace(0, 2, "Bye");			//replace (index to replace at, number of characters to delete, new characters to be replaced with)
 		System.out.println("\nReplace :"+x);
 		x.delete(0, 3);
 		System.out.println("\ndelete :"+x);
 		x.reverse();
 		System.out.println("\nReverse :"+x);
 		x.reverse();
 		System.out.println("\nReverse :"+x);
 		x.capacity();								//Stores spaces for 16 chars at initially(16+length of chars)
 		System.out.println("\nCapacity :"+x.capacity());
 		
 		StringBuilder s = new StringBuilder("aaaaa");
 		
 		System.out.println("\nString Buffer :"+s);
 		s.append("Harshad");  
 		System.out.println("\nAppend :"+s); 
 		s.insert(0, "Hi");					//inserts at position without deleting existing characters		
 		System.out.println("\nInsert :"+s);
 		s.replace(0, 2, "Bye");			//replace (index to replace at, number of characters to delete, new characters to be replaced with)
 		System.out.println("\nReplace :"+s);
 		s.delete(0, 3);
 		System.out.println("\ndelete :"+s);
 		s.reverse();
 		System.out.println("\nReverse :"+s);
 		s.reverse();
 		System.out.println("\nReverse :"+s);
 		s.capacity();								//Stores spaces for 16 chars at initially(16+length of chars)
 		System.out.println("\nCapacity :"+s.capacity());
 		
 		
 	}
 	
	public static void main(String[] args) {
		System.out.println("Output:-\n\n");
					
		Scanner in = new Scanner(System.in);
		yeda y =new yeda();
		//double a = in.nextDouble();
		//double b = in.nextDouble();
		//int c = in.nextInt();
		//int res;
		//yeda.mult_table();
		//y.isnumssame(a, b);
		//y.quadratic_root(a, b, c);
		//y.greatest_num(a, b, c);
		//yeda.mult_table8();
		//y.weekday(a);
		//y.array();
		Test z = new Test();
		
	
	}

}
