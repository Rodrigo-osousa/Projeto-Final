package model.account;

public class SpecialAccount extends Account{
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
}
