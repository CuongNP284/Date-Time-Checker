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
public class CheckDate_DataOutOfRangeMonth {
    
    @Test
    public void CheckDate_DataOutOfRangeMonth() {
        assertEquals("Input Data for Month is out of range!", DateUtil.checkDate("28", "13", "1999"));
        assertEquals("Input Data for Month is out of range!", DateUtil.checkDate("30", "29", "1975"));
    }
    
}
