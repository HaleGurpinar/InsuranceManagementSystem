import java.util.ArrayList;
import java.util.Objects;

abstract public class Account implements Comparable<Account>{

    private User user;
    enum AuthenticationStatus{ SUCCESS, FAIL }
    AuthenticationStatus status;

    ArrayList<Insurance> insuranceArrayList;

    private final void showUserInfo(){
        System.out.println("User Information");
        System.out.println("Name: "+user.getName()+"Surname: "+ user.getSurname()+"Job"+user.getJob()+"Age"+ user.getAge());
    }

    public void login(String email, String password) throws InvalidAuthenticationException{
        if (user.getEmail().equals(email) && user.getPassword().equals(password)){
            status=AuthenticationStatus.SUCCESS;
            user.setLastLogin();
        }else {
            status=AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Invalid Password or Email !!!");
        }
    }

    public abstract void addAddress(Address address);
    public abstract void removeAddress(Address address);

    public boolean isLogin(){
        return status==AuthenticationStatus.SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AuthenticationStatus getStatus() {
        return status;
    }

    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }

    public ArrayList<Insurance> getInsuranceArrayList() {
        return insuranceArrayList;
    }

    public void setInsuranceArrayList(ArrayList<Insurance> insuranceArrayList) {
        this.insuranceArrayList = insuranceArrayList;
    }

    public abstract void addInsurance(Insurance i);

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return  true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account=(Account) obj;
        return Objects.equals(user,account.user);

    }
}
