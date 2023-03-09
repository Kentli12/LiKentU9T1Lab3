public class Taxi extends Car{

    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }


    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Total Fare Collected: " + fareCollected);
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

    public boolean chargeAndDropOffRiders(double farePerRider){
        int num = getPassengers()-1;
        fareCollected += (num * farePerRider);
        return(dropOffPassengers(num));
    }

    @Override
    public void flash(){
        System.out.println("The lights flashed in intervals");
    }
}
