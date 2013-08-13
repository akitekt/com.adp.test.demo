package com.adp.test.second.main;

/**
 * Created with IntelliJ IDEA.
 * User: liuyb
 * Date: 8/9/13
 * Time: 5:37 PM
 * To change this template use File | Settings | File Templates.
 */
 class DHL implements ICarry {
    @Override
    public void deliverThePackage() {
        System.out.println("DHL is happy to deliver your package !");
    }
}
