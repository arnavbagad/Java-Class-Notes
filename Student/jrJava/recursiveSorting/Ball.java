package jrJava.recursiveSorting;

public class Ball {

	private int x, y;
	
	
	public Ball(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	public int getX(){ return x; }
	public int getY(){ return y; }
	public void setX(int x){ this.x = x; }
	public void setY(int y){ this.y = y; }
	
	public boolean equals(Object o){
		if(!(o instanceof Ball)) return false;
		Ball b = (Ball) o;
		if(x==b.x && y==b.y) return true;
		return false;
	}
	
	public String toString(){
		int distance = (int) Math.sqrt(x*x + y*y);
		return "[" + x + ", " + y + ", " + distance + "]";
	}
	
	
	public int hashCode(){
		return x + 1000*y;
	}
	
	
	public int compareTo(Object o){
		Ball b = (Ball) o;
		int d1 = (int) Math.sqrt(x*x + y*y);
		int d2 = (int) Math.sqrt(b.x*b.x + b.y*b.y);
		if(d1>d2) return 1;
		else if(d1<d2) return -1;
		else return 0;
		
	}
	
	
}
