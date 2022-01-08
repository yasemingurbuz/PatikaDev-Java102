package OnlineBankaSistemi.src.main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 *
 */
public class Withdraw {

    private int withdraw_id;
    private String withdraw_description;
    private int withdraw_amount;
    private LocalDate withdraw_date;
    private int maximum_withdraw;
    private int minimum_withdraw;
    private Bank withdraw_bank;
    private Account withdraw_account;

    /**
     *
     * @param withdraw_id
     * @param withdraw_description
     * @param withdraw_amount
     * @param withdraw_date
     * @param maximum_withdraw
     * @param minimum_withdraw
     * @param withdraw_bank
     * @param withdraw_account
     */
    public Withdraw(int withdraw_id, String withdraw_description, int withdraw_amount, String withdraw_date, int maximum_withdraw, int minimum_withdraw, Bank withdraw_bank, Account withdraw_account) {
        this.withdraw_id = withdraw_id;
        this.withdraw_description = withdraw_description;
        this.withdraw_amount = withdraw_amount;
        setWithdraw_date(withdraw_date);
        this.maximum_withdraw = maximum_withdraw;
        this.minimum_withdraw = minimum_withdraw;
        this.withdraw_bank = withdraw_bank;
        this.withdraw_account = withdraw_account;
    }

    /**
     *
     * @param withdraw_id
     * @param withdraw_description
     * @param withdraw_amount
     * @param withdraw_date
     * @param maximum_withdraw
     * @param minimum_withdraw
     * @param withdraw_bank
     * @param withdraw_account
     */
    public Withdraw(int withdraw_id, String withdraw_description, int withdraw_amount, LocalDate withdraw_date, int maximum_withdraw, int minimum_withdraw, Bank withdraw_bank, Account withdraw_account) {
        this.withdraw_id = withdraw_id;
        this.withdraw_description = withdraw_description;
        this.withdraw_amount = withdraw_amount;
        this.withdraw_date = withdraw_date;
        this.maximum_withdraw = maximum_withdraw;
        this.minimum_withdraw = minimum_withdraw;
        this.withdraw_bank = withdraw_bank;
        this.withdraw_account = withdraw_account;
    }

    /**
     *
     * @return withdraw_id
     */
    public int getWithdraw_id() {
        return withdraw_id;
    }

    /**
     *
     * @param withdraw_id
     */
    public void setWithdraw_id(int withdraw_id) {
        this.withdraw_id = withdraw_id;
    }

    /**
     *
     * @return withdraw_description
     */
    public String getWithdraw_description() {
        return withdraw_description;
    }

    /**
     *
     * @param withdraw_description
     */
    public void setWithdraw_description(String withdraw_description) {
        this.withdraw_description = withdraw_description;
    }

    /**
     *
     * @return withdraw_amount
     */
    public int getWithdraw_amount() {
        return withdraw_amount;
    }

    /**
     *
     * @param withdraw_amount
     */
    public void setWithdraw_amount(int withdraw_amount) {
        this.withdraw_amount = withdraw_amount;
    }

    /**
     *
     * @return withdraw_date
     */
    public LocalDate getWithdraw_date() {
        return withdraw_date;
    }

    /**
     *
     * @param withdraw_date
     */
    public void setWithdraw_date(LocalDate withdraw_date) {
        this.withdraw_date = withdraw_date;
    }

    /**
     *
     * @param withdraw_date
     */
    public void setWithdraw_date(String withdraw_date) {
        this.withdraw_date = LocalDate.parse(withdraw_date, DateTimeFormatter.ofPattern("dd MMM uuuu"));
    }

    /**
     *
     * @return maximum_withdraw
     */
    public int getMaximum_withdraw() {
        return maximum_withdraw;
    }

    /**
     *
     * @param maximum_withdraw
     */
    public void setMaximum_withdraw(int maximum_withdraw) {
        this.maximum_withdraw = maximum_withdraw;
    }

    /**
     *
     * @return minimum_withdraw
     */
    public int getMinimum_withdraw() {
        return minimum_withdraw;
    }

    /**
     *
     * @param minimum_withdraw
     */
    public void setMinimum_withdraw(int minimum_withdraw) {
        this.minimum_withdraw = minimum_withdraw;
    }

    /**
     *
     * @return withdraw_bank
     */
    public Bank getWithdraw_bank() {
        return withdraw_bank;
    }

    /**
     *
     * @param withdraw_bank
     */
    public void setWithdraw_bank(Bank withdraw_bank) {
        this.withdraw_bank = withdraw_bank;
    }

    /**
     *
     * @return withdraw_account
     */
    public Account getWithdraw_account() {
        return withdraw_account;
    }

    /**
     *
     * @param withdraw_account
     */
    public void setWithdraw_account(Account withdraw_account) {
        this.withdraw_account = withdraw_account;
    }

}
