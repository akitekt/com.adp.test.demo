package com.adp.test.second.main;

import com.google.inject.Inject;
import com.google.inject.name.Named;

class Employee {
    final IPay paymethod;
    int levelId;
    final IDeliver deliver;

    private double payment;

    @Inject
    public Employee(  @Named("BDD Testing") int levelId, IPay paymethod, IDeliver delivermethod )
    {
        this.paymethod = paymethod;
        this.levelId = levelId;
        this.deliver = delivermethod;
    }

    public PayStub getPayStub()
    {
        PayStub payStub = new PayStub(levelId);
        payment = paymethod.getSalary(payStub.PayGradeId);
        payStub.Payment = payment;
        deliver.deliver();

        return payStub;
    }
}
