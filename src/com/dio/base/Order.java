package com.dio.base;

public class Order {

    private final String code;
    private final int totalValue;

    public Order(String code, int totalValue) {
        this.code = code;
        this.totalValue = (int) calculateFee(totalValue);
    }

    @Override
    public String toString() {
        return "Order{" +
                "code='" + code + '\'' +
                ", totalValue=" + totalValue +
                '}';
    }

    public double calculateFee(int totalValue) {
/*        if (totalValue > 100){
            return totalValue * 0.99;
        } else {
            return totalValue;
        }*/

        switch (totalValue) {
            case 100:
                return totalValue * 0.99;
            case 200:
                return totalValue * 1.99;
            default:
                return totalValue;

        }
    }

}
