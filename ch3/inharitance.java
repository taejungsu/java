package ch3;

public class inharitance {
	public static void main(String[] args) {
		circle c1 = new circle();
		ball c2 = new ball("빨간색");

		System.out.println("원 :");
		c1.findRadius();
		c1.findArea();

		System.out.println("\n공 :");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();
	}
}
