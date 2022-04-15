package model.account;

import model.creditCard.CreditCard;
import model.customer.Customer;
import model.enumeration.AccountType;

public class SpecialAccount extends Account {
    private Integer idSpecialAccount;
    private Double limitAmount;

    public Integer getIdSpecialAccount() {
        return idSpecialAccount;
    }

    public void setIdSpecialAccount(Integer idSpecialAccount) {
        this.idSpecialAccount = idSpecialAccount;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void specialWithdraw(Double money) {
        if (this.balance <= money) {
            balance = balance - money;
            limitAmount = balance + limitAmount;
            balance = 0.0;
        }
    }


}
