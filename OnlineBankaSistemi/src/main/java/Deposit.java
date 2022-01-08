package OnlineBankaSistemi.src.main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 *
 */
public class Deposit {

    private int deposit_id;
    private String deposit_description;
    private int deposit_amount;
    private LocalDate deposit_date;
    private Bank deposit_bank;
    private Account deposit_account;
    private int minimum_deposit;

    /**
     *
     * @param deposit_id
     * @param deposit_description
     * @param deposit_amount
     * @param deposit_date
     * @param deposit_bank
     * @param deposit_account
     * @param minimum_deposit
     */
    public Deposit(int deposit_id, String deposit_description, int deposit_amount, String deposit_date, Bank deposit_bank, Account deposit_account, int minimum_deposit) {
        this.deposit_id = deposit_id;
        this.deposit_description = deposit_description;
        this.deposit_amount = deposit_amount;
        setDeposit_date(deposit_date);
        this.deposit_bank = deposit_bank;
        this.deposit_account = deposit_account;
        this.minimum_deposit = minimum_deposit;
    }

    /**
     *
     * @param deposit_id
     * @param deposit_description
     * @param deposit_amount
     * @param deposit_date
     * @param deposit_bank
     * @param deposit_account
     * @param minimum_deposit
     */
    public Deposit(int deposit_id, String deposit_description, int deposit_amount, LocalDate deposit_date, Bank deposit_bank, Account deposit_account, int minimum_deposit) {
        this.deposit_id = deposit_id;
        this.deposit_description = deposit_description;
        this.deposit_amount = deposit_amount;
        this.deposit_date = deposit_date;
        this.deposit_bank = deposit_bank;
        this.deposit_account = deposit_account;
        this.minimum_deposit = minimum_deposit;
    }

    /**
     *
     * @return deposit_id
     */
    public int getDeposit_id() {
        return deposit_id;
    }

    /**
     *
     * @param deposit_id
     */
    public void setDeposit_id(int deposit_id) {
        this.deposit_id = deposit_id;
    }

    /**
     *
     * @return deposit_description
     */
    public String getDeposit_description() {
        return deposit_description;
    }

    /**
     *
     * @param deposit_description
     */
    public void setDeposit_description(String deposit_description) {
        this.deposit_description = deposit_description;
    }

    /**
     *
     * @return deposit_amount
     */
    public int getDeposit_amount() {
        return deposit_amount;
    }

    /**
     *
     * @param deposit_amount
     */
    public void setDeposit_amount(int deposit_amount) {
        this.deposit_amount = deposit_amount;
    }

    /**
     *
     * @return deposit_date
     */
    public LocalDate getDeposit_date() {
        return deposit_date;
    }

    /**
     *
     * @param deposit_date
     */
    public void setDeposit_date(LocalDate deposit_date) {
        this.deposit_date = deposit_date;
    }

    /**
     *
     * @param deposit_date
     */
    public void setDeposit_date(String deposit_date) {
        this.deposit_date = LocalDate.parse(deposit_date, DateTimeFormatter.ofPattern("dd MMM uuuu"));
    }

    /**
     *
     * @return deposit_bank
     */
    public Bank getDeposit_bank() {
        return deposit_bank;
    }

    /**
     *
     * @param deposit_bank
     */
    public void setDeposit_bank(Bank deposit_bank) {
        this.deposit_bank = deposit_bank;
    }

    /**
     *
     * @return deposit_account
     */
    public Account getDeposit_account() {
        return deposit_account;
    }

    /**
     *
     * @param deposit_account
     */
    public void setDeposit_account(Account deposit_account) {
        this.deposit_account = deposit_account;
    }

    /**
     *
     * @return minimum_deposit
     */
    public int getMinimum_deposit() {
        return minimum_deposit;
    }

    /**
     *
     * @param minimum_deposit
     */
    public void setMinimum_deposit(int minimum_deposit) {
        this.minimum_deposit = minimum_deposit;
    }

}
