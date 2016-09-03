
//     5
//    45
//   345
//  2345
// 12345

import java.util.Scanner;
 
class pattern7
{
   public static void main(String args[])
   {
      for (int i=5; i>0; i--) {
         for (int k=i-1; k>0;k--) {
         System.out.print(" "); 
         }
           for (int j=i; j<=5;j++) {
                       
           
          System.out.print(j);
       }
          System.out.println();
      
       }
}
}

