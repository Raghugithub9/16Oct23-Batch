package Access2;

import Access1.PrivateExample;
import Access1.defaultExample;
import Access1.protectedExample;

public class Test extends protectedExample{

	public static void main(String[] args) {
		PrivateExample pe=new PrivateExample();
		//pe.privateTest();
		
		defaultExample de=new defaultExample();
		//de.defaultTest();
		
		//protectedExample pe1=new protectedExample();
		Test t=new Test();
		t.protectedtest();

	}

}
