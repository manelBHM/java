public class Animal {
        // propri�t� de la classe
        private static int totalAnimal = 0;
        // propri�t�s de l'objet
        protected String nom;
        private int nombreDePatte;
        // constructeur
        public Animal(String nom, int nombreDePatte) {
                super(); // appel du constructeur parent
                this.nom = nom;
                this.nombreDePatte = nombreDePatte;
                totalAnimal++;
        }
        // une methode de l'objet
        private String formulerMonNom() {
                return "Je m'appelle " + this.nom; // appel de la propri�t� nom
        }
        // une methode de l'objet
        public void parler() {
                System.out.println(this.formulerMonNom()); // appel d'une m�thode de l'objet
                System.out.println("Je suis un animal et j'ai " + this.nombreDePatte + " pattes");
        }
        // une methode de la classe
        public static void afficherNombreDAnimaux() {
                System.out.println("**************************");
                System.out.println("Il y a " + totalAnimal + " animaux");
}
public static class RunIntroduction {
        public static void main(String[] args) {
                Animal animalTiti = new Animal("titi", 2); // creation animal
                animalTiti.parler(); // appel d'une m�thode d'instance
                Animal animalMinet = new Animal("Gros minet", 4); // creation animal
                animalMinet.parler(); // appel d'une m�thode d'instance
                Animal.afficherNombreDAnimaux(); // appel d'une m�thode de classe
 }}}
