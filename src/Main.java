//import account.cardaccount.CardAccount;
//
//import account.cardaccount.CardAccount;
//import java.lang.*;
//import java.util.Date;
//
//import static java.lang.System.*;
//import static account.cardaccount.CardAccount.*;

import account.cardaccount.CardAccount;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
//        out.println(cardType);
//        AccountNestedClass account = new AccountNestedClass();
//        CardAccount.AccountInnerClass accountInnerClass;
//        CardAccount cardAccount1 = new CardAccount();
//        cardAccount1.printMessage();
//
//        ((CardAccount) Class.forName
//                ("account.cardaccount.CardAccount")
//                .newInstance()).printMessage();
//
//
//        CardAccount cardAccount3 = (CardAccount) cardAccount1.clone();
//        cardAccount3.printMessage();
        //        cardAccount.printMessage();
//        String cardType = CardAccount.cardType;
//        CardAccount.AccountInnerClass accountInnerClass
//                = new CardAccount().new AccountInnerClass();
//        accountInnerClass.printMessage();
//        CardAccount.AccountNestedClass accountNestedClass
//                = new CardAccount.AccountNestedClass();
//        accountNestedClass.printMessage();
//        customer.CardAccount customer = new customer.CardAccount();
        int a = 7, b = 12;
        System.out.println("a: " + a + ", b: " + b);
        System.out.println(sum(a, b));
        System.out.println("a: " + a + ", b: " + b);
        int[] arr = {7, 12};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(changeArrayElement(arr)));
        System.out.println(Arrays.toString(arr));
    }

    private static int[] changeArrayElement(int[] arr) {
       // arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10;
        }
        return arr;
    }

    private static int sum(int a, int b) {
        a = 10;
        b = a;
        return a + b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
