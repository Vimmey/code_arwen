import java.io.*;
class FCTRL2 {

	public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
           
			int n = Integer.parseInt(br.readLine());		

			int fact = 1;

			for(int j=1; j<=n; j++) {

				fact = fact*j;
			}
			System.out.println(fact);
		}
	}
}