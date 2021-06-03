package week4;

class Address {
	//nation国家,province省份,city城市,street街道,postcode邮编
	private String nation;
	private String province;
	private String city;
	private String street;
	private String postcode;
public Address() {
	nation = "中国";
	province = "湖北";
	city = "武汉";
	street = "1号大道";
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
	System.out.println("地址信息为:"+this.nation+this.province+this.city+this.street+" "+"邮政编码"+this.postcode);
}
}
class Addresstest{
    public static void main(String[] args){
        Address a=new Address();
        a.print();
    }
}