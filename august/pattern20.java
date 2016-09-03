// a c e g i 
//   b d f h 
//     k m o 
//       j l 
//         q  
     class pattern20
{
   public static void main(String args[])
   {
      int a = 1;
      int b = 2;
      int x=1;
      char c;
      for (int i=5; i>=0; i--) {

          for (int k=5; k>i; k--) {

           System.out.print("\t"); 
         }          
            for (int j=1; j<=i;j++) {
                if (x%2!=0) 
                {
                c = (char)(a+96) ; 
                 System.out.print(c + "\t");
                 a=a+2;
                }
                else {
                  c = (char)(b+96) ; 
                 System.out.print(c + "\t");
                 b=b+2;
                }                               
                
            }
           x=x+1;
            System.out.println();
          
      }

   }
}