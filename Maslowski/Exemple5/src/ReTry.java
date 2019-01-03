
public class ReTry {

	public static void main(String[] args) {
		
		String tableauPhrase[][] = {{"Je suis ", "Tu es ", "La prof est "},
		{"un loup", "un troll", "chuck norris", "gandlf"}};
		
		for(int i = 0; i <= 2; i++)
		{    
		  for(int j = 0; j <= 3; j++)
		  {
			  System.out.print(tableauPhrase[i][j]);       
		  }   
		}
	}
}

