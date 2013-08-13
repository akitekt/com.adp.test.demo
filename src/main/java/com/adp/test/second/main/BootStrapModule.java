package com.adp.test.second.main;

import com.google.inject.AbstractModule;


public class BootStrapModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ICarry.class).to(UPS.class);
        bind(IDeliver.class).to(ByMail.class);
        bind(IPay.class).to(MonthlyPay.class);
    }
}
