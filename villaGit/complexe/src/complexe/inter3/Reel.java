package complexe.inter3;

import inter2.IAffichage;
import inter2.IOperation;

public class Reel implements IOperation , IAffichage  {
	
	private double reel;
	
	
	public Reel (double reel ) {this.reel=reel;}

	public double getReel() {
		return reel;
	}

	public void setReel(double reel) {
		this.reel = reel;
	}

	@Override
	public String afficher() {
		// TODO Auto-generated method stub
		return (""+reel);
	}

	@Override
	public Object plus(Object ob) {
		 Reel reel = (Reel) ob;
		return new Reel  (this.reel + this.reel);
	}

	@Override
	public Object moins(Object ob) {
		// TODO Auto-generated method stub
		 Reel reel = (Reel) ob;
			return new Reel  (this.reel - this.reel);
	}
	
	
	public double plus (double ... reel) {
		double somme = this.reel;
		for(double d : reel )
		{  somme = somme + d;}
		return somme ;
		}
	
	public double moins(double ...reel) {
		
		double moins = this.reel;
		for ( double d : reel) {
			moins = moins-d;
		} return moins;
	}

	}


