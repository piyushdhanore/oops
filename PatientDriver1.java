public class PatientDriver1 
{
    public static void main(String[] args) {
        
        Patient1 p1 = new Patient1();
        p1.displayPatient1();
        System.out.println("------------------");

        Patient1 p2 = new Patient1("John",32,"Male","Allergy",8380944353l,"Hamshire", "A+", 80, "04-July-1994");
        p2.displayPatient1();
        System.out.println("-------------------");

        Patient1 p3 = new Patient1("Miya",34,"female","Diabetes", 7387416532l,"Rampur", "O+", 69, "05-March-1983",4,"Dr.Ramesh"," "," ");
        p3.displayPatient1();
    }
}
