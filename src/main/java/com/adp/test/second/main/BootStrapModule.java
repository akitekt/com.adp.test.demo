package com.adp.test.second.main;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;


public class BootStrapModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ICarry.class).to(UPS.class);
        bind(IDeliver.class).to(ByMail.class);
        bind(IPay.class).to(MonthlyPay.class);
        bind(Integer.class).annotatedWith(Names.named("BDD Testing"))
                .toInstance(10);
    }
}
