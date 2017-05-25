public class App {
  public static void main(String[] args) {

    Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
    Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
    Vehicle sedan = new Vehicle(2015, "Toyota", "Camry", 50000, 30000);
    Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
    Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);
    
    Vehicle[] allVehicles = {hatchback, suv, sedan, truck, crossover};
    
    System.out.println("All Vehicles:");
    for (Vehicle individualVehicle: allVehicles) {
      System.out.println( "----------------------" );
      System.out.println(individualVehicle.getYear());
      System.out.println(individualVehicle.getBrand());
      System.out.println(individualVehicle.getModel());
      System.out.println(individualVehicle.getMiles());
      System.out.println(individualVehicle.getPrice());
    }
  }
}