package com.adp.test.second.main;

/**
 * Created with IntelliJ IDEA.
 * User: liuyb
 * Date: 8/12/13
 * Time: 10:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class PayStub {
    int LevelId;
    int PayGradeId;
    double Payment;


    public PayStub(int levelId)
    {
        this.LevelId = levelId;
        this.PayGradeId = levelId *2;

    }

}
