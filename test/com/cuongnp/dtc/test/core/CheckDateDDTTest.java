/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.cuongnp.dtc.test.core;

import com.cuongnp.dtc.core.DateUtil;
import java.util.Arrays;
import java.util.Collection;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


/**
 *
 * @author phucu
 */
@RunWith(Parameterized.class)
public class CheckDateDDTTest {

    @Parameterized.Parameter(0) // value = 0 là map với mảng data
    public String day; // biến map với value của cột 0 của mảng

    @Parameterized.Parameter(1) // value = 1 là map với mảng data
    public String month; // biến map với value của cột 1 của mảng

    @Parameterized.Parameter(2) // value = 2 là map với mảng data
    public String year; // biến map với value của cột 2 của mảng

    @Parameterized.Parameter(3) // value = 3 là map với mảng data
    public String expected; // kiểu String vì giá trị trả về của hàm checkDate() là String

    @Parameters
    public static Collection<Object[]> initData() {
        return Arrays.asList(new Object[][]{
            {"1", "1", "2024", "1/1/2024 is correct date time!"}, 
            {"Hai", "1", "2024", "Invalid input: Wrong data type in Date."}, 
            {"5", "Ba", "2024", "Invalid input: Wrong data type in Month."}, 
            {"7", "1", "Hai Không Hai Ba", "Invalid input: Wrong data type in Year."}, 
            {"30", "2", "2024", "30/2/2024 is incorrect date time!"},
            {"32", "5", "2024", "Input Data for Day is out of range!"},
            {"25", "16", "2024", "Input Data for Month is out of range!"},
            {"25", "02", "4000", "Input Data for Year is out of range!"}
        });
    }
    @Test
    public void testCheckDateGivenRightArgReturnNotiString() {
        assertEquals(expected, DateUtil.checkDate(day, month, year));
    }
}