public class Student 
{
    String name;
    String college;
    int age;
    int std;
    int roll;

    Student()
    {

    }

    Student(String name, String college, int age, int std, int roll)
    {
        this.name=name;
        this.college=college;
        this.age=age;
        this.std = std;
        this.roll = roll;
    }

    public void displayStudent()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(college);
        System.out.println(std);
        System.out.println(roll);
    }
}
