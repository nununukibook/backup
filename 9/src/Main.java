
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sword s=new Sword();
		s.name="炎の剣";
		s.damage=5;

		Hero h1= new Hero();
		h1.name="ミナト";
		h1.hp=100;
		h1.sword=s;
		System.out.println("現在の武器は"+h1.sword.name);

		h1.attack();

		Hero h2=new Hero();
		h2.name="アサカ";
		h2.hp=100;
		Wizard w=new Wizard();
		w.name="スガワラ";
		w.hp=50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
	}

}
