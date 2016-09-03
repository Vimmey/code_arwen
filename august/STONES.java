import java.io.*;
import java.util.Arrays;

class STONES {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i=0; i<t; i++) {

            String x = br.readLine();
            String len[] = x.split(" ");

            String x1 = br.readLine();
            String len2[] = x1.split(" ");

            char ja[] = x.toCharArray();
            char sa[] = x1.toCharArray();
            int n = ja.length;
            int m = sa.length;

            int count=0;
            for(int j=0;j<m;j++) {              
                for(int k=0;k<n;k++)
                  {
                    if(sa[j]==ja[k])
                    {
                      count++;
                      break;
                    }
                  }
            }
            System.out.println(count);
          }
        }
      }
                
                  
                