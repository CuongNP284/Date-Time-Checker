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
public class CheckDate_DataOutOfRangeDay {
    
    @Test
    public void CheckDate_DataOutOfRangeDay() {
        assertEquals("Input Data for Day is out of range!", DateUtil.checkDate("32", "1", "2024"));
        assertEquals("Input Data for Day is out of range!", DateUtil.checkDate("95", "2", "2000"));
    }
    
}
