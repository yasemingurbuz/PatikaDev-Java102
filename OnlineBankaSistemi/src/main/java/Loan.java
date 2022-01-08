package OnlineBankaSistemi.src.main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 *
 */
public class Loan {

    private int loan_id;
    private int loan_amount;
    private String loan_purpose;
    private String loan_description;
    private LocalDate loan_date;
    private int payment_term;
    private boolean existing_loan_customer;
    private String mothers_name;
    private Account loan_account;
    private Bank bank_loan;

    /**
     *
     * @param loan_id
     * @param loan_amount
     * @param loan_purpose
     * @param loan_description
     * @param loan_date
     * @param payment_term
     * @param existing_loan_customer
     * @param mothers_name
     * @param loan_account
     * @param bank_loan
     */
    public Loan(int loan_id, int loan_amount, String loan_purpose, String loan_description, String loan_date, int payment_term, boolean existing_loan_customer, String mothers_name, Account loan_account, Bank bank_loan) {
        this.loan_id = loan_id;
        this.loan_amount = loan_amount;
        this.loan_purpose = loan_purpose;
        this.loan_description = loan_description;
        setLoan_date(loan_date);
        this.payment_term = payment_term;
        this.existing_loan_customer = existing_loan_customer;
        this.mothers_name = mothers_name;
        this.loan_account = loan_account;
        this.bank_loan = bank_loan;
    }

    /**
     *
     * @param loan_id
     * @param loan_amount
     * @param loan_purpose
     * @param loan_description
     * @param loan_date
     * @param payment_term
     * @param existing_loan_customer
     * @param mothers_name
     * @param loan_account
     * @param bank_loan
     */
    public Loan(int loan_id, int loan_amount, String loan_purpose, String loan_description, LocalDate loan_date, int payment_term, boolean existing_loan_customer, String mothers_name, Account loan_account, Bank bank_loan) {
        this.loan_id = loan_id;
        this.loan_amount = loan_amount;
        this.loan_purpose = loan_purpose;
        this.loan_description = loan_description;
        this.loan_date = loan_date;
        this.payment_term = payment_term;
        this.existing_loan_customer = existing_loan_customer;
        this.mothers_name = mothers_name;
        this.loan_account = loan_account;
        this.bank_loan = bank_loan;
    }

    /**
     *
     * @return loan_id
     */
    public int getLoan_id() {
        return loan_id;
    }

    /**
     *
     * @param loan_id
     */
    public void setLoan_id(int loan_id) {
        this.loan_id = loan_id;
    }

    /**
     *
     * @return loan_amount
     */
    public int getLoan_amount() {
        return loan_amount;
    }

    /**
     *
     * @param loan_amount
     */
    public void setLoan_amount(int loan_amount) {
        this.loan_amount = loan_amount;
    }

    /**
     *
     * @return loan_purpose
     */
    public String getLoan_purpose() {
        return loan_purpose;
    }

    /**
     *
     * @param loan_purpose
     */
    public void setLoan_purpose(String loan_purpose) {
        this.loan_purpose = loan_purpose;
    }

    /**
     *
     * @return loan_description
     */
    public String getLoan_description() {
        return loan_description;
    }

    /**
     *
     * @param loan_description
     */
    public void setLoan_description(String loan_description) {
        this.loan_description = loan_description;
    }

    /**
     *
     * @return loan_date
     */
    public LocalDate getLoan_date() {
        return loan_date;
    }

    /**
     *
     * @param loan_date
     */
    public void setLoan_date(LocalDate loan_date) {
        this.loan_date = loan_date;
    }

    /**
     *
     * @param loan_date
     */
    public void setLoan_date(String loan_date) {
        this.loan_date = LocalDate.parse(loan_date, DateTimeFormatter.ofPattern("dd MMM uuuu"));
    }

    /**
     *
     * @return payment_term
     */
    public int getPayment_term() {
        return payment_term;
    }

    /**
     *
     * @param payment_term
     */
    public void setPayment_term(int payment_term) {
        this.payment_term = payment_term;
    }

    /**
     *
     * @return existing_loan_customer
     */
    public boolean isExisting_loan_customer() {
        return existing_loan_customer;
    }

    /**
     *
     * @param existing_loan_customer
     */
    public void setExisting_loan_customer(boolean existing_loan_customer) {
        this.existing_loan_customer = existing_loan_customer;
    }

    /**
     *
     * @return mothers_name
     */
    public String getMothers_name() {
        return mothers_name;
    }

    /**
     *
     * @param mothers_name
     */
    public void setMothers_name(String mothers_name) {
        this.mothers_name = mothers_name;
    }

    /**
     *
     * @return loan_account
     */
    public Account getLoan_account() {
        return loan_account;
    }

    /**
     *
     * @param loan_account
     */
    public void setLoan_account(Account loan_account) {
        this.loan_account = loan_account;
    }

    /**
     *
     * @return bank_loan
     */
    public Bank getBank_loan() {
        return bank_loan;
    }

    /**
     *
     * @param bank_loan
     */
    public void setBank_loan(Bank bank_loan) {
        this.bank_loan = bank_loan;
    }

}
