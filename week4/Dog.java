package week4;

public class Dog {
	//name名字,color颜色,age年龄
	private String name;
	private String color;
	private String age;
	
	public Dog() {
		name = "旺旺";
		color = "黄色";
		age = "3";
	}
	public Dog(String name,String color,String age) {
		this.name=name;
		this.color=color;
		this.age=age;
	}
	public void print() {
		System.out.println("狗狗名字叫"+this.name);
		System.out.println("狗狗的毛色是"+this.color+"的");
		System.out.println("狗狗现在有"+this.age+"岁了");
	}
}
	class Dogtest{
		public static void main(String[] args){
			Dog a = new Dog();
			a.print();
		}
	}

