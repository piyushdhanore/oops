public class Patient1 
{
    String hospital = "St. Xavier School for X-men ";
    String name;
    int age;
    String gender;
    String problem;
    long phone;
    String address;
    String blood;
    int wardno;
    String doctor;
    String test;
    double weight;
    String DoB;
    String DoD;

    Patient1()
    {

    }

    {
        System.out.println(name+" Patient added Successfully");
    }

    Patient1(String name, int age, String gender, String problem, long phone, String address, String blood, double wt, String DoB)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.phone=phone;
        this.blood=blood;
        weight=wt;
        this.address=address;
        this.DoB=DoB;
        this.problem=problem;
    }

    Patient1(String name, int age, String gender, String problem, long phone, String address, String blood, double wt, String DoB, int ward)
    {
        this(name, age, gender, problem, phone, address, blood, wt, DoB);
        wardno = ward;
    }

    Patient1(String name, int age, String gender, String problem, long phone, String address, String blood, double wt, String DoB, int ward, String doctor)
    {
        this(name, age, gender, problem, phone, address, blood, wt, DoB, ward);
        this.doctor=doctor;
    }

    Patient1(String name, int age, String gender, String problem, long phone, String address, String blood, double wt, String DoB, int ward, String doctor, String test)
    {
        this(name, age, gender, problem, phone, address, blood, wt, DoB, ward, doctor);
        this.test=test;
    }

    Patient1(String name, int age, String gender, String problem, long phone, String address, String blood, double wt, String DoB, int ward, String doctor, String test, String DoD)
    {
        this(name, age, gender, problem, phone, address, blood, wt, DoB, ward, doctor, test);
        this.DoD=DoD;
    }

    public void displayPatient1()
    {
        System.out.println(hospital);
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phone);
        System.out.println(blood);
        System.out.println(weight);
        System.out.println(address);
        System.out.println(DoB);
        System.out.println(problem);
        System.out.println(wardno);
        System.out.println(doctor);
        System.out.println(test);
        System.out.println(DoD);
    }
}

