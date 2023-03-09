public class VehicleRunner {
  public static void main(String[] args) {
      Vehicle something = new Vehicle("Wagon", 4.65, 4);
      something.flash();
      Car myCar = new Car("MK4567", 6.75, 4, true);
      myCar.flash();

      Truck myTruck = new Truck("TB12MX", 15.50, 2, 4, true);
      myTruck.flash();

      Taxi myTaxi = new Taxi("TX1412", 13.75, 4, true, 2.0);
      myTaxi.flash();

  }
}