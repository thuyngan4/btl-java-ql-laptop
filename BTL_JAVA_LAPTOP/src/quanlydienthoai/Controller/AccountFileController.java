package quanlydienthoai.Controller;

import java.util.List;

import quanlydienthoai.File.AccountFile;
import quanlydienthoai.Models.Account;

public class AccountFileController {

    public static void SqlToFile() {
        List<Account> accountList = List.copyOf(AccountController.getAllAccount());
        AccountFile accountFile = new AccountFile();
        accountFile.write(accountList);
        System.out.println("SQL to FILE success!");
    }

//    public static void main(String[] args) {
    public static void FileToSql() {
        AccountFile accountFile = new AccountFile();
//        AccountController accountController = new AccountController();
/*        List<Account> a2 = */accountFile.read();
//        for (Account a : a2) {
////            System.out.println(a.toString());
//            if (!accountController.checkUsername(a.getUsername())) {
//                if (accountController.CreateNewAccount((Account) a)) {
////                    System.out.println("Create new an account success! ");
//                }
//            } else {
//                if (accountController.updateAccount(a)) {
////                    System.out.println("Update account success! ");
//                } else {
////                    System.out.println("Update account false! ");
//                }
//            }
//        }
        System.out.println("FILE to SQL success!");
    }

}
