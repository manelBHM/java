package com.lesson9tow;
import java.util.Scanner;
import java.util.Random;
import java.lang.Character;

		public class Pendu {

			static String[] motATrou;
			static int nombreErreur;
			static int nombreToursTotal;
			static int nombreLettresDiff;
			static String motADeviner;
			static char lettreUtilisateur;
			static boolean continuer;
			static int choixNiveau;

			public static void main(String[] args){

				//Choix aléatoire du mot à deviner
				String[] tableauDeMots = {"UN MOT", "UN AUTRE MOT", "MOT A DEVINER"};
				int ind = new Random().nextInt(tableauDeMots.length);
				motADeviner = tableauDeMots[ind];
				

				//Choix du niveau par l'utilisateur
				Scanner saisie = new Scanner(System.in);
				System.out.println("\n\n\n-------------------------");
				System.out.println("Bienvenue dans le Pendu !");
				System.out.println("-------------------------\n");
				System.out.print("Choisissez un niveau\n1: Facile\n2: Moyen\n3: Difficile\nVotre choix : ");
				choixNiveau = saisie.nextInt();

				//Nombre de coups en fonction du nombre de lettres differentes et du niveau choisi
				if(choixNiveau == 1){
					nombreToursTotal = motADeviner.length() + 2; //why decreasing this number ???????????????????========
				}
				else if (choixNiveau == 2){
					nombreToursTotal = motADeviner.length() + 1;
				}
				else if (choixNiveau == 3){
					nombreToursTotal = motADeviner.length();
				}
				System.out.println("Vous avez " + nombreToursTotal +" coups pour trouver.\n\n");

				nombreErreur = 0;
				continuer = true;
				motATrou = new String[motADeviner.length()];   

				//Affichage des traits suivant le nombre de lettres
				//et affichage de la premiere et derniere lettre
				for (int i = 0; i < motADeviner.length(); i++){

					if (i == 0) {
						motATrou[i] = "" + motADeviner.charAt(i);  
					}
					else if (i == motADeviner.length() - 1){     
						motATrou[i] ="" + motADeviner.charAt(i);
					} else{
						if(motADeviner.charAt(i) == ' '){        //why not continuing as else if instead of making another Nested if else ???????????
																	/// the answer === we can continue as if else too
							motATrou[i] = (" ");   // putting (" ")    ?? ==========
						}
						else{
							motATrou[i] = ("*");
						}
					}
				}

				afficherMotATrou();

				//Boucle jeu
				do {
					System.out.print("\nVeuillez entrer une lettre : ");
					lettreUtilisateur = saisie.next().toUpperCase().charAt(0);

					lettreAjoutee(lettreUtilisateur);  // why calling lettreUtilisateur with lettreAjoutee function ????????????====
					afficherMotATrou();

					//Condition de victoire ou de defaite
					if (renvoieMotSansTrou().equals(motADeviner)){   //  why needing this method???????????========
						if (nombreErreur == 1){
							System.out.println("Bravo !!! Vous avez gagne en ne faisant que " + nombreErreur + " erreur !");
						}
						else if (nombreErreur == 0){
							System.out.println("Bravo !!! Vous avez gagne en ne faisant aucune erreur !");
						}
						else{
							System.out.println("Bravo !!! Vous avez gagne en ne faisant que " + nombreErreur + " erreurs !");
						}
						continuer = false;
					}
					else {
						if (nombreErreur == nombreToursTotal){
							System.out.println("Vous avez perdu !! Desole...");
							continuer = false;
						} else{
							System.out.println("Il vous reste " + (nombreToursTotal - nombreErreur) + " tours...");
						}
					}
				} while (continuer);

			}//Fin du Main


			//Méthode qui ajoute une erreur si la lettre n'est pas dans le mot
			//et qui rempli motATrou.
			public static void lettreAjoutee(char lettre){
				int lettreDansMot = 0;
				for (int i = 0; i < motADeviner.length(); i++){

					if (motADeviner.charAt(i) == lettre){
						motATrou[i] = "" + lettre;
						lettreDansMot ++; //????? ======
					}
				}// outside the loop ????????????????
				if (lettreDansMot == 0){    /// why lettreDansMot  equal 0 ????????????======
					nombreErreur ++ ;
				}
			}

			//Méthode qui affiche le motATrou avec des espaces
			public static void afficherMotATrou(){
				String leMot = "";
				for (int i = 0; i < motATrou.length; i++){
					leMot += motATrou[i] + " ";               // why " "???????????????======
				}
				System.out.print("Mot a deviner : ");
				System.out.println(leMot);
			}

			//Méthode qui renvoie le motATrou sans espaces
			public static String renvoieMotSansTrou(){                //why needing this method /???????????????=======
				String leMot = "";
				for (int i = 0; i < motATrou.length; i++){
					leMot += motATrou[i];
				}
				return leMot;
			}
		
	}


