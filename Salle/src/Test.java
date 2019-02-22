public class Test<T1, T2> {// T defini le type inconu, aredefinir dans le main
	private T1 attribut;
	private T2 value;

	public Test(T1 attribut, T2 value) {
		this.attribut = attribut;
		this.value = value;
	}

	public T1 getAttribut() {
		return attribut;
	}

	public void setAttribut(T1 attribut) {
		this.attribut = attribut;
	}

	public T2 getValue() {
		return value;
	}

	public void setValue(T2 value) {
		this.value = value;
	}

	public static void main(String[] args) {
		Test<String, SuperCool> test = new Test<>("King", new SuperCool2());
		String att = test.getAttribut();
		SuperCool val = test.getValue();
		System.out.println(att);
		System.out.println(val);

		// t.setAt("balba");
		// System.out.println(t.getAtt());
	}

}
