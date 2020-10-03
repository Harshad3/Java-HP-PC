import java.util.Scanner;
public class edabitHard {

	/**
	 * @param args
	 */
	
	public void primenos(){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter no. to count prime nos in that ");
	int total = in.nextInt();
	int count = 0;
	if(total<=6){
		count=0;
	}else{
		count=2;
	}
	
	for(int i=0;i<=total;i++){
		
		if (total==0 || total==1){
			count = 0;
			break;
		}else if (total==2){
			count=1;
			break;
		}else if (total==3||total==4){
			count=2;
			break;
		}else if(total==5||total==6){
			count =3;
			break;
		}else if(i%2==0 || i%3==0 || i%4==0 || i%5==0){
			
			}else{
				count++;				
			}
		}
	
	System.out.println("total  = "+total+"\nNo. of primes = "+count);
		
	}
	
	public int nextnum(int n1){
		int n2 = n1+1;
		System.out.println(n2);
		return n2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		edabitHard a1 = new edabitHard();
		
		
		//a1.primenos();
		
		a1.nextnum(-5);

	}
	
	
	
	

}
