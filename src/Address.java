public interface Address {

    public void add(String address);
    public void remove();
    public void update(String address);
}

class HomeAdress implements Address{
    private String address;

    public HomeAdress(String address) {
        this.address = address;
    }

    public HomeAdress() {
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
    public static void addAddress(){}
    public static void removeAddress(){}
}
