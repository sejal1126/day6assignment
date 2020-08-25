import java.util.Scanner;
class switchs {
	
	int amp =0;
	String colors;
	String purpose;
	int s;
	switchs(int d,int a,String c,String p)
	{	s=d;
	        colors = c;
		amp =a;
		purpose = p;
	}
	public void state()
	{
		if(s==0)
		{System.out.println("Switch is in off state");
		fail();
		}
		else
		{System.out.println("Switch is in on state");
		explain();
		}
	} 
	
	public void explain()
	{
		System.out.println("Color of switch : "+colors);
		System.out.println("purpose of switch : "+purpose);
		System.out.println("Current : "+amp);
	}
	public void fail()
	{
		System.out.println("Switch is faulted");
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the state of switch :");
		int a = sc.nextInt();
		System.out.print("Enter the color of switch : ");
		String col =sc.next();
		System.out.print("Enter the flow of current : ");
		int amp =sc.nextInt();
		System.out.print("Enter the purpose of switch :");
		String pup =sc.next();
		switchs s1 =new switchs(a,amp,col,pup);
		s1.state();
		switchs s2 =new switchs(a,amp,col,pup);
		s2.state();
		switchs s3 =new switchs(a,amp,col,pup);
		s3.state();
		switchs s4 =new switchs(a,amp,col,pup);
		s4.state();
		switchs s5 =new switchs(a,amp,col,pup);
		s5.state();}


}
