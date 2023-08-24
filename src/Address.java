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

}
