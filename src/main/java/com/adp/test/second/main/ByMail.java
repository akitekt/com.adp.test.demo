package com.adp.test.second.main;


import com.google.inject.Inject;

class ByMail implements IDeliver{

    private final ICarry carrier;

    @Inject
    public ByMail(ICarry carrier)
    {
        this.carrier = carrier;
    }

    @Override
    public void deliver() {
        System.out.println("Your paystub package will be picked up by our carriers");
        carrier.deliverThePackage();
        System.out.println("Your paystub package is delivered by our carriers");
    }
}
