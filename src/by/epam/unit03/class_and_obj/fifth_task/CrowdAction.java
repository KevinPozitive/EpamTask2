package by.epam.unit03.class_and_obj.fifth_task;

import java.util.Arrays;
import java.util.Comparator;

public class CrowdAction {

    protected Crowd sort(Crowd crowd) {
        Customer[] customers = crowd.getCustomers();
        Arrays.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (!o1.getSecondName().equals(o2.getSecondName())) {
                    return o1.getSecondName().compareTo(o2.getSecondName());
                }
                else if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                else {
                    return o1.getThirdName().compareTo(o2.getThirdName());
                }
            }
        });
        return crowd;
    }

    protected Crowd findCustomers(Crowd crowd, int lowerRangeLimit, int upperRangeLimit){

        Customer[] customers=crowd.getCustomers();

        Customer[] goodCustomers=new Customer[crowd.getCustomers().length];

        int k=0;

        for (int i=0;i<crowd.getCustomers().length;i++){

            if(isInDiapason(customers[i],lowerRangeLimit,upperRangeLimit)){

                goodCustomers[k]=customers[i];

                k++;

            }

        }

        Crowd finded=new Crowd(goodCustomers);

        return finded;

    }

    protected boolean isInDiapason(Customer customer, int lowerRangeLimit, int UpperRangeLimit) {

        if (lowerRangeLimit < customer.getBankAccountNumber()&&customer.getBankAccountNumber() < UpperRangeLimit) {

            return true;

        }

        return false;

    }
}
