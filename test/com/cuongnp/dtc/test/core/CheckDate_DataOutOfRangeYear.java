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
public class CheckDate_DataOutOfRangeYear {
    
    @Test
    public void CheckDate_DataOutOfRangeYear() {
        assertEquals("Input Data for Year is out of range!", DateUtil.checkDate("29", "2", "4999"));
        assertEquals("Input Data for Year is out of range!", DateUtil.checkDate("31", "4", "8765"));
    }
    
}
