package academy.learnprogramming.challenges;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

//        switch(month) {
//            case month < 1:

        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else if (isLeapYear(year)) {

            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    return 31;
                case 2:
                    return 29;
                case 4, 6, 9, 11:
                    return 30;
                default:
                    return -1;
            }
        } else if (!isLeapYear(year)) {

            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    return 31;
                case 2:
                    return 28;
                case 4, 6, 9, 11:
                    return 30;
                default:
                    return -1;
            }
        }
        return -1;
    }
}
