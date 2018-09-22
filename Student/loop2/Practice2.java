package loop2;

public class Practice2 {

	public static void main(String[] args) {
		
		int sum;
		int i;
		
		sum = 0;
		for(i=11;i<=121; i++){
			sum = sum + i;
		}
		System.out.println("Sum = " + sum);
		sum = 0;
		for(i=23;i<=1235; i+=2){
			sum = sum + i;
		}
		System.out.println("Sum = " + sum);
		sum = 0;
		for(i=99;i>=39; i--){
			sum = sum + i;
		}
		System.out.println("Sum = " + sum);
		sum = 0;
		for(i=9;i>=-99; i-=3){
			sum = sum + i;
		}
		System.out.println("Sum = " + sum);
		sum = 0;
		for(i=1;i<=99; i++){
			sum = sum + (i*i);
		}
		System.out.println("Sum = " + sum);
		sum = 0;
		for(i=1;i<=100; i++){
			sum = sum + i*(i+1);
		}
		System.out.println("Sum = " + sum);
		double sum1 = 0;
		for(i=1;i<=150; i++){
			sum1 = sum1 + Math.sqrt(i);
		}
		System.out.println("Sum = " + sum1);
		System.exit(0);
	}

}
