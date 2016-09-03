import java.io.*;
import java.util.Arrays;
class MUFFINS3 {

	public static void main(String agrs[]) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {

		    int n = Integer.parseInt(br.readLine());

			System.out.println((n/2) +1);
		}
	}
}

