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
public class CheckDate_CorrectFormatIncorrectDate {
    
    @Test
    public void CheckDate_CorrectFormatIncorrectDate() {
        assertEquals("29/2/1911 is incorrect date time!", DateUtil.checkDate("29", "2", "1911"));
        assertEquals("31/4/1999 is incorrect date time!", DateUtil.checkDate("31", "4", "1999"));
        assertEquals("30/2/2024 is incorrect date time!", DateUtil.checkDate("30", "2", "2024"));
        assertEquals("31/2/1890 is incorrect date time!", DateUtil.checkDate("31", "2", "1890"));
    }
}
