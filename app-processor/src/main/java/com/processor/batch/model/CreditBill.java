package com.processor.batch.model;

/**
 * Title com.processor.batch.model.CreditBill
 * Copyright: Copyright (c) 2005
 * Description: <br> </br>
 * Company: »¥¶¯ÔÚÏß
 * Created on 2015/5/22 18:34
 * author madong
 */
public class CreditBill {

    private String accountID = "";	/** é“¶è¡Œå¡è´¦æˆ·ID */
    private String name = "";		/** æŒå¡äººå¦Şå?*/
    private double amount = 0;		/** æ¶ˆè´¹é‡‘é¢ */
    private String date;			/** æ¶ˆè´¹æ—¥æœŸ ï¼Œæ ¼å¼YYYY-MM-DD HH:MM:SS*/
    private String address;

    @Override
    public String toString() {
        return "CreditBill{" +
                "accountID='" + accountID + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", address='" + address + '\'' +
                '}';
    }



    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
