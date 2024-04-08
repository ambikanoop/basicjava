package basicpractice;

public class largestmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int largestnum=largest(10,19);
int largestnum1=largest(12,17);
System.out.println("the largest number is :"+largestnum);
System.out.println("the largest number is :"+largestnum1);

	}

	public static int largest(int i, int j) {
		int large;
		if(i>j)
			large=i;
		else
			large=j;
		return large;
		
		
		
		// TODO Auto-generated method stub
	
	}

	
	

}
