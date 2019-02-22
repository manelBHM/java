package com.stage.stagiaire;

import java.util.ArrayList;
import java.util.List;

public class ListStagiare {

	public List<Stagiare> getListStagiare() {
		List<Stagiare> stagiare = new ArrayList<>();
		stagiare.add(new Stagiare("Legrand", "Frank", 6876));
		stagiare.add(new Stagiare("Lemoyen", "Nicolas", 7679));
		stagiare.add(new Stagiare("Lepetit", "Marc", 7696));

		return stagiare;
	}
}
