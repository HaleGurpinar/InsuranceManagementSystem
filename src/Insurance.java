import java.util.Date;

public abstract class Insurance {

    private String insuranceName;
    private double insurancePrice;
    private Date insuranceDates;

    abstract double calculate();
}


//Special Health Insurance
class HealthInsurance extends Insurance{

    @Override
    public double calculate(){
        return 0;
    }
}

//House Insurance
class ResidenceInsurance extends Insurance{
    @Override
    public double calculate() {
        return 0;
    }
}

//Travel Insurance
class TravelInsurance extends Insurance{
    @Override
    public double calculate() {
        return 0;
    }}


//Car Insurance
class CarInsurance extends Insurance{
    @Override
    public double calculate() {
        return 0;
    }
}
