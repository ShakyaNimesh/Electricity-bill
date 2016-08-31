

package electricitybill;

import java.util.Scanner;


public class Electricitybill {
  


    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Please choose the unit type:\n1.Domestic\n2.Commercial\n3.Institutional");
      int a= sc.nextInt();
      if(a==1){
          System.out.println("Please enter the unit.");
          int b=sc.nextInt();
         double total =b*2.50;
          System.out.println("The total price is: Rs. "+ total);
      }
      else if(a==2){
          System.out.println("Please enter the unit.");
          int b=sc.nextInt();
          double total =b*7.50;
          System.out.println("The total price is: Rs. "+ total);
      }
      else if(a==3){
          System.out.println("Please enter the unit.");
          int b=sc.nextInt();
          double total =b*5.50;
          System.out.println("The total price is: Rs. "+ total);
      }
      
    }
    
}
