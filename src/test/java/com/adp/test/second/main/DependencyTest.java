package com.adp.test.second.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DependencyTest {
    private Injector injector;
    private ICarry carrier;
    private IDeliver deliver;
    private IPay payment;

    @Before
    public void setUp() throws Exception {
        injector = Guice.createInjector(new BootStrapModule());



    }

    @Test
    public void carrier_should_get_injected() throws Exception {
        carrier =  injector.getInstance(ICarry.class);
        assertEquals(carrier.getClass(),UPS.class);

    }

    @Test
    public void deliver_should_get_injected() throws Exception {
        deliver = injector.getInstance(IDeliver.class);
        assertEquals(deliver.getClass(),ByMail.class);

    }

    @Test
    public void payment_should_get_injected() throws Exception {
        payment = injector.getInstance(IPay.class);
        assertEquals(payment.getClass(),MonthlyPay.class);

    }

}
