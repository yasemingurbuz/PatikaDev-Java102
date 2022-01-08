package OnlineBankaSistemi.src.main.java;

/**
 *
 *
 */
public class Bank {

    enum BankType {
        PUBLIC,
        PRIVATE
    }

    private int bank_id;
    private String bank_name;
    private String bank_branch;
    private int bank_code;
    private String bank_place;
    private BankType bank_type;
    private String bank_description;

    /**
     *
     * @param bank_id
     * @param bank_name
     * @param bank_branch
     * @param bank_code
     * @param bank_place
     * @param bank_type
     * @param bank_description
     */
    public Bank(int bank_id, String bank_name, String bank_branch, int bank_code, String bank_place, String bank_type, String bank_description) {
        this.bank_id = bank_id;
        this.bank_name = bank_name;
        this.bank_branch = bank_branch;
        this.bank_code = bank_code;
        this.bank_place = bank_place;
        setBank_type(bank_type);
        this.bank_description = bank_description;
    }

    /**
     *
     * @param bank_id
     * @param bank_name
     * @param bank_branch
     * @param bank_code
     * @param bank_place
     * @param bank_type
     * @param bank_description
     */
    public Bank(int bank_id, String bank_name, String bank_branch, int bank_code, String bank_place, BankType bank_type, String bank_description) {
        this.bank_id = bank_id;
        this.bank_name = bank_name;
        this.bank_branch = bank_branch;
        this.bank_code = bank_code;
        this.bank_place = bank_place;
        this.bank_type = bank_type;
        this.bank_description = bank_description;
    }

    /**
     *
     * @return bank_id
     */
    public int getBank_id() {
        return bank_id;
    }

    /**
     *
     * @param bank_id
     */
    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    /**
     *
     * @return bank_name
     */
    public String getBank_name() {
        return bank_name;
    }

    /**
     *
     * @param bank_name
     */
    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    /**
     *
     * @return bank_branch
     */
    public String getBank_branch() {
        return bank_branch;
    }

    /**
     *
     * @param bank_branch
     */
    public void setBank_branch(String bank_branch) {
        this.bank_branch = bank_branch;
    }

    /**
     *
     * @return bank_code
     */
    public int getBank_code() {
        return bank_code;
    }

    /**
     *
     * @param bank_code
     */
    public void setBank_code(int bank_code) {
        this.bank_code = bank_code;
    }

    /**
     *
     * @return bank_place
     */
    public String getBank_place() {
        return bank_place;
    }

    /**
     *
     * @param bank_place
     */
    public void setBank_place(String bank_place) {
        this.bank_place = bank_place;
    }

    /**
     *
     * @return bank_type
     */
    public BankType getBank_type() {
        return bank_type;
    }

    /**
     *
     * @param bank_type
     */
    public void setBank_type(String bank_type) {
        if (null != bank_type) {
            switch (bank_type) {
                case "public":
                    this.bank_type = BankType.PUBLIC;
                    break;
                case "private":
                    this.bank_type = BankType.PRIVATE;
                    break;
                default:
                    System.out.println("False Input of Bank Type");
                    break;
            }
        } else {
            System.out.println("Empty Input");
        }
    }

    /**
     *
     * @param bank_type
     */
    public void setBank_type(BankType bank_type) {
        this.bank_type = bank_type;
    }

    /**
     *
     * @return bank_description
     */
    public String getBank_description() {
        return bank_description;
    }

    /**
     *
     * @param bank_description
     */
    public void setBank_description(String bank_description) {
        this.bank_description = bank_description;
    }

}
