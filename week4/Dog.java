package week4;

public class Dog {
	//name����,color��ɫ,age����
	private String name;
	private String color;
	private String age;
	
	public Dog() {
		name = "����";
		color = "��ɫ";
		age = "3";
	}
	public Dog(String name,String color,String age) {
		this.name=name;
		this.color=color;
		this.age=age;
	}
	public void print() {
		System.out.println("�������ֽ�"+this.name);
		System.out.println("������ëɫ��"+this.color+"��");
		System.out.println("����������"+this.age+"����");
	}
}
	class Dogtest{
		public static void main(String[] args){
			Dog a = new Dog();
			a.print();
		}
	}

