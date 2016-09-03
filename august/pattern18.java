// 1 2 3 4 5 
//   9 10  11  12  
//     16  17  18  
//       22  23  
//         27   

     class pattern18
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
              System.out.print(a + "\t");
              a++;       
            }
             a=a+3;

            System.out.println();
      }

   }
}

