public class Truck extends Vehicle {
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public int getAxles() {
    return axles;
  }
  public boolean isHasTrailer(){
    return hasTrailer;
  }

 @Override
 public void printInfo(){
    super.printInfo();
    System.out.println("Numbers of Axels: " + axles);
    System.out.println("Has Trailer: " + isHasTrailer());
 }

  public boolean validateLicensePlate() {
    if (isHasTrailer() == false) {
      return true;
    } else if (isHasTrailer() && getAxles() > 4) {
      if (getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX")) {
        return true;
      }
    } else if (isHasTrailer() && getAxles() <= 4) {
      if (getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX")) {
        return true;
      }
    }
    return false;
  }

  @Override
  public double calculateTollPrice(){
    if(isHasTrailer()){
      return 2*(getAxles()*getTollFee());
    }else{
      return (getAxles()*getTollFee());
    }
  }

}