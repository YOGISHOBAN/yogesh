import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner in=new Scanner(System.in);
 int n=in.nextInt();
 int temp=1;
 
 for(int i=1;i<=n;i++)
 {
	 temp*=i;
	 
 }
 System.out.println(temp);
	}

}
