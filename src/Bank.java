import java.util.Scanner;

public class Bank {

    String name;
    String password;
    int account_number;
    float account_balance = 10;
    float addMoney;
    float with_Drew_Money;

    public Bank() {
        this.name = name;
        this.password = password;
        this.account_number = account_number;
        this.account_balance = account_balance;
    }

    public String getName() {
        return name = "MN";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public float getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance() {
        this.account_balance = account_balance;
    }

    public float getAddMoney() {

        float account_balance_after_add_Money = account_balance + addMoney;
        return account_balance = account_balance_after_add_Money;
    }

    public void setAddMoney() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter how much you want add");
        addMoney = s1.nextFloat();
        this.addMoney = addMoney;
    }

    public float getWith_Drew_Money() {
        if (account_balance < with_Drew_Money) {
            return Float.parseFloat(" you do not have enough balance");

        } else {

            float account_balance_after_with_Drew_Money = account_balance - with_Drew_Money;
            return account_balance = account_balance_after_with_Drew_Money;
        }
    }

    public void setWith_Drew_Money() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter how much you want wit drew");
        with_Drew_Money = s1.nextFloat();

        this.with_Drew_Money = with_Drew_Money;
    }

    public void setAddMony(float addMoney) {
        this.addMoney = addMoney;
    }

    public String getPassword() {
        return password = "1234";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", account_number=" + account_number +
                ", account_balance=" + account_balance +
                '}';
    }

    public static void menu() {
        int y = 2;
        do {


            Bank bank = new Bank();
            Scanner s2 = new Scanner(System.in);
            System.out.println("Enter name");
            String your_Name = s2.nextLine();
            if (your_Name.equalsIgnoreCase(bank.getName())) {
                System.out.println("Enter password");
                String password = s2.nextLine();
                if (password.equalsIgnoreCase(bank.getPassword())) {
                    int x = 0;


                    System.out.println("welcome");
                    do {
                        try {


                            System.out.println("___________________________________");
                            System.out.println(" enter your choice");
                            System.out.println("1. add a money");
                            System.out.println("2. with drew a money");
                            System.out.println(" 3. account balance");
                            System.out.println("4. exit");

                            Scanner s3 = new Scanner(System.in);

                            int choice = s3.nextInt();
                            switch (choice) {
                                case 1:
                                    bank.setAddMoney();
                                    System.out.println(bank.getAddMoney());
                                    break;
                                case 2:
                                    bank.setWith_Drew_Money();
                                    System.out.println(bank.getWith_Drew_Money());
                                    break;
                                case 3:
                                    bank.setAccount_balance();
                                    System.out.println(bank.account_balance);
                                case 4:
                                    x = 1;
                                    y=3;
                                    System.out.println("bye");
                                    break;

                                default:
                                    System.out.println("Enter valid number from 1-4");
                            }
                        } catch (Exception e) {
                            System.out.println("Enter  number from the menu");
                        }
                    }
                    while (x == 0);

                } else {
                    System.out.println(" invalid password");
                }
            } else {
                System.out.println(" the name is invalid");

            }
        } while (y == 2);

    }

    public static void main(String[] args) {

        menu();
    }
}
