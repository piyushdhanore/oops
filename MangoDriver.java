public class MangoDriver 
{
    public static void main(String[] args) 
    {
        Mango m1 = new Mango();

        m1.color = "Green";
        m1.price = 200;
        m1.type = "Hapus";
        m1.location = "Ratnagiri";

        m1.showColor().showLocation().showPrice().showType();
    }
}
