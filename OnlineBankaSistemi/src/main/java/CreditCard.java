package OnlineBankaSistemi.src.main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 *
 */
public class CreditCard extends Card {

    private int payment_term;
    private LocalDate start_date;
    private LocalDate due_date;
    private String insurance;
    private int remaining_payment;
    private String heir;
    private int limit;

    /**
     *
     * @param payment_term
     * @param start_date
     * @param due_date
     * @param insurance
     * @param remaining_payment
     * @param heir
     * @param limit
     * @param card_id
     * @param card_pin
     * @param card_description
     * @param card_amount
     * @param card_name
     * @param card_type
     * @param card_bank
     */
    public CreditCard(int payment_term, String start_date, String due_date, String insurance, int remaining_payment, String heir, int limit, int card_id, int card_pin, String card_description, int card_amount, String card_name, String card_type, Bank card_bank) {
        super(card_id, card_pin, card_description, card_amount, card_name, card_type, card_bank);
        this.payment_term = payment_term;
        setStart_date(start_date);
        setDue_date(due_date);
        this.insurance = insurance;
        this.remaining_payment = remaining_payment;
        this.heir = heir;
        this.limit = limit;
    }

    /**
     *
     * @param payment_term
     * @param start_date
     * @param due_date
     * @param insurance
     * @param remaining_payment
     * @param heir
     * @param limit
     * @param card_id
     * @param card_pin
     * @param card_description
     * @param card_amount
     * @param card_name
     * @param card_type
     * @param card_bank
     */
    public CreditCard(int payment_term, LocalDate start_date, LocalDate due_date, String insurance, int remaining_payment, String heir, int limit, int card_id, int card_pin, String card_description, int card_amount, String card_name, String card_type, Bank card_bank) {
        super(card_id, card_pin, card_description, card_amount, card_name, card_type, card_bank);
        this.payment_term = payment_term;
        this.start_date = start_date;
        this.due_date = due_date;
        this.insurance = insurance;
        this.remaining_payment = remaining_payment;
        this.heir = heir;
        this.limit = limit;
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
     * @return due_date
     */
    public LocalDate getDue_date() {
        return due_date;
    }

    /**
     *
     * @param due_date
     */
    public void setDue_date(LocalDate due_date) {
        this.due_date = due_date;
    }

    /**
     *
     * @param due_date
     */
    public void setDue_date(String due_date) {
        this.due_date = LocalDate.parse(due_date, DateTimeFormatter.ofPattern("dd MMM uuuu"));
    }

    /**
     *
     * @return insurance
     */
    public String getInsurance() {
        return insurance;
    }

    /**
     *
     * @param insurance
     */
    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    /**
     *
     * @return remaining_payment
     */
    public int getRemaining_payment() {
        return remaining_payment;
    }

    /**
     *
     * @param remaining_payment
     */
    public void setRemaining_payment(int remaining_payment) {
        this.remaining_payment = remaining_payment;
    }

    /**
     *
     * @return heir
     */
    public String getHeir() {
        return heir;
    }

    /**
     *
     * @param heir
     */
    public void setHeir(String heir) {
        this.heir = heir;
    }

    /**
     *
     * @return limit
     */
    public int getLimit() {
        return limit;
    }

    /**
     *
     * @param limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

}
