import java.io.*;
class FLOW009 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int k=0; k<t; k++)  {
        	String x = br.readLine();
        	String ch[] = x.split(" ");

            double q = Double.parseDouble(ch[0]);
            double p = Double.parseDouble(ch[1]);

            double a = p*q;            

            if (q>1000) 
            	a = a*0.9;
                            
            String out = String.format("%.6f",a); 
            System.out.println(out);
            
        }
    }
}


