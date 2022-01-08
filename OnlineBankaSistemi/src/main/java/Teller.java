package OnlineBankaSistemi.src.main.java;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 *
 *
 */
public class Teller extends Users {

    private Customer customer;
    private Account customer_account;
    private LinkedList<Deposit> customer_deposit;
    private LinkedList<Withdraw> customer_withdraw;
    private LinkedList<Card> customer_card;
    private LinkedList<Loan> customer_loan;

    /**
     *
     * @param user_id
     * @param user_name
     * @param user_email
     * @param user_gender
     * @param user_date_of_birth
     * @param user_address
     * @param user_phone
     * @param username
     * @param password
     */
    public Teller(int user_id, String user_name, String user_email, String user_gender, String user_date_of_birth, String user_address, String user_phone, String username, String password) {
        super(user_id, user_name, user_email, user_address, user_phone, username, password);
    }

    /**
     *
     * @param user_id
     * @param user_name
     * @param user_email
     * @param user_age
     * @param user_gender
     * @param user_date_of_birth
     * @param user_address
     * @param user_phone
     * @param username
     * @param password
     */
    public Teller(int user_id, String user_name, String user_email, int user_age, Gender user_gender, LocalDate user_date_of_birth, String user_address, String user_phone, String username, String password) {
        super(user_id, user_name, user_email, user_age, user_gender, user_date_of_birth, user_address, user_phone, username, password);
    }

    /**
     *
     * @return customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     *
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     *
     * @return customer_account
     */
    public Account getCustomer_account() {
        return customer_account;
    }

    /**
     *
     * @param customer_account
     */
    public void setCustomer_account(Account customer_account) {
        this.customer_account = customer_account;
    }

    /**
     *
     * @return customer_deposit
     */
    public LinkedList<Deposit> getCustomer_deposit() {
        return customer_deposit;
    }

    /**
     *
     * @param customer_deposit
     */
    public void setCustomer_deposit(LinkedList<Deposit> customer_deposit) {
        this.customer_deposit = customer_deposit;
    }

    /**
     *
     * @param customer_deposit
     */
    public void setCustomer_deposit(Deposit customer_deposit) {
        this.customer_deposit = new LinkedList<>();
        this.customer_deposit.add(customer_deposit);
    }

    /**
     *
     * @return customer_withdraw
     */
    public LinkedList<Withdraw> getCustomer_withdraw() {
        return customer_withdraw;
    }

    /**
     *
     * @param customer_withdraw
     */
    public void setCustomer_withdraw(LinkedList<Withdraw> customer_withdraw) {
        this.customer_withdraw = customer_withdraw;
    }

    /**
     *
     * @param customer_withdraw
     */
    public void setCustomer_withdraw(Withdraw customer_withdraw) {
        this.customer_withdraw = new LinkedList<>();
        this.customer_withdraw.add(customer_withdraw);
    }

    /**
     *
     * @return customer_card
     */
    public LinkedList<Card> getCustomer_card() {
        return customer_card;
    }

    /**
     *
     * @param customer_card
     */
    public void setCustomer_card(LinkedList<Card> customer_card) {
        this.customer_card = customer_card;
    }

    /**
     *
     * @param customer_card
     */
    public void setCustomer_card(Card customer_card) {
        this.customer_card = new LinkedList<>();
        this.customer_card.add(customer_card);
    }

    /**
     *
     * @return customer_loan
     */
    public LinkedList<Loan> getCustomer_loan() {
        return customer_loan;
    }

    /**
     *
     * @param customer_loan
     */
    public void setCustomer_loan(LinkedList<Loan> customer_loan) {
        this.customer_loan = customer_loan;
    }

    /**
     *
     * @param customer_loan
     */
    public void setCustomer_loan(Loan customer_loan) {
        this.customer_loan = new LinkedList<>();
        this.customer_loan.add(customer_loan);
    }

}
