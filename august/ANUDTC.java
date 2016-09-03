import java.io.*;
class ANUDTC {

	public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

		for (int i=0; i<t; i++) {
       		 int n = Integer.parseInt(br.readLine());

            if (360%n == 0) {
                System.out.print("y ");
            } else {
                System.out.print("n ");

            }

             if (n>0 && n<=360) {
                System.out.print("y ");
            } else {
                System.out.print("n ");

            }
            
            int cuts = (n * (n+1)) / 2;
            if (cuts <= 360) {
                System.out.print("y ");
  
            } else {
                System.out.print("n ");

            }

            System.out.println();

        }
    }
}
          




