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

    @Column
    private boolean hasEvent;

    @Column
    private String eventTitle;

    @Column
    private String eventDate;

    @Column
    private String eventStartHour;

    @Column
    private String eventEndHour;

    @Column
    private String description;
}
