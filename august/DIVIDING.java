import java.io.*;
import java.util.Arrays;

class DIVIDING {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());   
        String x = br.readLine();
        String len1[] = x.split(" ");   
        int a[] = new int[n];  
        int sum1 = 0, sum2 = 0;
        
        for (int i=0; i<n; i++) {       

            a[i] = Integer.parseInt(len1[i]);
            sum1 = sum1 + (i+1);
            sum2 = sum2 +a[i];
        }

        if (sum1 == sum2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}





