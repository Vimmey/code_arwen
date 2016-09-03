    import java.io.*;

    class NUMGAME2 {

        public static void main(String args[]) throws IOException {

            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            String b = "BOB";
            String a = "ALICE";
            int sum = 0;
                       

            for (int k = 0; k < t; k++) {
                 int count = 1;
                 int v=0;
                 int arr[] = new int[n];                 
                                
                 for(int i=1;i<n;i++)
		           {
			         int p=0;
			         for(int j=2;j<i;j++)
			           {
				        if(i%j==0)
				        p=1;
			           }
			         if(p==0){
				     arr[v]=i;
				     v=v+1;
				     System.out.println(" " +arr[v]);  
		           }}
                        

                   int x=arr[n-1];

                     if (n>0) {
                     	n = n-x;
                     	count++;
                     }
                      if ( count%2 == 0)                      
                        System.out.println(a);  
                      else
                        System.out.println(b);                    


                    
                
            }
        }
    }
