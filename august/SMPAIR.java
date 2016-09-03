import java.io.*;
import java.util.Arrays;
class SMPAIR {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int k=0; k<t; k++)  {
        	int n = Integer.parseInt(br.readLine());
        	int sum = 0;
        	String x = br.readLine();
        	String y[] = x.split(" ");
 
        	int num[] = new int[n]; 

        	for(int i=0;i<n;i++) {
        		num[i] = Integer.parseInt(y[i]); 
        	}

        	Arrays.sort(num);
            sum = num[0] + num[1];

            System.out.println(sum); 
        }
    }
} 



