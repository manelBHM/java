package corrections;

public class Test{
static boolean plusGrand (Convertible c1, Convertible c2){
return c1.toInt() > c2.toInt();
}
static boolean plusPetit (Convertible c1, Convertible c2){
return c1.toInt() < c2.toInt();
}
static boolean egal (Convertible c1, Convertible c2){
return c1.toInt() == c2.toInt();
}
static void trier (Convertible[] tab) {
for (int i = 0; i <= tab.length - 2; i++) {
int Im = i;
for(int j = i+1 ; j <= tab.length-1; j++) {
if (plusPetit(tab[j] , tab[Im]))
{Im = j;}
}
Convertible temp = tab[i];
tab[i] = tab[Im];
tab[Im] = temp;}}
public static void main(String[] args){
Convertible c1, c2, c3;
Convertible[] t =new Convertible[3];
c1 =new Date (10, 12, 2011);
c2 =new Date (1, 1, 2014);
c3 =new Interface("toto",100000);((Interface) c3).deposer(40000);
System.out.println ( "C1 est plus petit que C2 =>" + plusPetit
(c1,c2));
System.out.println ( "C1 est plus Grand que C3 =>" +plusGrand
(c1,c3));
t[0] = c1;
t[1] = c2;
t[2] = c3;
trier(t);
System.out.println("Tableau trie: ");
for (int i = 0; i <= t.length -1; i++) {
System.out.println(t[i].toInt()); }
}
}