package OnlineBankaSistemi.src.main.java;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 *

 *
 */
public class Admin extends Users {

    private LinkedList<onlineBankSystem.Customer> grant_customer;
    private LinkedList<onlineBankSystem.Teller> grant_teller;
    private LinkedList<onlineBankSystem.Role> grant_role;
    private LinkedList<onlineBankSystem.Permission> grant_permission;

    /**
     *
     * @param user_id
     * @param user_name
     * @param user_email
     * @param user_address
     * @param user_phone
     * @param username
     * @param password
     */
    public Admin(int user_id, String user_name, String user_email, String user_address, String user_phone, String username, String password) {
        super(user_id, user_name, user_email,user_address, user_phone, username, password);
    }

    /**
     *
     * @param user_id
     * @param user_name
     * @param user_email
     * @param user_age
     * @param user_gender
     * @param user_date_of_birth
     * @param user_address
     * @param user_phone
     * @param username
     * @param password
     */
    public Admin(int user_id, String user_name, String user_email, int user_age, Gender user_gender, LocalDate user_date_of_birth, String user_address, String user_phone, String username, String password) {
        super(user_id, user_name, user_email, user_age, user_gender, user_date_of_birth, user_address, user_phone, username, password);
    }

    /**
     *
     * @return grant_customer
     */
    public LinkedList<onlineBankSystem.Customer> getGrant_customer() {
        return grant_customer;
    }

    /**
     *
     * @param grant_customer
     */
    public void setGrant_customer(LinkedList<onlineBankSystem.Customer> grant_customer) {
        this.grant_customer = grant_customer;
    }

    /**
     *
     * @param grant_customer
     */
    public void setGrant_customer(onlineBankSystem.Customer grant_customer) {
        this.grant_customer = new LinkedList<>();
        this.grant_customer.add(grant_customer);
    }

    /**
     *
     * @return grant_teller
     */
    public LinkedList<onlineBankSystem.Teller> getGrant_teller() {
        return grant_teller;
    }

    /**
     *
     * @param grant_teller
     */
    public void setGrant_teller(LinkedList<onlineBankSystem.Teller> grant_teller) {
        this.grant_teller = grant_teller;
    }

    /**
     *
     * @param grant_teller
     */
    public void setGrant_teller(onlineBankSystem.Teller grant_teller) {
        this.grant_teller = new LinkedList<>();
        this.grant_teller.add(grant_teller);
    }

    /**
     *
     * @return grant_role
     */
    public LinkedList<onlineBankSystem.Role> getGrant_role() {
        return grant_role;
    }

    /**
     *
     * @param grant_role
     */
    public void setGrant_role(LinkedList<onlineBankSystem.Role> grant_role) {
        this.grant_role = grant_role;
    }

    /**
     *
     * @param grant_role
     */
    public void setGrant_role(onlineBankSystem.Role grant_role) {
        this.grant_role = new LinkedList<>();
        this.grant_role.add(grant_role);
    }

    /**
     *
     * @return grant_permission
     */
    public LinkedList<onlineBankSystem.Permission> getGrant_permission() {
        return grant_permission;
    }

    /**
     *
     * @param grant_permission
     */
    public void setGrant_permission(LinkedList<onlineBankSystem.Permission> grant_permission) {
        this.grant_permission = grant_permission;
    }

    /**
     *
     * @param grant_permission
     */
    public void setGrant_permission(onlineBankSystem.Permission grant_permission) {
        this.grant_permission = new LinkedList<>();
        this.grant_permission.add(grant_permission);
    }

}
