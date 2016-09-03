import java.io.*;
import java.util.Arrays;

class TWEED {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i=0; i<t; i++) {

        	String x = br.readLine();
            String len[] = x.split(" ");

            int n = Integer.parseInt(len[0]); 
            String x1 = len[1];

            String x2 = br.readLine();
            String len1[] = x2.split(" ");
            int a[] = new int[n];

            for (int j=0; j<n; j++) {
                  a[j] = Integer.parseInt(len1[j]);
            }

            if(x1.equals("Dee") && n == 1 && a[0]%2 == 0)
		        System.out.println("Dee");
		    else
		        System.out.println("Dum");
		}
	}
}
