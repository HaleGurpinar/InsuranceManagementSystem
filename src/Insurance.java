import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public abstract class Insurance {

    private String insuranceName;
    private double insurancePrice;
    private Date insuranceDates;
    private User user;


    public Insurance(String insuranceName, double insurancePrice, Date insuranceDates,User user) {
        this.insuranceName = insuranceName;
        this.insurancePrice = insurancePrice;
        this.insuranceDates = insuranceDates;
        this.user = user;
    }

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
    public HealthInsurance(String insuranceName, double insurancePrice, Date insuranceDates,User user) {
        super(insuranceName, insurancePrice, insuranceDates,user);
    }

    @Override
    public double calculate(double insurancePrice){
        return 0;
    }
}

//House Insurance
class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String insuranceName, double insurancePrice, Date insuranceDates,User user) {
        super(insuranceName, insurancePrice, insuranceDates,user);
    }

    @Override
    public double calculate(double insurancePrice) {
        return 0;
    }
}

//Travel Insurance
class TravelInsurance extends Insurance{
    public TravelInsurance(String insuranceName, double insurancePrice, Date insuranceDates,User user) {
        super(insuranceName, insurancePrice, insuranceDates,user);
    }

    @Override
    public double calculate(double insurancePrice) {
        return 0;
    }}


//Car Insurance
class CarInsurance extends Insurance{
    public CarInsurance(String insuranceName, double insurancePrice, Date insuranceDates,User user) {
        super(insuranceName, insurancePrice, insuranceDates,user);
    }

    @Override
    public double calculate(double insurancePrice) {
        return 0;
    }
}
class InsuranceManager{
    User user;

    public InsuranceManager() {
    }
    public Insurance createInsurance(User user){
        Scanner src = new Scanner(System.in);
        System.out.println("Select one of Insurance : "+
                "\n 1 - Health "+
                "\n 2 - Residence "+
                "\n 3 - Travel " +
                "\n 4 - Car ");
        String choice =src.nextLine();
        System.out.print("Enter amount :");
        double price =src.nextInt();

        if (choice.equals("1")) return new HealthInsurance("Health Insurance",1.98,Date.from(Instant.now()), user);
        if (choice.equals("2")) return new ResidenceInsurance("Residence Insurance",1.46,Date.from(Instant.now()),user);
        if (choice.equals("3")) return new TravelInsurance("Travel Insurance ",1.30,Date.from(Instant.now()),user);
        return new CarInsurance("Car Insurance",1.50,Date.from(Instant.now()),user);
    }
}
