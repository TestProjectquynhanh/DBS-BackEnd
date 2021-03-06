package com.rade.dentistbookingsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Account_Notification")
public class AccountNotification implements Serializable {
    @EmbeddedId
    AccountNotificationKey id;

    @ManyToOne
    @MapsId("account_id")
    @JoinColumn(name = "account_id")
    Account account;

    @ManyToOne
    @MapsId("notification_id")
    @JoinColumn(name = "notification_id")
    Notification notification;

}
