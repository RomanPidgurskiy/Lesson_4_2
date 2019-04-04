package ua.lviv.lgs;

public class Handlebar {
	
	private int diameter;
	

	public String toString() {
		return "Diameter handlebar = "+diameter;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	public void function_Handlebar(int n) {
		this.diameter=diameter+n;
    }
}