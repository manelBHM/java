package corrections;

class Interface implements Convertible{
int paye;
String titulaire;
int numero;
public Interface(String n,int num) {
	titulaire=n;
	numero=num;
	paye=0;
}
public void afficher(){
	System.out.println("votre solde est de :"+this.paye);
}
void deposer(int montant){
this.paye =this.paye+ montant;
}
void retirer(int montant)
{this.paye=this.paye - montant;
}
public int toInt(){
return paye;
}
}