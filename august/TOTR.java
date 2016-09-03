import java.io.*;
class TOTR
{
    public static void main(String args[]) throws Exception
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String inputStr[] = br.readLine().trim().split(" ");
        int t = Integer.parseInt(inputStr[0]);
        String sourceStr = inputStr[1];

        for (int k=0; k<t; k++) {
        
            String currStr = br.readLine();

            for(int i=0; i < currStr.length(); i++)
            {
                if (currStr.charAt(i) >= 'a' &&  currStr.charAt(i) <= 'z') {
                    System.out.print(sourceStr.charAt(currStr.charAt(i)-'a'));             

                } else if (currStr.charAt(i)>='A'&& currStr.charAt(i)<='Z') {
                    System.out.print((char)((sourceStr.charAt(currStr.charAt(i)-'A')) - 32));

                } else if (currStr.charAt(i) == '_') {
                    System.out.print(" ");

                } else {
                    System.out.print(currStr.charAt(i));
                }
            }

            System.out.println();
        }
    }  
}    