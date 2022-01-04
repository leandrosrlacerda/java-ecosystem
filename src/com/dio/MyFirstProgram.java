package com.dio;

import com.dio.base.Order;

import java.util.Scanner;

public class MyFirstProgram
{
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int valor;

        System.out.print("Enter the order value: ");
        valor = input.nextInt();

        Order order = new Order("code123", valor);

        //order.calculateFee();
        System.out.println(order);

    }
}
