
import java.util.Scanner;
 
public class factorial
{    
    private static Scanner in;

	public static void main(String[] args)
    {
         
        in = new Scanner(System.in);
        int n,i=1;
        double f=1;
        do{
            System.out.print("Introduir numero positiu o zero : ");
            n=in.nextInt();
        }while(n<0);
        for(i=1;i<=n;i++)
            f=f*i;
        System.out.println("El factorial es : "+f);
        
        System.out.println("Jose Portatil");
    }
}