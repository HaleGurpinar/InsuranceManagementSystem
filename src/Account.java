import java.util.ArrayList;

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
}
