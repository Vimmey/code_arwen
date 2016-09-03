import java.io.*;
class LUCKFOUR {

	public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
			String x = br.readLine();
			int count = 0;

			int len = x.length();
		    for (int j=0; j<len; j++) {
		    	if (x.charAt(j) == '4')
		    		count++;
		    }

			System.out.println(count);
		}
	}
}

