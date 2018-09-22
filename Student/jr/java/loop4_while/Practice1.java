package jr.java.loop4_while;

public class Practice1 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<101; i++){
			
			if(i>=20 && i<=30){
				continue;
			}
			sum = sum + (i*i);
			
			if(sum>=5000) break;
			
		}
		System.out.println(sum);
	}

}
