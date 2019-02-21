import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class TestDeprecated {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List donnees = new ArrayList();
		donnees.add("valeur1");
		
		MaSousclasse td = new MaSousclasse();
		td.maMethode();

	}
}
