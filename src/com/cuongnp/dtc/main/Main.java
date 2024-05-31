/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cuongnp.dtc.main;

import com.cuongnp.dtc.core.DateUtil;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author phucu
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String d, m, y;
        System.out.print("Enter Day = ");
        d = sc.nextLine();
        System.out.print("Enter Month = ");
        m = sc.nextLine();
        System.out.print("Enter Year = ");
        y = sc.nextLine();
        DateUtil du = new DateUtil();
        
        System.out.println(du.checkDate(d, m, y));
        }
    }
