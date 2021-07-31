package InsuranceManagementSystem;

import java.util.Date;

public class ResidenceInsurance extends Insurance{

	public ResidenceInsurance(double price, Date beginningDate, Date expiryDate) {
            super(2, "Konut Sigortası", 20, beginningDate, expiryDate);
            // TODO Auto-generated constructor stub
        }

        @Override
        public double calculate() {

            long day = getExpiryDate().getTime() - getBeginningDate().getTime();
            double price = getPrice()*day;
            return price;
        }



    }