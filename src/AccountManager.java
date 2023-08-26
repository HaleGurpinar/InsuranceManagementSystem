import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
    TreeSet<Account> accounts;
    Account account;
    User currentUser;

    public void login(String email, String password){
        for (Account account1: accounts){
            try {
                account1.login(email, password);
                if (account1.isLogin()){
                    currentUser= account1.getUser();
                    this.account=account;
                    if (account1.getType()==1)
                        individualProcess();
                }
            }catch (InvalidAuthenticationException e){
                System.out.println(e);
            }
        }
    }

    public void run(){
        Scanner sc= new Scanner(System.in);

        System.out.println(" 1. Create an Account"+"\n 2. Login Account"+"\n 3. Admin Login"+"\n 4. Exit");
        System.out.println("Select Menu");
        int select=sc.nextInt();
        switch (select){
            case 1:
                createAccount();
                break;
            case 2:
                System.out.print("Enter email : ");
                String email = sc.nextLine();
                System.out.print("\nEnter password : ");
                String password = sc.nextLine();
                login(email,password);
                break;
            case 3:
                System.out.println("Printing all accounts and passwords in the system ...");
                for (Account a: getAccounts())
                    System.out.println("Email : "+a.getUser().getEmail()+" \nPassword : "+a.getUser().getPassword());

                System.out.println("Printing all InsuranceList in the system ...");
                for (Insurance a:User.getInsuranceList())
                    System.out.println("\nCustomer name : "+a.getUser().getName()+"\nInsurance Name : "+a.getInsuranceName()+"\nTotal price : "+a.getInsurancePrice());
                break;
            default:
                System.out.println("Invalid selection");
        }
    }

    public void createAccount(){
        Scanner scn = new Scanner(System.in);

        String name, surname, email, password, job;
        int age;
        System.out.print("Enter name : "); name = scn.nextLine();
        System.out.print("Enter surname : "); surname = scn.nextLine();
        System.out.print("Enter email : "); email = scn.nextLine();
        System.out.print("Enter password : "); password = scn.nextLine();
        System.out.print("Enter job : "); job = scn.nextLine();
        System.out.print("Enter age : "); age = scn.nextInt();
        User user = new User(name, surname, email, password, job, age);

        System.out.println("Are you individual (1 for yes 0 for no) : ");
        name = scn.nextLine();
        Account prop;
        if(name.equals("1")){
            prop = new Individual(user);
        }
        else{
            prop = new Enterprise(user);
        }
        accounts.add(prop);
    }
    public void individualProcess(){
        System.out.println("Welcome " +currentUser.getName());
        String choice ="1";
        while (!choice.equals("q")){
            Scanner src = new Scanner(System.in);
            System.out.println("\n1-) Show my Information");
            System.out.println("2-) Get Insurance");
            System.out.println("3-) Show Insurance List");
            System.out.println("4-) Add Address");
            System.out.println("5-) Show All Address");
            choice = src.nextLine();

            if (choice.equals("1")){
                account.showUserInfo();
            } else if (choice.equals("2")) {
                InsuranceManager insuranceManager =new InsuranceManager();
                account.addInsurance(insuranceManager.createInsurance(currentUser));
            } else if (choice.equals("3")) {
                for (Insurance insurance: account.getUser().getInsuranceList()) {
                    System.out.print(" \n  Name : "+ insurance.getInsuranceName());
                    System.out.println("Price : "+insurance.getInsurancePrice());
                }
            } else if (choice.equals("4")) {
                account.addAddress(AddressManager.createHomeAddress());
            } else if (choice.equals("5")) {
                for (Address address:currentUser.getAddressList()){
                    System.out.println(currentUser.getAddressList());
                }
            }


        }
    }

    public  TreeSet<Account>getAccounts(){
        return accounts;
    }
    public void enterpriseUserProcess(){

    }
}
