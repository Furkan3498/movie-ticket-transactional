package com.movie.booking.utility;

import com.movie.booking.exception.InsufficentBalanceError;

import java.util.HashMap;
import java.util.Map;

public class ValidatePayment {

    private static Map<String, Double> paymentInfo = new HashMap<>();
    static {
        paymentInfo.put("acc1",1000.0);
        paymentInfo.put("acc2",500.0);
        paymentInfo.put("acc3",2000.0);

    }

    public static boolean validationCreditLimit(String accNo, double paidAmount){
        if (paidAmount>paymentInfo.get(accNo)){
            throw new  InsufficentBalanceError("InsufficentBalance !!");
        }else {
            return true;
        }
    }
}
