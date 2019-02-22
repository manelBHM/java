package co.product;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExpressDeliverTest {

	@Test
	public void deliverExpressDomicile6e99() {
		Deliver deliver = new ExpressDeliver("Paris");
		assertEquals(6.99, deliver.getPrice(), 0.01);
	}

	@Test
	public void deliverExpressDomicile9e99() {
		Deliver deliver = new ExpressDeliver("Bordeau");
		assertEquals(9.99, deliver.getPrice(), 0.01);
	}

}
