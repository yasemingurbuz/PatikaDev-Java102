package InsuranceManagementSystem;

import java.util.Date;

public class CarInsurance extends Insurance{

    public CarInsurance(double price, Date beginningDate, Date expiryDate) {
        super(4, "Araba Sigortası", 40, beginningDate, expiryDate);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double calculate() {

        long day = getExpiryDate().getTime() - getBeginningDate().getTime();
        double price = getPrice()*day;
        return price;
    }



}