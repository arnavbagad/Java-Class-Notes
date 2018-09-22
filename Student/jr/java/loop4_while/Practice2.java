package jr.java.loop4_while;

public class Practice2 {

	public static void main(String[] args) {
		int i=1;
		int sum = 0;
		while(i<101){

			if(i>=20 && i<=30){
				i++;
				continue;
			}
			sum = sum + (i*i);
			i++;
			if(sum>=5000) break;

		}
		System.out.println(sum);
	}

}
