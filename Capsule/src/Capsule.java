
public class Capsule {

	public static void main(String[] args) {
		Person taro=new Person();
		taro.setName("田中太郎");
		taro.setAge(19);
		taro.setGender('男');
		taro.setPhoneNumber("090-xxxxxxxx");
		taro.setAddress("xxx@yahoo.co.jp");

		System.out.println(taro.getName());
		System.out.println(taro.getAge());
		System.out.println(taro.getGender());
		System.out.println(taro.getPhoneNumber());
		System.out.println(taro.getAddress());

	}

}
