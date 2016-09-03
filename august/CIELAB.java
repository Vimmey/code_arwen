import java.util.Scanner;

        class CIELAB
        {
            public static void main(String args[])
            {

                Scanner scn = new Scanner(System.in);

                String x= scn.nextLine();

    			String num[] = x.split(" ");

    			int a = Integer.parseInt(num[0]);
    			int b = Integer.parseInt(num[1]);

    			int diff = Math.abs(a-b);
    			int y = (diff + "").length();
    			int r;
    			   			
    				if (diff>0) {
	    				r=diff%10;
	    				    				
    			        if (r == 9)
    			    	diff -=  1;
    			    	else
    			    		diff += 1;
    			    
    				System.out.println(diff);
    				
             }    		
    	}
    }

