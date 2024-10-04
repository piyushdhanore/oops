public class PatientDriver 
{
    public static void main(String[] args) {
        
        Patient p1 = new Patient();
        p1.displayPatient();
        System.out.println("------------------");

        Patient p2 = new Patient("John",32,"Male","Allergy",8380944353l,"Hamshire", "A+", 80, "04-July-1994");
        p2.displayPatient();
        System.out.println("-------------------");

        Patient p3 = new Patient("Miya",34,"female","Diabetes", 7387416532l,"Rampur", "O+", 69, "05-March-1983",4,"Dr.Ramesh"," "," ");
        p3.displayPatient();

    }
}
