import employee.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Name empName1 = new Name("Joe", "Johnson");
        Name empName2 = new Name("Dennis", "Smith");
        Name empName3 = new Name("Danny", "Phantom");
        Name empName4 = new Name("Ed", "Eddy");

        employee employee1 = new HourlyEmployee(1, empName1, dateFormat.parse("2023-01-15"), dateFormat.parse("1990-05-20"), 45, 60);
        employee employee2 = new CommissionEmployee(2, empName2, dateFormat.parse("2023-02-10"), dateFormat.parse("1985-08-15"), 55000);
        employee employee3 = new HourlyEmployee(3, empName3, dateFormat.parse("2023-01-15"), dateFormat.parse("1991-06-21"), 43, 65);
        employee employee4 = new CommissionEmployee(4, empName4, dateFormat.parse("2023-02-10"), dateFormat.parse("1986-09-16"), 45000);

        System.out.println("Employee 1:");
        employee1.displayInfo();
        System.out.println();
        System.out.println("Employee 2:");
        employee2.displayInfo();
        System.out.println();
        System.out.println("Employee 3:");
        employee3.displayInfo();
        System.out.println();
        System.out.println("Employee 4:");
        employee4.displayInfo();
    }
}
