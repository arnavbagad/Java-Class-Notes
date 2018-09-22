package jrJava.studying_string_2;

public class Practice4 { // StringBuilder (StringBuffer)

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append(" ");
		sb.append(123);
		sb.append(" ");
		sb.append(true);
		sb.append(' ');
		sb.append(3.14);
		sb.append(" ");
		sb.append("hello");
		sb.append(" there!");
		
		String total = sb.toString();
		System.out.println(total);
	}

}
