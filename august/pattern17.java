// a  b  c  d  e  
//    f  g  h  i  
//       j  k  l  
//          m  n  
//             o
    class pattern17
{
   public static void main(String args[])
   {
      int a = 1;
      for (int i=5; i>=0; i--) {
         for (int k=5; k>i; k--) {
           System.out.print("\t"); 
         }          
            for (int j=1; j<=i;j++) {
                char c = (char)(a+96) ;  
              System.out.print(c + "\t");
              a++;
            
            }
         
            System.out.println();
      }

   }
}

