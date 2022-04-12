import model.account.Account;
import model.account.CurrentAccount;
import model.creditCard.CreditCard;
import model.customer.Customer;
import model.customer.Individual;
import model.enumeration.AccountType;
import model.enumeration.CustomerType;

import java.util.Scanner;

public class ManageAccount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Individual individual = new Individual();
        individual.setIdCustomerIndiv(1);
        individual.setCustomerName("Test");
        individual.setCpf("999999999");
        individual.setCostumerType(CustomerType.INDIVIDUAL);

        CreditCard creditCard = new CreditCard();
        creditCard.setIdCreditCard(1);
        creditCard.setCardLimit(100.00);
        creditCard.setCardNumber("9999-9999-9999-9999");

        CurrentAccount currentAccount = new CurrentAccount();
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
        currentAccount.checkBalance(currentAccount.getAccountNumber());

    }
}
