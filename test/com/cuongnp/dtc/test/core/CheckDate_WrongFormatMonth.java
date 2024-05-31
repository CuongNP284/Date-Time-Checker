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
public class CheckDate_WrongFormatMonth {

    @Test
    public void CheckDate_WrongFormatMonth() {
        assertEquals("Invalid input: Wrong data type in Month.", DateUtil.checkDate("28", "Hai", "1999"));
        assertEquals("Invalid input: Wrong data type in Month.", DateUtil.checkDate("30", "Tư", "1975"));
    }

}
