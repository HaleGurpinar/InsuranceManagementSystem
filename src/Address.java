import java.util.Scanner;

public interface Address {

    public void add(String address);
    public void remove();
    public void update(String address);
}

class HomeAddress implements Address{
    private String address;

    public HomeAddress(String address) {
        this.address = address;
    }

    public HomeAddress() {
        super();
    }

    @Override
    public void add(String address) {

    }

    @Override
    public void remove() {

    }

    @Override
    public void update(String address) {

    }
}

class BusinessAddress implements Address{


    public BusinessAddress() {
        super();
    }

    @Override
    public void add(String address) {

    }

    @Override
    public void remove() {

    }

    @Override
    public void update(String address) {

    }
}

 class AddressManager {
    User user;
    public static void addAddress(User user,Address address){
        user.getAddressList().add(address);
    }
     public static void removeAddress(User user,Address address){
         user.getAddressList().remove(address);
     }

     public static  Address createHomeAddress(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Home Address: ");
         String homeaddr=sc.nextLine();
         return new HomeAddress(homeaddr);
     }

     public static  Address createBusinessAddress(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Business Address: ");
         String businessaddr=sc.nextLine();
         return new HomeAddress(businessaddr);
     }

}
