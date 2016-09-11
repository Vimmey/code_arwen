import java.io.*;
import java.util.Arrays;
class LUCKY5
 {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i=0; i<t; i++) {

            String inputs = br.readLine();
            int count = 0;

            for (int j=0; j<inputs.length(); j++) {
            	if (inputs.charAt(j) != '4' && inputs.charAt(j) != '7' ) {
            		count++;
            	}
            }

            System.out.println(count);
        }
    }
}
