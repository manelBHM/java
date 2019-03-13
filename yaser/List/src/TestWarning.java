import java.util.ArrayList;
import java.util.List;

@SupperessWarning("unchecked")
public class TestWarning {
	@SupperessWarning("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List donnees = new ArrayList();
donnees.add("valeur1");

System.out.println(donnees);
	}

}
