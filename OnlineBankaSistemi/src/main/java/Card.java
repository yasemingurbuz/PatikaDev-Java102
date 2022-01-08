package OnlineBankaSistemi.src.main.java;

/**
 *
 *
 */
public class Card {

    private int card_id;
    private int card_pin;
    private String card_description;
    private int card_amount;
    private String card_name;
    private String card_type;
    private Bank card_bank;

    /**
     *
     * @param card_id
     * @param card_pin
     * @param card_description
     * @param card_amount
     * @param card_name
     * @param card_type
     * @param card_bank
     */
    public Card(int card_id, int card_pin, String card_description, int card_amount, String card_name, String card_type, Bank card_bank) {
        this.card_id = card_id;
        this.card_pin = card_pin;
        this.card_description = card_description;
        this.card_amount = card_amount;
        this.card_name = card_name;
        this.card_type = card_type;
        this.card_bank = card_bank;
    }

    /**
     *
     * @return card_id
     */
    public int getCard_id() {
        return card_id;
    }

    /**
     *
     * @param card_id
     */
    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    /**
     *
     * @return card_pin
     */
    public int getCard_pin() {
        return card_pin;
    }

    /**
     *
     * @param card_pin
     */
    public void setCard_pin(int card_pin) {
        this.card_pin = card_pin;
    }

    /**
     *
     * @return card_description
     */
    public String getCard_description() {
        return card_description;
    }

    /**
     *
     * @param card_description
     */
    public void setCard_description(String card_description) {
        this.card_description = card_description;
    }

    /**
     *
     * @return card_amount
     */
    public int getCard_amount() {
        return card_amount;
    }

    /**
     *
     * @param card_amount
     */
    public void setCard_amount(int card_amount) {
        this.card_amount = card_amount;
    }

    /**
     *
     * @return card_name
     */
    public String getCard_name() {
        return card_name;
    }

    /**
     *
     * @param card_name
     */
    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    /**
     *
     * @return card_type
     */
    public String getCard_type() {
        return card_type;
    }

    /**
     *
     * @param card_type
     */
    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    /**
     *
     * @return card_bank
     */
    public Bank getCard_bank() {
        return card_bank;
    }

    /**
     *
     * @param card_bank
     */
    public void setCard_bank(Bank card_bank) {
        this.card_bank = card_bank;
    }

}
