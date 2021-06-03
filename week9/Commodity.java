package week9;

class Commodity {
	private String id;
	private String name;
	private double price;
	private int nCount;
	private double total;
	Commodity(String id, String name, int nCount, double price){
		this.id = id;
		this.name = name;
		this.price = price;
		this.nCount = nCount;
		this.total = price * nCount;
	}
	@Override
	public String toString() {		
		return id +"\t" + name + "\t" + price + "\t" + nCount + "\t" + total + "\t\n";
	}
	public double getTotal() {
		return total;
	}
	Commodity(){
		
	}
	public double getnCount() {
		return nCount;
	}
	public void setnCount(int nCount) {
		this.nCount = nCount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}