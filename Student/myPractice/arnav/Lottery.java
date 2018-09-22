package myPractice.arnav;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int o;
		int p;
		int q;
		int r;
		System.out.println("Are you feeling lucky today because if your not then you won't be winning the $100,000,000 prize!");
		System.out.println("Let's play a game of lottery!");
		System.out.println("Type your ticket number in is your ticket. Digit by digit. The ticket is nine numbers long or to the 100 millionth place.");

		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		e = scanner.nextInt();
		f = scanner.nextInt();
		g = scanner.nextInt();
		h = scanner.nextInt();
		i = scanner.nextInt();
		
		a = a;
		b = b*10;
		c = c*100;
		d = d*1000;
		e = e*10000; 
		f = f*100000; 
		g = g*1000000; 
		h = h*10000000; 
		i = i*100000000; 
		int x = a+b+c+d+e+f+g+h+i;
		System.out.println(x + " The prize is $100,000,000");
		
		Random rand = new Random();

		j = rand.nextInt(10);
		k = rand.nextInt(10)*10;
		l = rand.nextInt(10)*100;
		m = rand.nextInt(10)*1000;
		n = rand.nextInt(10)*10000;
		o = rand.nextInt(10)*100000;
		p = rand.nextInt(10)*1000000;
		q = rand.nextInt(10)*10000000;
		r = rand.nextInt(10)*100000000;
		int y = j+k+l+m+n+o+p+q+r;
		System.out.println("The winning ticket is " + y);
		if(a==j){
			System.out.println("You get $1");
			if(b==k){
				System.out.println("You get $10");
				if(c==l){
					System.out.println("You get $100");
					if(d==m){
						System.out.println("You get $1,000");
						if(e==n){
							System.out.println("You get $10,000");
							if(f==o){
								System.out.println("You get $100,000");
								if(g==p){
									System.out.println("You get $,1000,000");
									if(h==q){
										System.out.println("You get $10,000,000");
										if(i==r){
											System.out.println("You get $100,000,000");
										}
									}
								}
							}
						}
					}

				}

			}

		}
		else{
			System.out.println("You get nothing! Please play again.");
		}
		
	}


}