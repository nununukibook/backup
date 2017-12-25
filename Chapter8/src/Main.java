
public class Main {

	public static void main(String[] args) {
		Cleric c=new Cleric();
		c.name="ミナト";
		c.hp=50;
		c.mp=10;

		System.out.println("聖職者"+c.name+"を、生み出しました！");

		c.selfAid();

	}

}
