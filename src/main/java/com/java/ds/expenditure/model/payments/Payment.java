package com.java.ds.expenditure.model.payments;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Payment {

    public default String getTitle() {
        return null;
    }
    public default BigDecimal getValue() {
        return null;
    }
    public default LocalDate getDateOfPayment() {
        return null;
    }

}
