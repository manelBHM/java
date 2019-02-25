import java.util.ArrayList;

import javax.annotation.processing.SupportedAnnotationTypes;
@SuppressWarnings("unchecked")


@anno(x="honno", y="lulu")
public class AMain {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		
		
		
		A<Integer, String> a = new A<Integer, String>(1, "test");
		
		System.out.println(a);
		
		ArrayList x = new ArrayList();
		
		x.add("lol");
		x.add(3);
		 
		
		
	}

}
