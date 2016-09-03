import java.io.*;

class FLOW011 {

	public static void main(String agrs[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
      
	
		for (int i=0; i<t; i++) {

			int bs = Integer.parseInt(br.readLine());
			  double hra,da,gs;
			 
			if (bs<1500) {

				 hra = 0.1 * bs;
			     da  =  0.9 * bs;
			     
			} else {

				hra = 500;
				da = 0.98 * bs;
				
			}        

                 gs = bs+hra+da;

                 //System.out.println(gs);
                
			        
			 String answer = String.format("%g", gs);   

            while (answer.contains(".") && (answer.endsWith(".") || answer.endsWith("0"))) 
            {
                answer = answer.substring(0, answer.length()-1);
            }
            System.out.println(answer);
	        
  		}
		       
		   
		}
	}
