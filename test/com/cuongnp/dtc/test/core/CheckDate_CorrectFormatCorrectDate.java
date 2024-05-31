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
public class CheckDate_CorrectFormatCorrectDate {

    @Test
    public void CheckDate_CorrectFormatCorrectDate() {
        assertEquals("31/1/2024 is correct date time!", DateUtil.checkDate("31", "1", "2024"));
        assertEquals("29/2/2000 is correct date time!", DateUtil.checkDate("29", "2", "2000"));
        assertEquals("28/2/1999 is correct date time!", DateUtil.checkDate("28", "2", "1999"));
        assertEquals("30/4/1975 is correct date time!", DateUtil.checkDate("30", "4", "1975"));

    }

}
