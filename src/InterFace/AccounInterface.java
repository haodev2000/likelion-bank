package InterFace;

import model.Account;
import model.Bank;

import java.util.List;


public interface AccounInterface {
    Account findByID(int id, Bank b);
    void guiTien(List<Account> listAccount, int id);
    void rutTien(List<Account> listAccount, int id);
}
