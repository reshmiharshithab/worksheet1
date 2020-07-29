
package worksheet.pkg1;

import java.util.Scanner;
public class calc {
    public static void main(String[]args){
        int a=10,b=3;
        Scanner obj=new Scanner(System.in);
        char c=obj.next().charAt(0);
        System.out.println("enter + for addition,- for sub,* for multi,/for division");
        switch(c)
        {
            case'+':System.out.println(a+b);
            break;
            case'-':System.out.println(a-b);
            break;
            case'*':System.out.println(a*b);
            break;
            case'/':System.out.println(a/b);
            break;
            default:
                System.out.println("invalid");
        }
        
    }
    
}
