package model.customer;

import model.enumeration.CostumerType;

abstract class Customer {
    private String address;
    private CostumerType costumerType;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CostumerType getCostumerType() {
        return costumerType;
    }

    public void setCostumerType(CostumerType costumerType) {
        this.costumerType = costumerType;
    }
}
