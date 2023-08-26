import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
    TreeSet<Account> accounts;
    Account account;
    User currentUser;

    public void login(String email, String password){
        for (Account account1: accounts){

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

    }

    public  TreeSet<Account>getAccounts(){
        return accounts;
    }

}
