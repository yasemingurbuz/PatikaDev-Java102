package OnlineBankaSistemi.src.main.java;

import java.time.LocalDate;

/**
 *
 *
 */
public class FundTransfer extends Transaction {

    private int transaction_fund;

    /**
     *
     * @param transaction_fund
     * @param transaction_id
     * @param transaction_type
     * @param transaction_name
     * @param transaction_descriptions
     * @param transaction_amount
     * @param transaction_date
     * @param transaction_bank
     */
    public FundTransfer(int transaction_fund, int transaction_id, String transaction_type, String transaction_name, String transaction_descriptions, int transaction_amount, String transaction_date, Bank transaction_bank) {
        super(transaction_id, transaction_type, transaction_name, transaction_descriptions, transaction_amount, transaction_date, transaction_bank);
        this.transaction_fund = transaction_fund;
    }

    /**
     *
     * @param transaction_fund
     * @param transaction_id
     * @param transaction_type
     * @param transaction_name
     * @param transaction_descriptions
     * @param transaction_amount
     * @param transaction_date
     * @param transaction_bank
     */
    public FundTransfer(int transaction_fund, int transaction_id, String transaction_type, String transaction_name, String transaction_descriptions, int transaction_amount, LocalDate transaction_date, Bank transaction_bank) {
        super(transaction_id, transaction_type, transaction_name, transaction_descriptions, transaction_amount, transaction_date, transaction_bank);
        this.transaction_fund = transaction_fund;
    }

    /**
     *
     * @return transaction_fund
     */
    public int getTransaction_fund() {
        return transaction_fund;
    }

    /**
     *
     * @param transaction_fund
     */
    public void setTransaction_fund(int transaction_fund) {
        this.transaction_fund = transaction_fund;
    }

}
