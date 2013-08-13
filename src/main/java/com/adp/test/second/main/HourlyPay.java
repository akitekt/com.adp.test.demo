package com.adp.test.second.main;

/**
 * Created with IntelliJ IDEA.
 * User: liuyb
 * Date: 8/9/13
 * Time: 5:09 PM
 * To change this template use File | Settings | File Templates.
 */
 class HourlyPay implements IPay {
    @Override
    public double getSalary(int levelId) {
        return levelId * 4 * 50;
    }
}
