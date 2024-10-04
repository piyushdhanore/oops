public class StudentDriver 
{
    public static void main(String[] args) {
        
        Student s1 = new Student("Raju","FC college",18, 12, 21);

        s1.displayStudent();

        System.out.println("----------------");

        Student s2 = new Student("Rani","Mordern college",20, 12, 34);

        s2.displayStudent();

        System.out.println("----------------");

        Student s3 = new Student();
        s3.displayStudent();


    }    
}
