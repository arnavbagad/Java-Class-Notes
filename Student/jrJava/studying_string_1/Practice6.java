package jrJava.studying_string_1;

public class Practice6 {

	public static void main(String[] args) {
		
		String message = "Sir has an amazing personality. He must be very popular everywhere.";

		int pos1, pos2 = -1;
		String each;
		
		while(true){
			pos1 = pos2 + 1;
			pos2 = message.indexOf(' ' , pos1);
			if(pos2<0) {
				each = message.substring(pos1);
				System.out.println(each);
				break;
			}
			each = message.substring(pos1, pos2);
			System.out.println(each);
		}	
	
	}

}
