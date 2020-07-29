
package worksheet.pkg1;

import java.util.Scanner;


public class sorting {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
        a[i]=obj.nextInt();
        }
        for(int i=0;i<size-1;i++)
        {
        for(int j=i+1;j<size;j++)
        {
        if(a[i]>a[j])
        {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        }
        }
         for(int i=0;i<size;i++)
        {
        System.out.println(a[i]);
        }
        
        
    }
}
