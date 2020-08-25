import java.util.Scanner;
public class switchwithobj
{public static void main(String args[]) {
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
