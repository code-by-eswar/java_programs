
import java.util.*;


public class fibanoci
{   //method to print fibanoci series  with n terms
    public void  fibanociseries(int n)
    {
        int first = 0;
        int second = 1;
        for(int i=0;i<=n;i++)
        {
            
        System.out.println(first);
        int next = first+second;
        first = second;
        second = next;
        
        }
        
    }
	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        fibanoci f = new fibanoci();
        f.fibanociseries(n);
	}}
