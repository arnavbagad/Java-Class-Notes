package jrJava.sorting_objects;

import java.util.StringTokenizer;

public class Ball implements Comparable {
	
	private int x;
	private int y;
	private int radius;
	private double distance;
	
	
	public Ball(String line){
		StringTokenizer st = new StringTokenizer(line, ", ");
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		radius = Integer.parseInt(st.nextToken());
		distance = Math.sqrt(x*x + y*y);
	}

	
	public int compareTo(Object o){
		Ball b = (Ball) o;
		
		if(radius>b.radius) return 1;
		else if(radius<b.radius) return -1;
		else {
			if(distance>b.distance) return 1;
			else if(distance<b.distance) return -1;
			return 0;
		}
	}
	
	
	public String toString(){
		return "{ x=" + x + ", y=" + y + ", radius=" + radius + ", distance=" + (int)(100*distance)/100.0 + " }";
	}
	
	
	public boolean equals(Object o){
		if(!(o instanceof Ball)) return false;
		Ball b = (Ball) o;
		return x==b.x && y==b.y && radius==b.radius; 
	}
	
	
	public int hashCode(){
		return x + 100*y + 10000*radius;
	}
}






