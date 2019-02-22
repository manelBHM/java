package co.product;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RelayDeliverTest {

	@Test
	public void ifNumber_is_lessTen_22_return0() {
		Deliver deliver = new RelayDeliver(5);
		assertEquals(0.0, deliver.getPrice(), 0.01);
	}

	@Test
	public void ifNumber_is_lessTen_23_return2e99() {
		Deliver deliver = new RelayDeliver(23);
		assertEquals(2.99, deliver.getPrice(), 0.01);
	}

	@Test
	public void ifNumber_is_lessTen_247_return2e99() {
		Deliver deliver = new RelayDeliver(48);
		assertEquals(4.99, deliver.getPrice(), 0.01);
	}

}
