import java.io.*;
import java.util.Arrays;
class LCH15JAB {

	public static void main(String agrs[]) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

		for (int i=0; i<t; i++) {

            String x = br.readLine();
		    int count = 0;

            for(int j=0; j<x.length(); j++) {
            
                for(int k=0; k<x.length(); k++)
                {
                    if(x.charAt(k) == x.charAt(j))
                        count++;
                }

                if (count)