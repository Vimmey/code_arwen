import java.io.*;
import java.util.Arrays;

class MAXDIFF {

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

            int w[] = new int[n];
            int sum1=0,sum2=0,sum11=0,sum22=0;

            for (int j=0; j<n; j++) {
                w[j] = Integer.parseInt(len[j]);
            }

            Arrays.sort(w);

            for (int j=0; j<n; j++) {
                if (j<k)
                    sum1 = sum1 +w[j];
                else
                    sum2 = sum2 +w[j];
            }
            
            for (int j=n-1; j>=0; j--) {
                if (j>(n-k-1))
                    sum11 = sum11 +w[j];
                else
                    sum22 = sum22 +w[j];
            }
            

            // System.out.println(sum1);
            // System.out.println(sum2);
            // System.out.println(sum11);
            // System.out.println(sum22);



            int diff1 = sum1-sum2;
            int diff2 = sum11-sum22;


            System.out.println(Math.max(Math.abs(diff1),Math.abs(diff2)));
        }
    }
}



            

            
