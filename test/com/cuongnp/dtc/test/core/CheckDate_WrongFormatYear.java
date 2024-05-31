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
public class CheckDate_WrongFormatYear {

    @Test
    public void CheckDate_WrongFormatYear() {
assertEquals("Invalid input: Wrong data type in Year.", DateUtil.checkDate("29", "2", "Một chín mười một"));
assertEquals("Invalid input: Wrong data type in Year.", DateUtil.checkDate("31", "4", "Một chín chín chín"));
    }

}
