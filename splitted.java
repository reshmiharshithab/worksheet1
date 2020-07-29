
package worksheet.pkg1;
import java.util.Scanner;
public class splitted {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter n");
        int n=obj.nextInt();
        int d=0;
        int a[]=new int[10];
        int i=0;
        while(n>0)
        {
            d= n % 10;
            a[i]=d;
            n=n/10;
            i++;
            
        }
    System.out.println("splitted digits");
    for(int j=i-1;j>=0;j--)
    System.out.println(a[j]);
            }
    
}
