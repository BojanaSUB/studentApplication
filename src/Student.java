public class Student {
    private String name;
    private String lastName;
    private String indexNumber;

    public Student(String studentName, String studentLastName, String index)
    {
        name = studentName;
        lastName = studentLastName;
        indexNumber = index;
    }

    public String getStudentData()
    {
        String studentData = "Student" + this.name +" "+ this.lastName+" " +this.indexNumber;

        System.out.println(studentData);

        return  studentData;
    }
}
