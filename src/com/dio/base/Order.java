package com.dio.base;

import java.math.*;
/**
 * @author leandro
 * @version 1.0.0
 * @see BigDecimal
 * @since 1.0.0
 */
public class Order {

    // representa o código do pedido
    private final String code;
    private final int totalValue;

    /**
     * Construtor da Classe
     * @param code   Codigo do pedido
     * @param totalValue Valor total do pedido
     * */
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

    /**
     * Calcula o valor total de acordo com o valor do pedido. Se o valor for maior que R$100,00 uma taxa será cobrada
     * @retun Valor total do pedido com as taxas
     * @throws RuntimeException Se o pedido for um valor negativo
     */

/*    public BigDecimal calculateFee() throws RuntimeException {
        if (this.totalValue.signum() < 0){
            throw new RuntimeException("O pedido não pode ter o valor negativo.");
        }
        if (this.totalValue.compareTo(new BigDecimal("100.00")) > 100) {
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }
        return BigDecimal.valueOf(this.totalValue);
    }*/

}
