package com.dio.base;

import java.math.BigDecimal;

public class Order {

    private final String code;
    private final int totalValue;

    public Order(String code, int totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        return "Order{" +
                "code='" + code + '\'' +
                ", totalValue=" + totalValue +
                '}';
    }

    public double calculateFee() {
/*        if (totalValue > 100){
            return totalValue * 0.99;
        } else {
            return totalValue;
        }*/

        switch (this.totalValue){
            case 100:
                return totalValue * 0.99;
            case 200:
                return totalValue * 1.99;
            default:
                return totalValue;

        }
    }

}
