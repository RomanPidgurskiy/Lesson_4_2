package ua.lviv.lgs;

public class Body {
	private String color;

	public String toString() {
		return "Color body = "+color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void function_Body_color(String color_plus) {
		//String temp = "/";
		this.color=color+"/"+color_plus;
	};
}
