public class Patient 
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

    Patient()
    {

    }

    {
        System.out.println(name+" Patient added Successfully");
    }

    Patient(String name, int age, String gender, String problem, long phone, String address, String blood, double wt, String DoB)
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

    Patient(String name, int age, String gender, String problem, long phone, String address, String blood, double wt, String DoB, int ward)
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
        wardno = ward;
    }

    Patient(String name, int age, String gender, String problem, long phone, String address, String blood, double wt, String DoB, int ward, String doctor)
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
        wardno = ward;
        this.doctor=doctor;
    }

    Patient(String name, int age, String gender, String problem, long phone, String address, String blood, double wt, String DoB, int ward, String doctor, String test)
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
        wardno = ward;
        this.doctor=doctor;
        this.test=test;
    }

    Patient(String name, int age, String gender, String problem, long phone, String address, String blood, double wt, String DoB, int ward, String doctor, String test, String DoD)
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
        wardno = ward;
        this.doctor=doctor;
        this.test=test;
        this.DoD=DoD;
    }

    public void displayPatient()
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
