package com.gestiondesalles.interfaces;

import java.util.List;

import com.gestiondesalles.objets.Salle;

public interface ISalle {

	public List<Salle> creer();

	public List<Salle> ajouter();

	public List<Salle> modifierId(int oldId, int newId);

	public List<Salle> modifierLibelle(String oldLibelle, String newLibelle);

	public List<Salle> modifierCapacite(int oldCapacite, int newCapacite);

	public List<Salle> supprimer();

	public void afficher();

}
