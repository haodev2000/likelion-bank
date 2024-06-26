package service;

import InterFace.BankInterface;
import model.Account;
import model.Bank;
import model.CurrentAccount;
import model.SavingsAccount;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankService implements BankInterface {

    Scanner sc = new Scanner(System.in);


    @Override
    public void getList(Bank b) {
        System.out.printf("%-5s %-15s %-20s %-15s %-20s %n",
                "ID", "AccountID", "Tên thẻ", "Loại Tài Khoản", "Số Dư");

        // Printing a separator line
        System.out.println("-------------------------------------------------------------------------------------------");

        // Printing each account's details in a formatted table row
        for (Account acc : b.getListAccount()) {
            System.out.printf("%-5s %-15s %-20s %-15s %-20s %n",
                    acc.getId(), acc.getAccountid(), acc.getName(), acc.getClass().getSimpleName(), acc.getBlance());
        }
    }

    @Override
    public void addAccounttoBank(List<Account> listAccount, Bank b) {
        CurrentAccount accountC = new CurrentAccount();
        SavingsAccount accountV = new SavingsAccount();

        try {
            // Nhập danh sách account
            System.out.println("------------" + b.getName() + "------------");
            System.out.println("Nhập accout current: ");

            System.out.println("Nhập id : ");
            int id = sc.nextInt();
            accountC.setId(id);

            Random randomC = new Random();
            StringBuilder randomNumbersC = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int number = randomC.nextInt(10);
                randomNumbersC.append(number);
            }

            accountC.setAccountid(randomNumbersC.toString());

            System.out.println("Nhập name : ");
            String name = sc.nextLine();
            name += sc.nextLine();
            accountC.setName(name);

            System.out.println("Nhập tiền gửi ban đầu : ");
            Long initialDeposit = sc.nextLong();
            accountC.setInitialDeposit(initialDeposit);

            accountC.setBlance(0L + accountC.getInitialDeposit());


// Account Vvvvvvvvvvv

            // Nhập danh sách account SAVING
            System.out.println("Nhập accout saving: ");

            System.out.println("Nhập id : ");
            int idV = sc.nextInt();
            accountV.setId(idV);

            Random randomV = new Random();
            StringBuilder randomNumbersV = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int number = randomV.nextInt(10);
                randomNumbersV.append(number);
            }

            accountV.setAccountid(randomNumbersV.toString());

            System.out.println("Nhập name : ");
            String nameV = sc.nextLine();
            nameV += sc.nextLine();
            accountV.setName(nameV);

            System.out.println("Nhập tiền gửi ban đầu : ");
            Long initialDepositV = sc.nextLong();
            accountV.setInitialDeposit(initialDepositV);

            accountV.setBlance(0L + accountV.getInitialDeposit());

            listAccount.add(accountC);
            listAccount.add(accountV);

            b.setListAccount(listAccount);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void addSavingAccount(List<Account> listAccount, Bank b, SavingsAccount accountV) {
        System.out.println("-------Thêm SavingsAccount-------");
        System.out.println("Nhập id : ");
        int idV = sc.nextInt();
        accountV.setId(idV);

        Random randomV = new Random();
        StringBuilder randomNumbersV = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int number = randomV.nextInt(10);
            randomNumbersV.append(number);
        }

        accountV.setAccountid(randomNumbersV.toString());

        System.out.println("Nhập name : ");
        String nameV = sc.nextLine();
        nameV += sc.nextLine();
        accountV.setName(nameV);

        System.out.println("Nhập tiền gửi ban đầu : ");
        Long initialDepositV = sc.nextLong();
        accountV.setInitialDeposit(initialDepositV);

        accountV.setBlance(0L + accountV.getInitialDeposit());

        listAccount.add(accountV);

        b.setListAccount(listAccount);
    }

    @Override
    public void addCurrentAccount(List<Account> listAccount, Bank b, CurrentAccount accountC) {
        System.out.println("-------Thêm CurrentAccount-------");
        System.out.println("Nhập id : ");
        int idV = sc.nextInt();
        accountC.setId(idV);

        Random randomV = new Random();
        StringBuilder randomNumbersV = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int number = randomV.nextInt(10);
            randomNumbersV.append(number);
        }

        accountC.setAccountid(randomNumbersV.toString());

        System.out.println("Nhập name : ");
        String nameV = sc.nextLine();
        nameV += sc.nextLine();
        accountC.setName(nameV);

        System.out.println("Nhập tiền gửi ban đầu : ");
        Long initialDepositV = sc.nextLong();
        accountC.setInitialDeposit(initialDepositV);

        accountC.setBlance(0L + accountC.getInitialDeposit());

        listAccount.add(accountC);

        b.setListAccount(listAccount);
    }


}
