package com.adp.test.second.main;

/**
 * Created with IntelliJ IDEA.
 * User: liuyb
 * Date: 8/9/13
 * Time: 5:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class MonthlyPay implements IPay {

    @Override
    public double getSalary(int levelId) {
        return 100*levelId;
    }
}
