package java_day17.Fishing;

public class Fish {
	String name; // 물고기 이름
	int price;	 // 물고기 가격
	int grade;	 // 물고기 등급
	
	public Fish(String name, int price, int grade) {
		this.name = name;
		this.price = price;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Fish [name=" + name + ", price=" + price + ", grade=" + grade + "]";
	}
}
