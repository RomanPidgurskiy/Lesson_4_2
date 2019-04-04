package ua.lviv.lgs;

public class Applicttion_auto {

		public double price;
		public Body body;
		public Handlebar handlebar;
		public Wheel wheel;
		
		Applicttion_auto(double price, Body body,Handlebar handlebar, Wheel wheel){
			this.price=price;
			this.body=body;
			this.handlebar=handlebar;
			this.wheel=wheel;
		};
		
		
	@Override
	public String toString() {
		return "Auto_price " + price + ", " + body + ", " + handlebar + ", " + wheel ;
	}

	public static void main(String[] args) {
		

		double price = 1234.56;
		Body body = new Body();
		Handlebar handlebar = new Handlebar();
		Wheel wheel = new Wheel();
		Applicttion_auto auto = new Applicttion_auto(price,body,handlebar,wheel);

	
		auto.body.setColor("green");	
		auto.handlebar.setDiameter(50);
		auto.wheel.setRadius(15);
	
		System.out.println(auto);
		
       auto.body.function_Body_color("Bleck");
       auto.handlebar.function_Handlebar(6);
	   auto.wheel.function_wheel_radius(2);
    
		System.out.println(auto);
       
	}
}

