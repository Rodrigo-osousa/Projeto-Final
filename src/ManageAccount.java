import model.account.Account;
import model.account.CurrentAccount;
import model.creditCard.CreditCard;
import model.customer.Individual;
import model.enumeration.AccountType;
import model.enumeration.CustomerType;

import java.util.Scanner;

public class ManageAccount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CreditCard creditCard = new CreditCard();
        Individual individual = new Individual();
        CurrentAccount currentAccount = new CurrentAccount();

        individual.setIdCustomerIndiv(1);
        individual.setCustomerName("Test");
        individual.setCpf("999999999");
        individual.setCostumerType(CustomerType.INDIVIDUAL);

        creditCard.setIdCreditCard(1);
        creditCard.setCardLimit(100.00);
        creditCard.setCardNumber("9999-9999-9999-9999");

        currentAccount.setIdCurrentAccout(1);
        currentAccount.setCustomer(individual);
        currentAccount.setAccountNumber("9999");
        currentAccount.setAccountType(AccountType.CURRENT_ACCOUNT);
        currentAccount.setBalance(1000.000);
        currentAccount.setCreditCard(creditCard);


        currentAccount.obtainAccountData(currentAccount.getAccountNumber());

        currentAccount.checkBalance(currentAccount.getAccountNumber());

        currentAccount.withdrawCash(1.99);
        currentAccount.checkBalance(currentAccount.getAccountNumber());

        currentAccount.cashDeposit(300.00);

    }
}
