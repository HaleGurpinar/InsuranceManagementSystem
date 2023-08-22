import java.util.Date;

public abstract class Insurance {

    private String insuranceName;
    private double insurancePrice;
    private Date insuranceDates;
    private User user;

    abstract double calculate(double insurancePrice);
}


//Special Health Insurance
class HealthInsurance extends Insurance{

    @Override
    public double calculate(double insurancePrice){
        return 0;
    }
}

//House Insurance
class ResidenceInsurance extends Insurance{
    @Override
    public double calculate(double insurancePrice) {
        return 0;
    }
}

//Travel Insurance
class TravelInsurance extends Insurance{
    @Override
    public double calculate(double insurancePrice) {
        return 0;
    }}


//Car Insurance
class CarInsurance extends Insurance{
    @Override
    public double calculate(double insurancePrice) {
        return 0;
    }
}
