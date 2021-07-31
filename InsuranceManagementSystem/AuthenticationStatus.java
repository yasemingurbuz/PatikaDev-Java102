package InsuranceManagementSystem;

import java.util.TreeSet;

public enum AuthenticationStatus {
    SUCCESS("Başarılı"),
    FAIL("Başarısız");

    private String status;
    TreeSet<Account> accounts = new TreeSet<>();

    AuthenticationStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
