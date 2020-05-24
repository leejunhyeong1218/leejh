package org.springframework.samples.petclinic.proxy;

import org.junit.jupiter.api.Test;

public class testPay {
	
	@Test
	public void testPay() {
		Payment payment = new CashPerf();
		Store store = new Store(payment);
		store.buySomething(100);
	}

}
