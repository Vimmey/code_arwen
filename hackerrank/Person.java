import java.io.*;

public class Person {

    public static void main(String agrs[]) throws IOException {
     
    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

    private int age = Integer.parseInt(br.readLine());;	
  
	public Person(int initialAge) {
  		if (initialAge > 0) {
  			age = initialAge;
  		} else {
  		age = 0;
        System.out.println ("Age is not valid, setting age to 0");
  		}
	}

	public void amIOld() {
  		if (age <13){
        System.out.println("You are young");

  		} else if (age >= 13 && age < 18) {
        System.out.println("You are a teenager");

  		} else {
        System.out.println("You are old");

  		}
	}

	public void yearPasses() {
  		age = age+1;
	}
}
