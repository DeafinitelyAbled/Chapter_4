import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class StudentRecords {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<StudentData> studentList = new ArrayList<StudentData>();
        StudentData studentInfo;
        String firstName;
        String lastName;
        String major;
        Integer studentYear;
        String command;
        int i;

        do {
            System.out.println("a - add; p - print; q - quit;");
            command = scnr.next();

            if (command.equals("a")) {
                System.out.print("Enter student's first name: ");
                firstName = scnr.next();
                System.out.print("Enter student's last name: ");
                lastName = scnr.next();
                System.out.print("Enter student's major name: ");
                major = scnr.next();
                System.out.print("Enter student's class of year: ");
                studentYear = scnr.nextInt();
                studentInfo = new StudentData(firstName, lastName, major, studentYear);
                studentList.add(studentInfo);
            }
            else if (command.equals("p")) {
                Collections.sort(studentList);
                System.out.println("Students: ");
                for (i = 0; i < studentList.size(); ++i) {
                    System.out.println(studentList.get(i).toString());
                }
            }

        } while (!command.equals("q"));

    }

}