import java.io.*;
import java.util.Arrays;

class OMWG {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i=0; i<t; i++) {

        	String x = br.readLine();
            String len1[] = x.split(" ");

            int n = Integer.parseInt(len1[0]);  
            int m = Integer.parseInt(len1[1]);

            System.out.println((n-1)*m + (m-1)*n);
        }
    }
}


            