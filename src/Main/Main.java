package Main;

import model.Account;
import model.Bank;
import model.CurrentAccount;
import model.SavingsAccount;
import service.AccountService;
import service.BankService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService bankService = new BankService();
        AccountService accountService = new AccountService();

        CurrentAccount accountC = new CurrentAccount();
        SavingsAccount accountV = new SavingsAccount();

        Bank b = new Bank();
        b.setName("Ngân Hàng AgriBank");

        List<Account> listAccount = new ArrayList<>();

        // Add list account to bank
        bankService.addAccounttoBank(listAccount, b);
        bankService.getList(b);

        boolean exit = false;
        while (!exit) {
            System.out.println("=== Menu ===");
            System.out.println("1. Add Saving Account");
            System.out.println("2. Add Current Account");
            System.out.println("3. Find Account by ID");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Display All Accounts");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bankService.addSavingAccount(listAccount, b, accountV);
                    break;
                case 2:
                    bankService.addCurrentAccount(listAccount, b, accountC);
                    break;
                case 3:
                    System.out.print("Enter the ID to find: ");
                    int idToFind = sc.nextInt();
                    accountService.findByID(idToFind, b);
                    break;
                case 4:
                    System.out.print("Enter the ID to deposit money: ");
                    int idToDeposit = sc.nextInt();
                    accountService.guiTien(listAccount, idToDeposit);
                    bankService.getList(b);
                    break;
                case 5:
                    System.out.print("Enter the ID to withdraw money: ");
                    int idToWithdraw = sc.nextInt();
                    accountService.rutTien(listAccount, idToWithdraw);
                    bankService.getList(b);
                    break;
                case 6:
                    bankService.getList(b);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();

    }

}

