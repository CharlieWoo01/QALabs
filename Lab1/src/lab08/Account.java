package lab08;

public class Account {

    /**
     * Define fields of class.
     */
    private int id;

    private String owner;

    private double balance = 0.0;

    /**
     * Method to construct
     * @param id
     * @param owner
     */
    public Account(int id, String owner) {
        setId(id);
        setOwner(owner);
    }

    /**
     * Method to validate that the amount entered is positive.
     * @param amount
     * @return
     */
    public boolean validNumber(double amount) {
        return (amount > 0) ? true : false;
    }

    /**
     * Method to validate that the amount entered is possible for the user to withdraw.
     * @param amount
     * @param balance
     * @return
     */
    public boolean validatePossibleAmount(double amount, double balance) {
        return ((balance - amount) > 0) ? true : false;
    }

    /**
     * Method to get ID
     * @return
     */
    protected int getId() {
        return id;
    }

    /**
     * Method to set ID
     * @param id
     */
    protected void setId(int id) {
        this.id = id;
    }

    /**
     * Method to get owner
     * @return
     */
    protected String getOwner() {
        return owner;
    }

    /**
     * Method to set owner
     * @param owner
     */
    protected void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Method to get balance.
     * @return
     */
    protected double getBalance() {
        return balance;
    }

    /**
     * Method to set balance if all is ok (Not negative)
     * @param balance
     */
    protected void setBalance (double balance) {
       if (validNumber(balance))
            this.balance = balance;
       else
            throw new RuntimeException("Balance cannot be a negative value. ");
    }

    /**
     * Method to deposit the amount into the account.
     * @param amount
     */
    protected void deposit(double amount) {
        setBalance(amount);
    }

    /**
     * Method to withdraw the amount from the account if validation is ok
     * @param amount
     */
    protected void withdraw (double amount) {
        if (validatePossibleAmount(amount, getBalance()))
            setBalance(amount);
        else
            throw new RuntimeException("You cannot withdraw a value which creates a negative balance. ");
    }

    /**
     * Method to add interest of 2.5 %
     */
    public void addInterest() {
        double myBalance = getBalance();
        setBalance(myBalance + (myBalance * 0.025));
    }

    /**
     * Method to get the details of the account for the user.
     */
    protected void getDetails() {
        System.out.println("ID: " + getId() + " Owner:" + getOwner() + " Balance: " + getBalance());
    }
}