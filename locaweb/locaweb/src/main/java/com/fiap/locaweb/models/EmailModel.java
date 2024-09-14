package com.fiap.locaweb.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "emails")
@NoArgsConstructor
@AllArgsConstructor
public class EmailModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_id")
    private Long id;
    @Column
    private String sender;
    @Column
    private String receiver;
    @Column
    private String subject;

    @Column
    private String content;

    @Column(name = "is_read")
    private boolean read;
    @Column
    private boolean starred;
    @Column
    private boolean trashed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
}
