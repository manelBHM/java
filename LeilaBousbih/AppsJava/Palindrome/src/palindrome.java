public class palindrome {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        

        String ch = args[0];
        String chInverse = "";
        int chLg = ch.length();
        for(int i = chLg -1; i>-1; i--)
        { chInverse+= ch.substring(i, i +1); }
        System.out.println("L'inverse de " + ch + " est " + chInverse);
        
        if (ch.equals(chInverse)) {
            System.out.println( ch + " est un palindrome");}
            else {
                System.out.println(ch + " n'est pas un palindrome");
        }
        
        
        String chl = args[1];
        String chlInverse = "";
        int chlLg = chl.length();
        for(int i = chlLg -1; i>-1; i--)
        { chlInverse+= chl.substring(i, i +1); }
        System.out.println("L'inverse de " + chl + " est " + chlInverse);
        
        if (chl.equals(chlInverse)) {
        System.out.println( chl + " est un palindrome");
            }else {
                System.out.println(chl + " n'est pas un palindrome");
        }
    
    }
    }