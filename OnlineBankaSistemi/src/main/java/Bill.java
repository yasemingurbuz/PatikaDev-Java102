package OnlineBankaSistemi.src.main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 *
 */
public class Bill extends Transaction {

    private LocalDate start_date;
    private LocalDate expiration_date;
    private String status;

    /**
     *
     * @param start_date
     * @param expiration_date
     * @param status
     * @param transaction_id
     * @param transaction_type
     * @param transaction_name
     * @param transaction_descriptions
     * @param transaction_amount
     * @param transaction_date
     * @param transaction_bank
     */
    public Bill(LocalDate start_date, LocalDate expiration_date, String status, int transaction_id, String transaction_type, String transaction_name, String transaction_descriptions, int transaction_amount, String transaction_date, Bank transaction_bank) {
        super(transaction_id, transaction_type, transaction_name, transaction_descriptions, transaction_amount, transaction_date, transaction_bank);
        this.start_date = start_date;
        this.expiration_date = expiration_date;
        this.status = status;
    }

    /**
     *
     * @param start_date
     * @param expiration_date
     * @param status
     * @param transaction_id
     * @param transaction_type
     * @param transaction_name
     * @param transaction_descriptions
     * @param transaction_amount
     * @param transaction_date
     * @param transaction_bank
     */
    public Bill(String start_date, String expiration_date, String status, int transaction_id, String transaction_type, String transaction_name, String transaction_descriptions, int transaction_amount, String transaction_date, Bank transaction_bank) {
        super(transaction_id, transaction_type, transaction_name, transaction_descriptions, transaction_amount, transaction_date, transaction_bank);
        setStart_date(start_date);
        setExpiration_date(expiration_date);
        this.status = status;
    }

    /**
     *
     * @param start_date
     * @param expiration_date
     * @param status
     * @param transaction_id
     * @param transaction_type
     * @param transaction_name
     * @param transaction_descriptions
     * @param transaction_amount
     * @param transaction_date
     * @param transaction_bank
     */
    public Bill(LocalDate start_date, LocalDate expiration_date, String status, int transaction_id, String transaction_type, String transaction_name, String transaction_descriptions, int transaction_amount, LocalDate transaction_date, Bank transaction_bank) {
        super(transaction_id, transaction_type, transaction_name, transaction_descriptions, transaction_amount, transaction_date, transaction_bank);
        this.start_date = start_date;
        this.expiration_date = expiration_date;
        this.status = status;
    }

    /**
     *
     * @param start_date
     * @param expiration_date
     * @param status
     * @param transaction_id
     * @param transaction_type
     * @param transaction_name
     * @param transaction_descriptions
     * @param transaction_amount
     * @param transaction_date
     * @param transaction_bank
     */
    public Bill(String start_date, String expiration_date, String status, int transaction_id, String transaction_type, String transaction_name, String transaction_descriptions, int transaction_amount, LocalDate transaction_date, Bank transaction_bank) {
        super(transaction_id, transaction_type, transaction_name, transaction_descriptions, transaction_amount, transaction_date, transaction_bank);
        setStart_date(start_date);
        setExpiration_date(expiration_date);
        this.status = status;
    }

    /**
     *
     * @return start_date
     */
    public LocalDate getStart_date() {
        return start_date;
    }

    /**
     *
     * @param start_date
     */
    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    /**
     *
     * @param start_date
     */
    public void setStart_date(String start_date) {
        this.start_date = LocalDate.parse(start_date, DateTimeFormatter.ofPattern("dd MMM uuuu"));
    }

    /**
     *
     * @return expiration_date
     */
    public LocalDate getExpiration_date() {
        return expiration_date;
    }

    /**
     *
     * @param expiration_date
     */
    public void setExpiration_date(LocalDate expiration_date) {
        this.expiration_date = expiration_date;
    }

    /**
     *
     * @param expiration_date
     */
    public void setExpiration_date(String expiration_date) {
        this.expiration_date = LocalDate.parse(expiration_date, DateTimeFormatter.ofPattern("dd MMM uuuu"));
    }

    /**
     *
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
