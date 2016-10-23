import java.io.*;
import java.util.Arrays;

class PERMEXIS {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-->0) {

            int element = Integer.parseInt(br.readLine());

            String x = br.readLine();
            String result = "YES";
            String len[] = x.split(" ");
            int length1 = len.length;
            int values[] = new int[length1];

            for (int i = 0; i < length1; i++) {
            	values[i] = Integer.parseInt(len[i]);
            }

            Arrays.sort(len);

            for (int i = 1; i < length1; i++) {
               if (values[i] - values[i-1] > 1) {
         		  result = "NO";
         		  break;
               }
            }

            
            System.out.println(result);
        }
    }
}