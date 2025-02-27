public class RewardValue {
    // Fields
    private double cash;
    private double miles;
    private final double CONVERSION_RATE = 0.0035;

    // Constructors
    public RewardValue(double cash){
        if(cash < 0){
            throw new IllegalArgumentException("Cash cannot be negative");
        }else{
            this.cash = cash;
            this.miles = cash / CONVERSION_RATE;
        }
    }
    public RewardValue(int miles){
        if(miles < 0){
            throw new IllegalArgumentException("Miles cannot be negative");

        }else{
            this.miles = miles;
            this.cash = miles * CONVERSION_RATE;
        }
    }

 // Methods

    /**
     * This method will get the cash value
     * @return cash value of the mileage amount
     */
    public double getCashValue(){
        return this.cash;
    }

    /**
     * This method will get the miles value
     * @return mile value of cash amount
     */
    public double getMilesValue(){
        return this.miles;
    }
}
