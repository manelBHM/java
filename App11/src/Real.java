
public class Real implements IAffichage , IOperation {
	double x;
	 
	public Real (double x) {
		this.x=x;
	}
	double plus(double x) {
		double sume= 0;
		return sume=sume+ this.x;
		
	}
	double moins(double x) {
		double rusulta= 0;
		return rusulta=rusulta - this.x;
		
	}
	@Override
	public String Affich() {
	
		return (x + " ");
	}
	@Override
	public Object plus(Object c) {
		Real reel = (Real) c;
		return new Real(this.x + reel.x);
	}
	@Override
	public Object moins(Object c) {
		Real reel = (Real) c;
		return new Real(this.x - reel.x);
	}
}
