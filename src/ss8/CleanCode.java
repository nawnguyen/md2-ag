package ss8;

class EmployeeInfo {
    private String name;
    private int age;
    private String awards;
    private String ctc;
    private String expirience;

    public EmployeeInfo(String name, int age, String awards, String ctc, String expirience) {
        this.name = name;
        this.age = age;
        this.awards = awards;
        this.ctc = ctc;
        this.expirience = expirience;
    }
}


public class CleanCode {
    public int caculateTotal(int first, int second, int third) {
        return first + second + third;
    }


    public boolean isLeapYear(int year) {
        boolean divisibleBy4 = year % 4 == 0;
        boolean divisibleBy100 = year % 100 ==0;
        boolean divisibleBy400 = year % 400 == 0;
        return (divisibleBy4 && !divisibleBy100) || divisibleBy400;
    }

    public int getDayOfMonth(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };
    }
}