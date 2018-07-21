package com.sda.saleboard.model.dto.policy;

public class ListPolicyByDateDto {
    private String userEmail;
    private int daysAmount;

    public ListPolicyByDateDto() {
    }


    public ListPolicyByDateDto(String userEmail, int daysAmount) {
        this.userEmail = userEmail;
        this.daysAmount = daysAmount;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getDaysAmount() {
        return daysAmount;
    }

    public void setDaysAmount(int daysAmount) {
        this.daysAmount = daysAmount;
    }
}
