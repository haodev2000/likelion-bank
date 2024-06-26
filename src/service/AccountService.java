package service;

import InterFace.AccounInterface;
import model.Account;
import model.Bank;

import java.util.List;
import java.util.Scanner;

public class AccountService implements AccounInterface {

    Scanner sc = new Scanner(System.in);



    @Override
    public Account findByID(int id, Bank b) {

        for (Account acc : b.getListAccount()){
            if(acc.getId()==id){
              return acc;
            }
        }
        return null;
    }

    @Override
    public void guiTien(List<Account> listAccount, int id) {
        for (Account acc : listAccount){
            if(acc.getId()==id){
                System.out.println("Nhập số tiền muốn gửi");
                Long initialDeposit = sc.nextLong();
                acc.setInitialDeposit(initialDeposit);
                acc.setBlance (acc.getBlance() + acc.getInitialDeposit());
            }
//            b.setListAccount(listAccount);
        }

    }

    @Override
    public void rutTien(List<Account> listAccount, int id) {
        for (Account acc : listAccount){
            if(acc.getId()==id){
                System.out.println("Nhập số tiền muốn rút");
                Long initialDeposit = sc.nextLong();
                acc.setInitialDeposit(initialDeposit);
                acc.setBlance (acc.getBlance() - acc.getInitialDeposit());
            }
        }
    }
}
