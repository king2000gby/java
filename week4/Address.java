package week4;

class Address {
	//nation����,provinceʡ��,city����,street�ֵ�,postcode�ʱ�
	private String nation;
	private String province;
	private String city;
	private String street;
	private String postcode;
public Address() {
	nation = "�й�";
	province = "����";
	city = "�人";
	street = "1�Ŵ��";
	postcode = "123456";
	}
public Address(String nation,String province,String city,String street,String postcode) {
	this.nation = nation;
	this.province = province;
	this.city = city;
	this.street = street;
	this.postcode = postcode;
	}
public void print() {
	System.out.println("��ַ��ϢΪ:"+this.nation+this.province+this.city+this.street+" "+"��������"+this.postcode);
}
}
class Addresstest{
    public static void main(String[] args){
        Address a=new Address();
        a.print();
    }
}