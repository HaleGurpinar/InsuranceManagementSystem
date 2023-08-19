import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class User {

    private String name;
    private  String surname;
    private String email;
    private String password;
    private String job;
    private int age;
    private Date date;

    private final ArrayList<Address> addressList;
    static private final ArrayList<Insurance> InsuranceList = new ArrayList<>();

    public User(String name, String surname, String email, String password, String job, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.addressList= new ArrayList<>();
        this.date = null;
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public static ArrayList<Insurance> getInsuranceList(){
        return InsuranceList;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public String getLastLogin(){
        return date.toString();    }

    public Date setLastLogin(){
        return date=Date.from(Instant.now());
    }
}
