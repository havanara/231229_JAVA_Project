package day20;

import java.util.Comparator;

public class Trip implements Comparator<Trip>{
	
	private String name;
	private int age;
	private int price;
	
	public Trip() {}
	public Trip(String name, int age) {
		this.name = name;
		this.age = age;
		if(age>=15) {
			this.price = 100;
			return;
		}
		this.price = 50;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "이름:" + name + " 나이:" + age + "세 비용:" + price + "만원";
	}
	@Override
	public int compare(Trip o1, Trip o2) {
		return 0;
	}
	
	

}