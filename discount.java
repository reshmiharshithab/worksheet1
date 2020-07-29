
package worksheet.pkg1;

import java.util.Scanner;
public class discount {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the original amount of the project");
        int amt=obj.nextInt();
        System .out.println("enter the percentage of amt to be discounted");
        float dis = obj.nextInt();
        double d=amt-((dis/100)*amt);
        System.out.println("the total amount to be paid"+ d);
        
    }
    
}
