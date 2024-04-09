package day10;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car1 c = new Car1();
		
		c.setName("볼보");
		c.setColor("화이트");
		c.setYear("2024");
		c.setDoor(4);
		c.print();
		
		c.speedUp();
		c.power();
		c.power();
		c.power();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.power();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.power();
	
		System.out.println();
				
	}

}

//(class Car 사용불가)같은 패키지에서 같은 이름의 클래스를 사용하면 error
class Car1{
	
	//멤버변수 : name, year, color, door, power, speed
	private String name;
	private String year;
	private String color;
	private int door;
	private boolean power;
	private int speed;
	public String getName() {
		return name;
	}
	
	//내 차량의 정보를 출력하는 메서드(name, year, color, door)
	public void print() {
		System.out.println("my Car1 : "+name+"/"+color+"("+year+")"+"/"+door+"door");
	}
		
	//power()
	//on 시동이 켜졌습니다. off 시동이 꺼졌습니다. 출력
	//speed 값이 있는 경우 시동을 끌 수 없음 설정 출력
	public void power() {
		if(speed>0) {
			System.out.println("※ 주행중에는 OFF(이)가 불가합니다.");
		}else {
			power = !power;
			if(power) {
				System.out.println("POWER ON!");
			}else {
				System.out.println("POWER OFF!");
			}		
		}
	}
	
	//speedUp / Down의 기본 조건은 power가 켜져야 가능 시동이 꺼져있습니다. 출력
	//speedUp
	//300이상이면 최고 속도 입니다. 출력
	//현재 속도를 출력
	public void speedUp() {
		if(speed>=300) {
			speed=300;
			System.out.println("※ 최고 속도입니다. 속도를 줄이세요.");
			System.out.println("현재속도 : "+(int)(Math.min(speed,300))+"km");
		}else if(speed>0 && !power){
			System.out.println("※ 주행중에는 ON(이)가 불가합니다.");
			System.out.println("현재속도 : "+speed+"km");
		}else if(speed<0 && !power) {
			System.out.println("※ 주행중에는 OFF(이)가 불가합니다.");
			System.out.println("현재속도 : "+speed+"km");	
		}else if(!power) {
			System.out.println("※ POWER OFF 상태로 speed 조절이 불가합니다.");
		}
		else {
			speed += 100;
			System.out.println("현재속도 : "+speed+"km");
		}
	}
	
	//speedDown
	//속도가 0이 되면 더이상 내려가지 않음 멈췄습니다. 출력
	//현재 속도를 출력
	public void speedDown() {
		if(speed<=0) {
			speed=0;
			System.out.println("※ 속도가 0입니다. 더 이상 감속할 수 없습니다.");
			System.out.println("현재속도 : "+speed+"km");
		}else {
			speed -= 100;
			System.out.println("현재속도 : "+speed+"km");
		}
	}
	
	//getter / setter
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public int getDoor() {
		return door;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}	
	
}