
public class Test {
	float f;
	int a;

	Test(int a) {
		this.a = a;
	}

	Test(float f, char c) {
		this.f = f;
		this.a = c;
	}

	public static void main(String[] args) {
		Test test = new Test(3, 'A');
		System.out.println(test);
	}

}
