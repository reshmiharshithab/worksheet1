
package worksheet.pkg1;
import java.util.Scanner;

        


public class fibonocci {
    public static void main(String[]args){
        int a=0,b=1,n=10,i=0;
        int c=0;
        for(i=0;i<=n;i++)
        {
            c=0;
         c=a+b;
        System.out.println(""+c);
            a=b;
            b=c;
        }
    }
    
}
