package OnlineBankaSistemi.src.main.java;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 *
 *
 */
public class Customer extends User {

    private LinkedList<onlineBankSystem.Card> customer_card;
    private onlineBankSystem.Account customer_account;
    private LinkedList<Transaction> customer_transaction;
    private LinkedList<onlineBankSystem.Loan> customer_loan;
    private LinkedList<Deposit> customer_deposit;
    private LinkedList<onlineBankSystem.Withdraw> customer_withdraw;

    /**
     *
     * @param customer_card
     * @param customer_account
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
    public Customer(LinkedList<onlineBankSystem.Card> customer_card, onlineBankSystem.Account customer_account, int user_id, String user_name, String user_email, String user_gender, String user_date_of_birth, String user_address, String user_phone, String username, String password) {
        super(user_id, user_name, user_email, user_gender, user_date_of_birth, user_address, user_phone, username, password);
        this.customer_card = customer_card;
        this.customer_account = customer_account;
    }

    /**
     *
     * @param customer_card
     * @param customer_account
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
    public Customer(LinkedList<onlineBankSystem.Card> customer_card, onlineBankSystem.Account customer_account, int user_id, String user_name, String user_email, int user_age, Gender user_gender, LocalDate user_date_of_birth, String user_address, String user_phone, String username, String password) {
        super(user_id, user_name, user_email, user_age, user_gender, user_date_of_birth, user_address, user_phone, username, password);
        this.customer_card = customer_card;
        this.customer_account = customer_account;
    }

    /**
     *
     * @return customer_card
     */
    public LinkedList<onlineBankSystem.Card> getCustomer_card() {
        return customer_card;
    }

    /**
     *
     * @param customer_card
     */
    public void setCustomer_card(LinkedList<onlineBankSystem.Card> customer_card) {
        this.customer_card = customer_card;
    }

    /**
     *
     * @param customer_card
     */
    public void setCustomer_card(onlineBankSystem.Card customer_card) {
        this.customer_card = new LinkedList<>();
        this.customer_card.add(customer_card);
    }

    /**
     *
     * @return customer_account
     */
    public onlineBankSystem.Account getCustomer_account() {
        return customer_account;
    }

    /**
     *
     * @param customer_account
     */
    public void setCustomer_account(onlineBankSystem.Account customer_account) {
        this.customer_account = customer_account;
    }

    /**
     *
     * @return customer_transaction
     */
    public LinkedList<Transaction> getCustomer_transaction() {
        return customer_transaction;
    }

    /**
     *
     * @param customer_transaction
     */
    public void setCustomer_transaction(LinkedList<Transaction> customer_transaction) {
        this.customer_transaction = customer_transaction;
    }

    /**
     *
     * @param customer_transaction
     */
    public void setCustomer_transaction(Transaction customer_transaction) {
        this.customer_transaction = new LinkedList<>();
        this.customer_transaction.add(customer_transaction);
    }

    /**
     *
     * @return customer_loan
     */
    public LinkedList<onlineBankSystem.Loan> getCustomer_loan() {
        return customer_loan;
    }

    /**
     *
     * @param customer_loan
     */
    public void setCustomer_loan(LinkedList<onlineBankSystem.Loan> customer_loan) {
        this.customer_loan = customer_loan;
    }

    /**
     *
     * @param customer_loan
     */
    public void setCustomer_loan(onlineBankSystem.Loan customer_loan) {
        this.customer_loan = new LinkedList<>();
        this.customer_loan.add(customer_loan);

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
    public LinkedList<onlineBankSystem.Withdraw> getCustomer_withdraw() {
        return customer_withdraw;
    }

    /**
     *
     * @param customer_withdraw
     */
    public void setCustomer_withdraw(LinkedList<onlineBankSystem.Withdraw> customer_withdraw) {
        this.customer_withdraw = customer_withdraw;
    }

    /**
     *
     * @param customer_withdraw
     */
    public void setCustomer_withdraw(onlineBankSystem.Withdraw customer_withdraw) {
        this.customer_withdraw = new LinkedList<>();
        this.customer_withdraw.add(customer_withdraw);
    }

}
