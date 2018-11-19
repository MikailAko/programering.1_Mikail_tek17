package strings;

public class Comparing {

	public static void main(String[] args) {
		String romanNumber = "VIII";
		int number = 0;
		
		for (int index = 0; index <= 3; index++){
		System.out.println("index = " + index);
		
	}
			
			
			
			// index =0;
			if (romanNumber.charAt(0) == 'I') {
			number = 1;

		}
		if (romanNumber.charAt(0) == 'V') {
			number = 5;
		}
		// index =1;
		if (romanNumber.charAt(1) == 'I') {
			number = number + 1;

		}
		if (romanNumber.charAt(1) == 'V') {
			number = number + 5;
		}
		
		// index =2;
				if (romanNumber.charAt(2) == 'I') {
					number = number + 1;

				}
				if (romanNumber.charAt(2) == 'V') {
					number = number + 5;
				}
				
				// index =3;
				if (romanNumber.charAt(3) == 'I') {
					number = number + 1;

				}
				if (romanNumber.charAt(3) == 'V') {
					number = number + 5;
				}
				
		System.out.println(number);

	}

}
