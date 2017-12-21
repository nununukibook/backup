
public class Person {
	public String name=null;
	public int age=0;//フィールド変数

	public Person(){}

	public Person(String name,int age){ //ローカル変数
		this.name=name;
		this.age=age;
	}
	public Person(String name){
		this.name=name;
		this.age=0;
	}
	public Person(int age){
		this.name="名前なし";
		this.age=age;
	}
	public Person(int age,String name){
		this.name="name";
		this.age=age;
	}
}
//this:フィールド変数を指す　名前の衝突を防ぐ