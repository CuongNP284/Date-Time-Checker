package com.cuongnp.dtc.core;

public class DateUtil {

    public static int daysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return 0; // Invalid month returns 0 days
        }

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year in February
        if (month == 2 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            return 29;
        }

        return days[month - 1];
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12 || year < 0 || year > 4000) {
            return false;
        }
        return day >= 1 && day <= daysInMonth(month, year);
    }

    public static String checkDataTypes(String dateInput, String monthInput, String yearInput) {
        // Check data types of year, month, and date
        try {
            Integer.parseInt(yearInput);
        } catch (NumberFormatException e) {
            return "Invalid input: Wrong data type in Year.";
        }

        try {
            Integer.parseInt(monthInput);
        } catch (NumberFormatException e) {
            return "Invalid input: Wrong data type in Month.";
        }

        try {
            Integer.parseInt(dateInput);
        } catch (NumberFormatException e) {
            return "Invalid input: Wrong data type in Date.";
        }

        return "Valid";
    }

    public static String checkDate(String d, String m, String y) {
        String dataTypeCheck = checkDataTypes(d, m, y);
        if (!dataTypeCheck.equals("Valid")) {
            return dataTypeCheck;
        }

        int day = Integer.parseInt(d);
        int month = Integer.parseInt(m);
        int year = Integer.parseInt(y);

        if (day > 31 || day < 1) {
            return "Input Data for Day is out of range!";
        } else if (month > 12 || month < 1) {
            return "Input Data for Month is out of range!";
        } else if (year < 1000 || year > 3000) {
            return "Input Data for Year is out of range!";
        } else {
            if (isValidDate(day, month, year)) {
                return day + "/" + month + "/" + year + " is correct date time!";
            } else {
                return day + "/" + month + "/" + year + " is incorrect date time!";
            }
        }
    }
}