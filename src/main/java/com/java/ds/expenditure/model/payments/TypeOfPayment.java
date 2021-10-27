package com.java.ds.expenditure.model.payments;

import java.util.HashMap;

public class TypeOfPayment {

    public static final HashMap<Integer, String> typeOfPayment = new HashMap<>();

    static {
        typeOfPayment.put(1, "One time payment");
        typeOfPayment.put(2, "Loan repayment");
        typeOfPayment.put(3, "Other payment");

    }

    public String get(int key) {
        return typeOfPayment.get(key);
    }

}
