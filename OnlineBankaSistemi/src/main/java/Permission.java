package OnlineBankaSistemi.src.main.java;

/**
 *
 *
 */
public class Permission {

    private int permission_id;
    private String permission_class;
    private String permission_name;
    private String permission_description;

    /**
     *
     * @param permission_id
     * @param permission_class
     * @param permission_name
     * @param permission_description
     */
    public Permission(int permission_id, String permission_class, String permission_name, String permission_description) {
        this.permission_id = permission_id;
        this.permission_class = permission_class;
        this.permission_name = permission_name;
        this.permission_description = permission_description;
    }

    /**
     *
     * @return permission_id
     */
    public int getPermission_id() {
        return permission_id;
    }

    /**
     *
     * @param permission_id
     */
    public void setPermission_id(int permission_id) {
        this.permission_id = permission_id;
    }

    /**
     *
     * @return permission_class
     */
    public String getPermission_class() {
        return permission_class;
    }

    /**
     *
     * @param permission_class
     */
    public void setPermission_class(String permission_class) {
        this.permission_class = permission_class;
    }

    /**
     *
     * @return permission_name
     */
    public String getPermission_name() {
        return permission_name;
    }

    /**
     *
     * @param permission_name
     */
    public void setPermission_name(String permission_name) {
        this.permission_name = permission_name;
    }

    /**
     *
     * @return permission_description
     */
    public String getPermission_description() {
        return permission_description;
    }

    /**
     *
     * @param permission_description
     */
    public void setPermission_description(String permission_description) {
        this.permission_description = permission_description;
    }

}
