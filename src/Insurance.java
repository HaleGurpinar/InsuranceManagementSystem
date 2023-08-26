import java.util.Date;

public abstract class Insurance {

    private String insuranceName;
    private double insurancePrice;
    private Date insuranceDates;
    private User user;

    abstract double calculate(double insurancePrice);

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Date getInsuranceDates() {
        return insuranceDates;
    }

    public void setInsuranceDates(Date insuranceDates) {
        this.insuranceDates = insuranceDates;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
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
