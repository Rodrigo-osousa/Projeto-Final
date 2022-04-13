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
        int selectOption;

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

        System.out.println("Digite uma opção \n" +
                "1 (para sacar)\n" +
                "2 (para depositar\n" +
                "3 (para extrato\n" +
                "4 (Informações da sua conta)");
        selectOption = scanner.nextInt();

        switch (selectOption){
            case 1:
                System.out.println("Digite o valor para saque: ");
                double withdrawCash = scanner.nextDouble();
                currentAccount.withdrawCash(withdrawCash);
                currentAccount.checkBalance(currentAccount.getAccountNumber());
            break;
            case 2:
                System.out.println("Digite o valor do depósito: ");
                double depositAmount = scanner.nextDouble();
                currentAccount.cashDeposit(depositAmount);
            break;
            case 3:
                currentAccount.checkBalance(currentAccount.getAccountNumber());
            break;
            case 4:
                currentAccount.obtainAccountData(currentAccount.getAccountNumber());
            break;
            default:
                System.out.println("Opção não encontrada. Tente novamente!");
        }
    }
}
