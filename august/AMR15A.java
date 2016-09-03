import java.io.*;
class AMR15A {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            
        int n = Integer.parseInt(br.readLine());
        String x= br.readLine();
        String a[] = x.split(" ");
        int len = a.length;
        int wpn,even=0,odd=0;
          
        for (int i=0; i<n; i++){
             wpn= Integer.parseInt(a[i]);

            if (wpn%2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        
        if (even > odd) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }
    }
}


          