public class VehicleDemo
{
    public static void main(String args[])
    {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sport = new Vehicle(2, 14, 12);

        System.out.println("Minivan Range: " + minivan.range());
        System.out.println("Sportscar Range: " + sport.range());        
    }
}