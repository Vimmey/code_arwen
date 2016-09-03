import java.io.*;
import java.util.Arrays;

class CHN09 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int j=0; j<t; j++)  {
        	String str = br.readLine();
        	int len = str.length();;
        	int p=0,q=0;

            for (int i=0; i<len; i++)  {
                if (str.charAt(i) == 'a')
                    p++;
                 else
                 	q++;
            }

            if (p > q)
                System.out.println(len-p);  
            else
                System.out.println(len-q);  
        }
    }
}


