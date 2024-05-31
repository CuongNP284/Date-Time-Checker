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
public class CheckDate_WrongFormatDay {
    
    @Test
    public void CheckDate_WrongFormatDay() {
        assertEquals("Invalid input: Wrong data type in Date.", DateUtil.checkDate("Ba mươi mốt", "1", "2024"));
        assertEquals("Invalid input: Wrong data type in Date.", DateUtil.checkDate("Hai mươi chín", "2", "2000"));
    }
}
