
public class Cleric {
	String name;
	int hp=50;
	final int MAXHP=50;
	int mp=10;
	final int MAXMP=10;

		public void selfAid(){
			this.mp -=5;
			this.hp=this.MAXHP;
			System.out.println(this.name+"は、セルフエイドを唱えた！");
			System.out.println(this.name+"は、MPを5消費した！");
			System.out.println(this.name+"のHPが全回復した！");

			public int pray(int sec){
				int recover=new Random().nextInt(3)+sec;
				int recoverActual=Math.min(this.MAXHP-this.mp, recover);
				this.mp +=recoverActual;
				return recoverActual;

				System.out.println(this.name+"は、"+sec+"秒間天に祈った！");
				System.out.println("MPが"+recoverActual+"回復した！");

			}

	}

}
