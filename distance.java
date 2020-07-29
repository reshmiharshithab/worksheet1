
package worksheet.pkg1;

import java.util.Scanner;
public class distance {
    public static void main(String[]arg){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the x1,x2,y1,y2");
        float x1=obj.nextFloat();
        float x2=obj.nextFloat();
        float y1=obj.nextFloat();
        float y2=obj.nextFloat();
        double d=Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        System.out.println(""+d);
        
        
        
    }
    
}
