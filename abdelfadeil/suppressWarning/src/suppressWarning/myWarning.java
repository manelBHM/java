package suppressWarning;

import java.util.ArrayList;
import java.util.List;

public class myWarning {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	List donnees = new ArrayList();
	donnees.add("valeur1");
	}

}
