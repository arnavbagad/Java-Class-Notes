package loop2;

public class Practice5 {

	public static void main(String[] args) {
		
		for(int i=0; i<1000000; i++){
			System.out.println("Hello1");
			
			if(i==5) break;
			System.out.println(i);
			System.out.println("Hello2");
		}
		System.out.println("I am done!");
		

	}

}
