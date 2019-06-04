package com.simplon.Pokemon;

public class methodman  {
/*	public methodman(String nom, String elem, int PV, int atk, String weakness, String resist) {
		super(nom, elem, PV, atk, weakness, resist);
		this.nom=nom;
		this.elem=elem;
		this.PV=PV;
		this.atk=atk;
		this.weakness=weakness;
		this.resist=resist;
	}*/
private	Boolean win;

	public Boolean combat(Pokemon  Pokemon1,Pokemon  Pokemon2/*, String weakness, String resist */) {
/*		for(int PV ; Pokemon1.PV > 0; ) {
			switch (PV) {
			case 1: this.elem = weakness;
			this.atk=atk*2;
			break;
			case 2: this.elem = resist;
			this.atk=atk/2;
			break;
			case 3: 
				this.atk=atk;
			}
			if(PV<0) {
				boolean win=true;
			}else {
			Pokemon.PV=PV-atk;
			}
		}*/
		if(Pokemon1.PV>Pokemon2.PV) {
			win = true;
			return win;
		}else {
			win = false;
			return win;
		}

	}
}
