package com.adp.test.second.main;

import com.google.inject.Inject;

class Employee {
    private final IPay paymethod;
    private int levelId;
    private final IDeliver deliver;

    private double payment;

    @Inject
    public Employee(  int levelId, IPay paymethod, IDeliver delivermethod )
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
