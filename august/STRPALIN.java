import java.io.*;
class STRPALIN {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int k=0; k<t; k++)  {
        	String x = br.readLine();
        	String y = br.readLine();
        	int count = 0;

        	for(int i=0;i<x.length();i++) {
            
                for(int j=0;j<y.length();j++) {
                
                    if(x.charAt(i)==y.charAt(j)) {
                    	count++;
                    	break;
                    }
                    
                }
            }
            if ( count>0)
                System.out.println("Yes");  
            else
                System.out.println("No"); 
        }
            
    }
}


