package com.adp.test.second.main;


import org.junit.Test;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;


public class ByMailTest {


    @Test
    public void No_mock_UPS_should_cause_lots_of_IO() throws Exception {
        ICarry carry = new UPS();
        ByMail sut = new ByMail(carry);
        sut.deliver();


    }
    @Test
    public void mock_UPS_should_be_lightweight() throws Exception {
        ICarry mock_carry = mock(UPS.class);
        doNothing().when(mock_carry).deliverThePackage();
        ByMail sut = new ByMail(mock_carry);
        sut.deliver();


    }

    @Test
    public void mock_ICarry_should_work_as_well() throws Exception {
        ICarry mock_ICarry = mock(ICarry.class);
        doNothing().when(mock_ICarry).deliverThePackage();
        ByMail sut = new ByMail(mock_ICarry);
        sut.deliver();
    }
}
