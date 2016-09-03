import java.io.*;
class COLOR {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());            
            String x1 = br.readLine();
            String len1[] = x1.split(" ");

            int r = 0, g = 0, b = 0, sum = 0;

            for (int j=0; j<n; j++) {
                 if (x1.charAt(j) == 'R')
                     r++;

                 else if (x1.charAt(j) == 'B')
                    b++;
                 
                else if (x1.charAt(j) == 'G')
                    g++;
            }
            // System.out.println(r + " "+g+ " " +b);



            if (r>=g && r>=b)
                sum = n-r;
            else if (g>=r && g>=b)
                sum = n-g;
            else
                sum = n-b;
                        
            System.out.println(sum);
        }
    }
}

