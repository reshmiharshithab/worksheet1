
package worksheet.pkg1;

import java.util.Scanner;
public class cgpa {
    public static void main(String[]args){
        
        Scanner obj= new Scanner(System.in);
        double m[]=new double[10];
double c[]=new double[10];
double sum=0,csum=0;
System.out.println("Enter number of subjects : ");
int n= obj.nextInt();
for(int i=0;i<n;i++)
{
    System.out.println("Enter grade and credit for "+(i+1)+"Subject ");
    m[i]=obj.nextDouble();
        c[i]=obj.nextDouble();
sum=sum+m[i]+c[i];
csum=csum+c[i];
    
}
System.out.println("CGPA: "+sum/csum);
    }
    
}
