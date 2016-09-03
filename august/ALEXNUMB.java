import java.io.*;
class ALEXNUMB
 {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i=0; i<t; i++) {

            long n = Long.parseLong(br.readLine());
            long pairsCount;
            
            String inputs[] = br.readLine().split(" "); 


            if (n < 2) {
                pairsCount = 0;

            } else {
                pairsCount = (n * (n-1)) / 2;
            }

            System.out.println(pairsCount);
        }
    }
}
