package account.cardaccount;

import account.Account;
import inter.*;
import inter.subInner.SubInnerInterface;

import java.util.Scanner;

public class CardAccount extends Account
        implements AccountInterface, CommonInterface , SubInnerInterface {
    private int cardNumber;
    private String cardName;
    public static String cardType="credit";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //    public CardAccount() {
//    }
    public CardAccount(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void printMessage() {
        System.out.println("This is card account class");
    }

    public CardAccount() {

    }

    public CardAccount(String cardName) {

    }

    public CardAccount(int cardNumber, String cardName) {

    }

    public class AccountInnerClass {
        public void printMessage() {
            System.out.println("This is card account inner class");
        }
    }

    public static class AccountNestedClass {
        public void printMessage() {
            System.out.println("This is card account nested class");
        }
    }
    interface AccountInterface {
        public void printMessage();
    }

}
