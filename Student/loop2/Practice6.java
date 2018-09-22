package loop2;

public class Practice6 {

		
	public static void main(String[] args) {

		for(int i=0; i<10; i++){
	
			if(i==8)break;
			System.out.println("Welcome");
			if(i==4 || i==6)continue;
			System.out.println(i);
			System.out.println("Good Bye!");
			System.out.println();
		}
		System.exit(0);
	}

}
