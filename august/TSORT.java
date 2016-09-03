import java.io.*;
import java.util.Arrays;
class TSORT {

	public static void main(String agrs[]) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		
		int a[]=new int[t];
		int temp;

		for (int k=0; k<t; k++) {
		
			 a[k] = Integer.parseInt(br.readLine());        
			//System.out.println(a[k]);
		}

		
		Arrays.sort(a);
		
		for (int k = 0; k < t; k++) {
			System.out.println(a[k]);
		}

  	}
}




