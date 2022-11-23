package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00 ");

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public void displayCurrentAmount(double balance){

        System.out.println("Hesabinizda bulunan miktar : " + moneyFormat.format(balance));

    }

     private double calculateCheckingBalanceAfterWithdraw(double amount){

        checkingBalance = checkingBalance - amount;

        return checkingBalance;
     }

     private double calculateCheckingBalanceAfterDeposit(double amount){

        checkingBalance =  checkingBalance + amount;

        return checkingBalance;
     }

     private double calculateSavingBalanceAfterWithdraw(double amount){

        savingBalance = savingBalance - amount;

        return savingBalance;
     }

     private double calculateSavingBalanceAfterDeposit(double amount){

        savingBalance = savingBalance + amount;

        return savingBalance;
     }

     public void getCheckingWithdraw(){

         displayCurrentAmount(checkingBalance);

         System.out.println("Cekmek istediginiz miktari giriniz?");

         double amount = input.nextDouble();

         if (amount <= 0){

             System.out.println("0 veya  (-) rakamlar gecerli degildir.");

             getCheckingWithdraw(); // recursive method // methodu tekardan cagirma

         }else if (amount <= checkingBalance){

             calculateCheckingBalanceAfterWithdraw(amount);

             displayCurrentAmount(checkingBalance);

         }else {

             System.out.println("Yetersiz bakiye");

         }
     }

     public void getCheckingDeposit(){

         displayCurrentAmount(checkingBalance);

         System.out.println("Yatirmak istediginiz miktari giriniz");

         double amount = input.nextDouble();

         if (amount < 0){

             System.out.println("0 veya  (-) rakamlar gecerli degildir.");

             getCheckingDeposit();

         }else {

             calculateCheckingBalanceAfterDeposit(amount);

             displayCurrentAmount(checkingBalance);

         }

     }

     public void getSavingWithdraw(){

        displayCurrentAmount(savingBalance);

         System.out.println("Cekmek istediginiz miktari giriniz.");

         double amount = input.nextDouble();

         if (amount <=0){

             System.out.println("0 veya  (-) rakamlar gecerli degildir.");

             getSavingWithdraw();

         } else if (amount <= savingBalance) {

             calculateSavingBalanceAfterWithdraw(amount);

             displayCurrentAmount(savingBalance);

         }else {

             System.out.println("Yetersiz bakiye");

         }

     }

     public void getSavingDeposit(){

        displayCurrentAmount(savingBalance);

         System.out.println("Yatirmak istediginiz miktari giriniz");

         double amount = input.nextDouble();

         if (amount <= 0){

             System.out.println("0 veya  (-) rakamlar gecerli degildir.");

             getSavingDeposit();

         }else {

             calculateSavingBalanceAfterDeposit(amount);

             displayCurrentAmount(savingBalance);

         }

     }

}
