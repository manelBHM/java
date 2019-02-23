
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a=5, b=2;
           double c=5, d=2;
        
           int iresultat;
           iresultat = a/b;
            int imodulo;
            imodulo= a%b;
            
          System.out.println("iresultat " + iresultat);
          System.out.println("imodulo " + imodulo);
               
          double dresultat;
          dresultat = c/d;
           double dmodulo;
           dmodulo= c%d;
           boolean test;
           test= true;
          
           
            if(dresultat==0) {System.out.println("dresultat est supérieur a 0");}
            else if (dresultat==3.5){System.out.println("dresultat est égal a 2.5");}
            else if (test!=false) {System.out.println("Looser");}
            else {System.out.println("hello");}
       
          
          System.out.println("dresultat " + dresultat);
          System.out.println("dmodulo " + dmodulo);
          
          
	}

}
