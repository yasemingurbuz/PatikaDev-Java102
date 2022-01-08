package OnlineBankaSistemi.src.main.java;

/**
 *
 *
 */
public class Role {

    private int role_id;
    private String role_title;
    private String role_description;

    /**
     *
     * @param role_id
     * @param role_title
     * @param role_description
     */
    public Role(int role_id, String role_title, String role_description) {
        this.role_id = role_id;
        this.role_title = role_title;
        this.role_description = role_description;
    }

    /**
     *
     * @return role_id
     */
    public int getRole_id() {
        return role_id;
    }

    /**
     *
     * @param role_id
     */
    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    /**
     *
     * @return role_title
     */
    public String getRole_title() {
        return role_title;
    }

    /**
     *
     * @param role_title
     */
    public void setRole_title(String role_title) {
        this.role_title = role_title;
    }

    /**
     *
     * @return role_description
     */
    public String getRole_description() {
        return role_description;
    }

    /**
     *
     * @param role_description
     */
    public void setRole_description(String role_description) {
        this.role_description = role_description;
    }

}
