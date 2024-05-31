/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.cuongnp.dtc.test.core;

import com.cuongnp.dtc.core.DateUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phucu
 */
public class DaysInMonthTest {
    
    @Test
    public void testDaysInMonthGivenRightMonthAndYearReturnNumberOfDays() {
        assertEquals(31, DateUtil.daysInMonth(1, 2023));
        assertEquals(31, DateUtil.daysInMonth(8, 2024));
        assertEquals(31, DateUtil.daysInMonth(12, 2025));
        assertEquals(30, DateUtil.daysInMonth(4, 2026));
        assertEquals(30, DateUtil.daysInMonth(9, 2027));
        assertEquals(30, DateUtil.daysInMonth(11, 2028));
        assertEquals(29, DateUtil.daysInMonth(2, 2024));
        assertEquals(29, DateUtil.daysInMonth(2, 2000));
        assertEquals(28, DateUtil.daysInMonth(2, 2031));
        assertEquals(28, DateUtil.daysInMonth(2, 1911));
        assertEquals(0, DateUtil.daysInMonth(13, 2033));
        assertEquals(0, DateUtil.daysInMonth(-5, 2034));        
    }
    
}
