package com.simplon.Pokemon;

public class Pokemon {
String nom;
 static String elem;
 int PV;
 int atk;
 String weakness;
 String resist;


public Pokemon(String nom, String elem, int PV, int atk, String weakness, String resist) {
	this.nom=nom;
	this.elem=elem;
	this.PV=PV;
	this.atk=atk;
	this.weakness=weakness;
	this.resist=resist;

}
}