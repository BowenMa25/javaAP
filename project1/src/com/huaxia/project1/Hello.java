package project1;

public class Hello {

	public static void main(String[] args) {
		 int val1 = 2, val2 = 22, val3 = 78; 
		    while (val2 % val1 == 0 || val2 % 3 == 0 ){
		        val3++; 
		        val2--; 
		    }
		 System.out.println(val3);
	}

}
