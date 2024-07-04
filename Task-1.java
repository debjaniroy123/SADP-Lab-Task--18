public class Account {

    private String name;
    private double balance;

    Account(String name) {
      System.out.println("name:"+name); 
    }

    Account(double balance) {
        System.out.println("balance:" + balance);
      
    }
        
    public static void main(String[] args) {
        Account account = new Account("karim");
        Account account2 = new Account(345.78);
    }

    public void display(String name,double balance) {
         System.out.println("name:"+name);
        System.out.println("balance:" + balance);

    }

}
