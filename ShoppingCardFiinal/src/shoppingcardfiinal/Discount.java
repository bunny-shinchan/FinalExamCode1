/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcardfiinal;

/**
 *
 * @author verms
 */


public abstract class Discount {
	   protected double amount;

    enum Type {

        AMOUNT,
        PERCENTAGE
    }

    public Discount(double a) {

        amount = a;
    }

    public abstract double applyDiscount(double price);
}