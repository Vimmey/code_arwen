import java.io.*;
import java.util.Arrays;

class SIMPSTAT {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i=0; i<t; i++) {

        	String x = br.readLine();
            String len1[] = x.split(" ");

            int n = Integer.parseInt(len1[0]);  
            int k = Integer.parseInt(len1[1]);            

            String x1 = br.readLine();
            String len[] = x1.split(" ");

            int a[] = new int[n];
            int sum =0;
            double avg;

            for (int j=0; j<n; j++) {
			    a[j] = Integer.parseInt(len[j]);
			}
			Arrays.sort(a);

			// for (int j=0; j<n; j++) {
   //              System.out.println(a[j]);
   //          }


            for (int p=k; p<n-k; p++)  { 
                 sum = sum + a[p];
            }
                // System.out.println("sum is " +sum);


            avg = (double)sum/(n-(k*2));
            
            System.out.printf("%.6f",avg);
            System.out.println();

        }
    }
}


