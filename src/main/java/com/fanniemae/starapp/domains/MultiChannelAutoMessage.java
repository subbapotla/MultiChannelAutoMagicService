package com.fanniemae.starapp.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MultiChannelAutoMessage {

    @Id
    @GeneratedValue
    private Long id;
    private String customerId;
    private String cardId;
    private String channelType;
    private String contact;

    public Long getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getAccountsSid() {
        return accountsSid;
    }

    public void setAccountsSid(String accountsSid) {
        this.accountsSid = accountsSid;
    }

    private String accountsSid;

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "MultiChannelAutoMessage{" +
                "id=" + id +
                ", customerId='" + customerId + '\'' +
                ", cardId='" + cardId + '\'' +
                ", channelType='" + channelType + '\'' +
                ", contact='" + contact + '\'' +
                ", accountsSid='" + accountsSid + '\'' +
                '}';
    }
}

