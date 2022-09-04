package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=30;
		for(int i=2;i<=(n-1);i++)
		{
			if(n%i==0) {
			System.out.println("The Given Number is not a Prime");
			break;
			}
		
		else 
		{
			System.out.println("The Given Number is Prime");
			break;
		}

	
		}
}
}