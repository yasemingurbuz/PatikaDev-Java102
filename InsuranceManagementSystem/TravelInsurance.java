package InsuranceManagementSystem;

import java.util.Date;

public class TravelInsurance extends Insurance{

    public TravelInsurance(int id, double price, Date beginningDate, Date expiryDate) {
        super(id, "Seyahat Sigortası", 30, beginningDate, expiryDate);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double calculate() {

        long day = getExpiryDate().getTime() - getBeginningDate().getTime();
        double price = getPrice()*day;
        return price;
    }



}
