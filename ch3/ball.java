package ch3;

public class ball extends circle {
	private String color;

	public ball(String color) {
		this.color = color;
	}

	public void findColor() {
		System.out.println(color + " 공이다.");
	}

	public void findVolume() {
		System.out.println("부피는 4/3*(pi*반지름*반지름*반지름)이다.");
	}
}