
// 1234554321
// 12344321
// 123321
// 1221
// 11

class pattern3
{
   public static void main(String args[])
   {
      for (int i=5; i>0; i--) {
         for (int j=1; j<=i;j++) {
             System.out.print(j);
         }
          
            for (int k=i; k>=1; k--) {
          	  System.out.print(k);   
            }
             System.out.println();
      }

   }
}

