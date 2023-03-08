public class Taxi extends Car{

    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi(){
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: "   + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric: " + isElectric());
        System.out.println("Discount Applied: " + isDiscountApplied());
        System.out.println("Fare Collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider){
        setPassengers(getPassengers()+numRiders);
        if(!isDiscountApplied()  && getPassengers()>= 4){
            setTollFee(getTollFee()*0.5);
            addDiscount();
        }
        fareCollected += numRiders * farePerRider;
    }
    public double getFareCollected(){
        return fareCollected;
    }


}
