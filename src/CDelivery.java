public class CDelivery {
	private String name;
	private String phone;

	int PriceForDistance(int distance) {
		// System.out.println("$10");
		if (distance < 10 && distance > 0) {
			return 10;
			
		} else if (distance > 10) {
			return 25;
		}
		return 0;
	}

	int PriceForDistanceAndStairs(int distance) {
		if (distance < 10 && distance > 0) {
			return 20;
		} else if (distance > 10) {
			return 35;
		}
		return 0;
	}

	int Weekend() {
		return 50;
	}

	public static void main(String[] args) {
		CDelivery Cobj = new CDelivery();
		CDelivery Cobj1 = new CDelivery();

		Cobj.name = "Jasmine";
		Cobj1.name = "Rakhee";

		System.out.println("Testing Price For " + Cobj.name);
		System.out.println(Cobj.PriceForDistance(9));

		System.out.println("Testing Price For " + Cobj1.name);
		System.out.println(Cobj1.PriceForDistance(20));

		System.out.println("Testing Price with stairs For " + Cobj.name);
		System.out.println(Cobj.PriceForDistanceAndStairs(8));

	}
}