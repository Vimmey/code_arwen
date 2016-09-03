import java.io.*;
class FSQRT {

	public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {

			int num = Integer.parseInt(br.readLine());			

			int sqr = (int) Math.sqrt(num);

			System.out.println(sqr);
		}
	}
}








