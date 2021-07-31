package InsuranceManagementSystem;

import java.util.Date;

public class HealthInsurance extends Insurance{

    public HealthInsurance(double price, Date beginningDate, Date expiryDate) {
        super(1, "Sağlık Sigortası", 10, beginningDate, expiryDate);

    }

    @Override
    public double calculate() {

        long day = getExpiryDate().getTime() - getBeginningDate().getTime();
        double price = getPrice()*day;
        return price;
    }



}