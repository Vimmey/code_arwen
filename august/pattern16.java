// abcde
//  abcd
//   abc
//    ab
//     a

class pattern16
{
   public static void main(String args[])
   {
      for (int i=5; i>=0; i--) {
         for (int k=5; k>i; k--) {
              System.out.print(" "); 
              } 
         for (int j=1; j<=i;j++) {
            char c = (char)(j+96) ; 
           System.out.print(c);
            
            }
         
            System.out.println();
      }

   }
}

