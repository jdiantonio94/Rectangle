
public class PersonDriver {
	
	public static void main(String[] agrs) {
		Person tommy = new Person();
		tommy.setName("Tommy");
		tommy.setAge(22);

		Person balai = new Person("Balai", 19);


		if (tommy.getName().equals(balai.getName()) && tommy.getAge() == balai.getAge()) {
			System.out.println("The two persons name and age are equal" );
		} else {
			System.out.println("The two persons name and age are not equal");
		}
		if (tommy.getName().equals(balai.getName())) {
			System.out.println("The two persons have the same name");
		} else {
			System.out.println("The two persons do not have the same name");
		}
		if (tommy.getAge() == balai.getAge()) {
			System.out.println("The two persons are the same age");
		} else {
			System.out.println("The two persons are not the same age");
		}
		if (tommy.getAge() > balai.getAge()) {
			System.out.println("Tommy is older than Balai");
		} else {
			System.out.println("Balai is older than Tommy");
		}
		if (tommy.getAge() < balai.getAge()) {
			System.out.println("Tommy is younger than Balai");
		} else {
			System.out.println("Balai is younger than Tommy");
		}
		System.out.println(tommy);
		System.out.println(balai);
	}
}
