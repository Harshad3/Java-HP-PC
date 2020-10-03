
public class Test {

	/**
	 * @param args
	 */
	
	int testvariable;
	
	Test(){
			testvariable = 100;
	}
	
	Test(int value){
		testvariable = value;
}
	
	public void array(){
		System.out.println("We are in Test Class");
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
		Test t = new Test();
		System.out.println("test variable = "+t.testvariable);
		Test s = new Test(20);
		System.out.println("test variable = "+s.testvariable);
	}

}
