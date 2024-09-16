package com.fiap.locaweb.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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

    @Column
    private boolean hasEvent;

    @Column
    private String eventTitle;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy - HH:mm")
    @Column
    private LocalDateTime eventDate;

    @Column
    private Time eventStartHour;

    @Column
    private Time eventEndHour;
    @Column
    private String description;

}
