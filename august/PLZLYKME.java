import java.io.*;
class PLZLYKME {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i=0; i<t; i++) {

            String inputStr[] = br.readLine().split(" "); 

            int l = Integer.parseInt(inputStr[0]);
            int d = Integer.parseInt(inputStr[1]);
            int s = Integer.parseInt(inputStr[2]);
            int c = Integer.parseInt(inputStr[3]);

            d--;
            long likesGot = s;
            
            while (d-->0) { 
                likesGot = likesGot + (likesGot*c);

                if (likesGot >= l) {
                    break;
                }
            }

            if (likesGot >= l) {
                System.out.println("ALIVE AND KICKING");
            } else {
                System.out.println("DEAD AND ROTTING");
            }
        }
    }
}