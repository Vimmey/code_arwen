import java.io.*;
class ACBALL {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int k=0; k<t; k++)  {

        	String x = br.readLine();
        	String y = br.readLine();
        	StringBuffer z = new StringBuffer("");
            
        	for(int i=0;i<x.length();i++) {
            
                if(x.charAt(i)==y.charAt(i)) {
                    if (x.charAt(i) == 'W')
                        z.append("B"); 
                    else
                        z.append("W"); 
                        
                } else 
                        z.append("B");                                                                 
                                             
            }

            System.out.println(z);

        }
    }
}