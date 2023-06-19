public class StudentData implements Comparable<StudentData> {
    private String firstName;
    private String lastName;
    private String major;
    private Integer studentYear;

    StudentData(String firstName, String lastName, String major, Integer studentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.studentYear = studentYear;
    }

    @Override
    public int compareTo(StudentData otherStudent) {
        int result;
        String fullName = firstName + lastName;
        String otherFullName = otherStudent.firstName + otherStudent.lastName;

        result = fullName.compareTo(otherFullName);

        if (result == 0) {
            result = major.compareTo(otherStudent.major);
        }

        return result;
    }

    public String toString() {
        return firstName + " " + lastName + " " + " \tMajor: " + major + " \tClass of Year: " + studentYear;
    }

}