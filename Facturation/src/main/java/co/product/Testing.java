package co.product;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testing {

	@Test
	public void bigTest() {
		int[] tab = { 3, 6, 8, 9 };
		TestNumb nmb = new TestNumb();
		int bignb = nmb.getNumber(tab);
		assertEquals(bignb, 9);

		int[] tab2 = { 1, 2, 3, 4 };
		int bignb2 = nmb.getNumber(tab2);
		assertEquals(bignb2, 4);
	}

	@Test
	public void bigTestWithNegativeValue() {
		int[] tab = { -3, -6, -8, -9 };
		TestNumb nmb = new TestNumb();
		int bignb = nmb.getNumber(tab);
		assertEquals(bignb, -3);
	}

}
