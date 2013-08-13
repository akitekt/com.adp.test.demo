package com.adp.test.second.main;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


public class EmployeeTest {
    private Injector injector;
    private IPay pay_method;

    @Before
    public void setUp() throws Exception {
        injector = Guice.createInjector(new BootStrapModule());
        pay_method = injector.getInstance(IPay.class);
    }

    @Test
    public void should_get_correct_PayGradeId() throws Exception {

        // Arrange
        int levelId = 10;
        IPay pay_method = mock(IPay.class);
        IDeliver deliver_method = mock(IDeliver.class);
        // You can return any value here
        when(pay_method.getSalary(anyInt())).thenReturn(100000000.0);
        doNothing().when(deliver_method).deliver();

        // Act
        Employee sut = new Employee(levelId,pay_method,deliver_method);
        PayStub my_pay = sut.getPayStub();


        // Assert
        assertEquals(my_pay.PayGradeId,2*10);


    }

    @Test
    public void should_get_paid_correct_amount() throws Exception {

        // Arrange
        int levelId = 10;
        IDeliver deliver_method = mock(IDeliver.class);
        doNothing().when(deliver_method).deliver();


        // Act
        Employee sut = new Employee(levelId,pay_method,deliver_method);
        PayStub my_pay = sut.getPayStub();


        // Assert
        assertNotNull(my_pay);
        assertEquals(my_pay.Payment,2*10*100,0.0001);



    }



}
