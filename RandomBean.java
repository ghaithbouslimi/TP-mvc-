package BEANS;

public class RandomBean {
	private double x;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public RandomBean() {
		
		x=0;
	}
	public double CalculeRandom(double x ){
		return Math.random()*x;
	}
	}


