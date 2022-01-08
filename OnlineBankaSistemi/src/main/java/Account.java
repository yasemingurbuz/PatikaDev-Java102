package OnlineBankaSistemi.src.main.java;

/**
 *
 *
 */
public class Account {

    private int account_id;
    private int account_number;
    private String account_type;
    private int account_balance;
    private String account_description;
    private Bank account_bank;

    /**
     *
     * @param account_id
     * @param account_number
     * @param account_type
     * @param account_balance
     * @param account_description
     * @param account_bank
     */
    public Account(int account_id, int account_number, String account_type, int account_balance, String account_description, Bank account_bank) {
        this.account_id = account_id;
        this.account_number = account_number;
        this.account_type = account_type;
        this.account_balance = account_balance;
        this.account_description = account_description;
        this.account_bank = account_bank;
    }

    /**
     *
     * @return account_id
     */
    public int getAccount_id() {
        return account_id;
    }

    /**
     *
     * @param account_id
     */
    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    /**
     *
     * @return account_number
     */
    public int getAccount_number() {
        return account_number;
    }

    /**
     *
     * @param account_number
     */
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    /**
     *
     * @return account_type
     */
    public String getAccount_type() {
        return account_type;
    }

    /**
     *
     * @param account_type
     */
    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    /**
     *
     * @return account_balance
     */
    public int getAccount_balance() {
        return account_balance;
    }

    /**
     *
     * @param account_balance
     */
    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }

    /**
     *
     * @return account_description
     */
    public String getAccount_description() {
        return account_description;
    }

    /**
     *
     * @param account_description
     */
    public void setAccount_description(String account_description) {
        this.account_description = account_description;
    }

    /**
     *
     * @return account_bank
     */
    public Bank getAccount_bank() {
        return account_bank;
    }

    /**
     *
     * @param account_bank
     */
    public void setAccount_bank(Bank account_bank) {
        this.account_bank = account_bank;
    }

}
