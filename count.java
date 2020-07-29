
package worksheet.pkg1;

import java.util.Scanner;
public class count {
    public static void main(String[]args){
        Scanner obj = new Scanner (System.in);
        System.out.println("enter the number of times the loop should run");
        int n=obj.nextInt();
        int pos=0,neg=0,z=0;
        
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the number");
            int c=obj.nextInt();
            if (c>0)
                pos++;
            else if (c<0)
                neg++;
            else
                z++;
        
                
                
        }
        System.out.println("number of positive numbers"+pos);
    }
    
}
