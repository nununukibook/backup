
public abstract class Asset {
	private String name;
	private int price;
	private Asset(String name,int price){
		this.name=name;
		this.price=price;
	}
	public String getName(){return this.name;}
	public int getPrice(){return this.price;}
}
