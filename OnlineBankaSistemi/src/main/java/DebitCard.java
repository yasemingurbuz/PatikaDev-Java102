package OnlineBankaSistemi.src.main.java;

/**
 *
 *
 */
public class DebitCard extends Card {

    private String debit_card_type;

    /**
     *
     * @param debit_card_type
     * @param card_id
     * @param card_pin
     * @param card_description
     * @param card_amount
     * @param card_name
     * @param card_type
     * @param card_bank
     */
    public DebitCard(String debit_card_type, int card_id, int card_pin, String card_description, int card_amount, String card_name, String card_type, Bank card_bank) {
        super(card_id, card_pin, card_description, card_amount, card_name, card_type, card_bank);
        this.debit_card_type = debit_card_type;
    }

    /**
     *
     * @return debit_card_type
     */
    public String getDebit_card_type() {
        return debit_card_type;
    }

    /**
     *
     * @param debit_card_type
     */
    public void setDebit_card_type(String debit_card_type) {
        this.debit_card_type = debit_card_type;
    }

}
