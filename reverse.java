
package worksheet.pkg1;

import java.util.Scanner;
public class reverse {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        int a[]=new int[5];
        for(int i =0;i<5;i++)
        {
        a[i]=obj.nextInt();
        
        }
        for(int i=4;i>=0;i--)
        {
        System.out.println(a[i]);
        }
        
                
    }
    
}
