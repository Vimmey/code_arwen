
 class pattern10
{
   public static void main(String args[])
   {
      for (int i=1; i<=5; i++) {
         for (int k=5; k>i-1; k--) {
         System.out.print("\t"); 
       }
         
           for (int j=1; j<=i;j++) {
                       
           
          System.out.print((j+42) + "\t");
       }
          System.out.println();
      
       }
}
}

