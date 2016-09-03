import java.io.*;
import java.util.Arrays;

class EGRANDR {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());            
        	String x = br.readLine();
            String len[] = x.split(" ");

            int a[] = new int[n];
            int sum = 0;


            for (int j=0; j<n; j++) {
			    a[j] = Integer.parseInt(len[j]);

			}

			double avg;
            for (int j=0; j<n; j++) {
			     sum = sum + a[j];
			 }

			avg = (double) sum/n;
			int pass1=0,pass2=0;
            
            for (int j=0; j<n; j++) {
				if (a[j] <= 2) {
				    pass1++;
				    break;
				}
			}

             // System.out.println("pass1  " + pass1);

             // System.out.println("avg" + avg);


			for (int j=0; j<n; j++) {
				if (a[j] == 5) {
				    pass2++;
				     break;
				}
			}	
             // System.out.println("pass2  " + pass2);


				if (pass1==0 && pass2>0 && avg>=4.0)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            
        }
    }
}



