/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cuongnp.dtc.test.core;

import com.cuongnp.dtc.core.DateUtil;
import java.util.Arrays;
import java.util.Collection;
import static junit.framework.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author phucu
 */
@RunWith(value = Parameterized.class)
public class DaysInMonthDDTTest {


    @Parameterized.Parameter(value = 0)
    public int month;

    @Parameterized.Parameter(value = 1)
    public int year;

    @Parameterized.Parameter(value = 2)
    public int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> initData() {
        return Arrays.asList(new Object[][]{
            {2, 2024, 29},
            {2, 2023, 28},
            {13, 2020, 0},
            {4, 1975, 30},
            {5, 2024, 31},
        });
    }

    @Test
    public void testDaysInMonthGivenRightArgReturnsWell() {
        assertEquals(expected, DateUtil.daysInMonth(month, year));
    }
}
