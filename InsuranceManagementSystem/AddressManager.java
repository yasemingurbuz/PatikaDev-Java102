package InsuranceManagementSystem;

public class AddressManager {
    public boolean add(User user,Address address) {
        if(user.getAddresses().add(address)) {
            return true;
        }
        return false;
    }

    public boolean remove(User user,int id) {
        if(user.getAddresses().remove(id) != null) {
            return true;
        }
        return false;

    }
}