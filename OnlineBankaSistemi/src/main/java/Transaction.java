package OnlineBankaSistemi.src.main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 *
 */
public class Transaction {

    private int transaction_id;
    private String transaction_type;
    private String transaction_name;
    private String transaction_descriptions;
    private int transaction_amount;
    private LocalDate transaction_date;
    private Bank transaction_bank;

    /**
     *
     * @param transaction_id
     * @param transaction_type
     * @param transaction_name
     * @param transaction_descriptions
     * @param transaction_amount
     * @param transaction_date
     * @param transaction_bank
     */
    public Transaction(int transaction_id, String transaction_type, String transaction_name, String transaction_descriptions, int transaction_amount, String transaction_date, Bank transaction_bank) {
        this.transaction_id = transaction_id;
        this.transaction_type = transaction_type;
        this.transaction_name = transaction_name;
        this.transaction_descriptions = transaction_descriptions;
        this.transaction_amount = transaction_amount;
        setTransaction_date(transaction_date);
        this.transaction_bank = transaction_bank;
    }

    /**
     *
     * @param transaction_id
     * @param transaction_type
     * @param transaction_name
     * @param transaction_descriptions
     * @param transaction_amount
     * @param transaction_date
     * @param transaction_bank
     */
    public Transaction(int transaction_id, String transaction_type, String transaction_name, String transaction_descriptions, int transaction_amount, LocalDate transaction_date, Bank transaction_bank) {
        this.transaction_id = transaction_id;
        this.transaction_type = transaction_type;
        this.transaction_name = transaction_name;
        this.transaction_descriptions = transaction_descriptions;
        this.transaction_amount = transaction_amount;
        this.transaction_date = transaction_date;
        this.transaction_bank = transaction_bank;
    }

    /**
     *
     * @return transaction_id
     */
    public int getTransaction_id() {
        return transaction_id;
    }

    /**
     *
     * @param transaction_id
     */
    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    /**
     *
     * @return transaction_type
     */
    public String getTransaction_type() {
        return transaction_type;
    }

    /**
     *
     * @param transaction_type
     */
    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    /**
     *
     * @return transaction_name
     */
    public String getTransaction_name() {
        return transaction_name;
    }

    /**
     *
     * @param transaction_name
     */
    public void setTransaction_name(String transaction_name) {
        this.transaction_name = transaction_name;
    }

    /**
     *
     * @return transaction_descriptions
     */
    public String getTransaction_descriptions() {
        return transaction_descriptions;
    }

    /**
     *
     * @param transaction_descriptions
     */
    public void setTransaction_descriptions(String transaction_descriptions) {
        this.transaction_descriptions = transaction_descriptions;
    }

    /**
     *
     * @return transaction_amount
     */
    public int getTransaction_amount() {
        return transaction_amount;
    }

    /**
     *
     * @param transaction_amount
     */
    public void setTransaction_amount(int transaction_amount) {
        this.transaction_amount = transaction_amount;
    }

    /**
     *
     * @return transaction_date
     */
    public LocalDate getTransaction_date() {
        return transaction_date;
    }

    /**
     *
     * @param transaction_date
     */
    public void setTransaction_date(LocalDate transaction_date) {
        this.transaction_date = transaction_date;
    }

    /**
     *
     * @param transaction_date
     */
    public void setTransaction_date(String transaction_date) {
        this.transaction_date = LocalDate.parse(transaction_date, DateTimeFormatter.ofPattern("dd MMM uuuu"));
    }

    /**
     *
     * @return transaction_bank
     */
    public Bank getTransaction_bank() {
        return transaction_bank;
    }

    /**
     *
     * @param transaction_bank
     */
    public void setTransaction_bank(Bank transaction_bank) {
        this.transaction_bank = transaction_bank;
    }

}
