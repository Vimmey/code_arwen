import java.io.*;
import java.util.Arrays;

class ALPHABET {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        String x = br.readLine();
        String len[] = x.split(" ");
        int length1 = x.length();

        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {

        	String x1 = br.readLine();
            String len1[] = x1.split(" ");
            int length2 = x1.length();
            int count = 0;

            for (int j=0; j<length1; j++) {
                for (int k=0; k<length2; k++) {

                	if(x.charAt(j)==x1.charAt(k))
						count++;
				}
			}
			if(count==x1.length())
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}




