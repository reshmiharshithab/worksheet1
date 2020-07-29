
package worksheet.pkg1;
import java.util.Scanner;


public class greatest {
    public static void main (String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a= obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        if (a>b && a>c)
            System.out.println("a is greater");
        else if(b>a && b>c)
            System.out.println("b is greater");
        else 
            System.out.println("c is greater");
        
    }
    
}
