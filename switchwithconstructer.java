import java.util.Scanner;
class switchwithco
{int a;//show on and off
String c;//show color
String s;//show shape
switchwithco(int e,String f,String g)
{a=e;
c=f;
s=g;
}
public void state()
{if(a==0)
{System.out.println("switch is off");}
else
{System.out.println("switch is on");}
}
public void explain()
{System.out.println("switch color is :"+c);
System.out.println("switch shape is :"+s);
}
public static void main(String args[])
{Scanner sc = new Scanner(System.in);
System.out.print("Enter the state of switch 1-(ON),0-(OFFF) : ");
int n1 = sc.nextInt();
System.out.print("Enter the color of switch :");
String n2 = sc.next();
System.out.print("Enter the shape of switch :");
String n3 = sc.next();

System.out.println();
switchwithco s1 = new switchwithco(n1,n2,n3);
s1.state();
s1.explain();
}
}