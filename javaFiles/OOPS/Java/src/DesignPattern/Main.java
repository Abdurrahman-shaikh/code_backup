package DesignPattern;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {

        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());

//        TaxCalculator calculator = getCalculator();
//        calculator.calculateTax();
    }
//    @Contract(" -> new")
//    public static @NotNull TaxCalculator getCalculator(){
//        return new TaxCalculator2022();
//    }
}
