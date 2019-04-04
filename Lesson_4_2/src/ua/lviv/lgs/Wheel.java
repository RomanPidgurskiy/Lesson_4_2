package ua.lviv.lgs;

public class Wheel {
	private int radius;


	public String toString() {
		return "Radius wheel "+radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void function_wheel_radius (int m) {
		this.radius=radius*m;
	}

}

