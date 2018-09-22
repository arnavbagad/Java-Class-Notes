package jrJava.loopString;

public class Practice2 {

	public static void main(String[] args) {
		int j, i;
		for(i=2; i<10; i++){
			if(i==4)continue;
			for(j=2; j<10; j++){
				int sum = i*j;
				System.out.println(i + " x " + j + " = " + sum);
			}				
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i<9)System.out.println();
		}
		System.exit(0);
	}

}
