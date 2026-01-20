class Date {
     int day, month, year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date d = new Date(17,1, 2026);
        d.displayDate();
    }
}