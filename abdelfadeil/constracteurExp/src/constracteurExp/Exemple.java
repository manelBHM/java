package constracteurExp;

public class Exemple {
	float f;
	char ch;
	int a;
	public Exemple(int a) {
		
	}
	public Exemple(float f, char ch) {
		super();
		this.f = f;
		this.ch = ch;
	}
	@Override
	public String toString() {
		
		return f+ " "+ ch+"\n"+a;
	}
	

}