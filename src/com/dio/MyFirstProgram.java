package com.dio;

import com.dio.base.Order;

import java.util.Scanner;

public class MyFirstProgram
{
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        double valor;

        System.out.print("Enter the order value: ");
        valor = input.nextDouble();

        Order order = new Order("code123", valor);

        System.out.println(order);

    }
}
