
// abcde
// bcde
// cde
// de
// e

class pattern15
{
   public static void main(String args[])
   {
      for (int i=1; i<=5; i++) {
         for (int j=i; j<=5;j++) {
            char c = (char)(j+96) ;  
             System.out.print(c);
         }
            System.out.println();
      }

   }
}

