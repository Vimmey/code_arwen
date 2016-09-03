 //  1 2 3 4 5 
 // 10 11  12  13  
 //  23  24  25  
 //   40 41  
 //    61  
    class pattern19
{
   public static void main(String args[])
   {
      int a = 1;
      int b=0;
      for (int i=5; i>=0; i--) {

         for (int k=5; k>i; k--) {

           System.out.print(" "); 
         }          
            for (int j=1; j<=i;j++) {
               System.out.print(a + "\t");
               a++;
                     
            }
 
             a=a+4 + 5*b;
             b++;          
            System.out.println();
          
      }

   }
}

