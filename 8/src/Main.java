/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h=new Hero();

		h.name="ミナト";
		h.hp=100;
		System.out.println("勇者"+h.name+"を生み出しました！");

		Matango m1=new Matango();
		m1.hp=50;
		m1.suffix='A';

		Matango m2=new Matango();
		m2.hp=50;
		m2.suffix='B';

		h.sit(5);
		h.slip();
		h.sit(25);
		m1.run();
		m2.run();
		h.run();

	}

}
