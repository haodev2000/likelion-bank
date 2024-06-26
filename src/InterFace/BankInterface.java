package InterFace;

import model.Account;
import model.Bank;
import model.CurrentAccount;
import model.SavingsAccount;

import java.util.List;

public interface BankInterface {
    void getList(Bank b);
    void addAccounttoBank(List<Account> accountList, Bank b);
    void addSavingAccount(List<Account> listAccount, Bank b, SavingsAccount accountV);
    void addCurrentAccount(List<Account> listAccount, Bank b, CurrentAccount accountV);

}
