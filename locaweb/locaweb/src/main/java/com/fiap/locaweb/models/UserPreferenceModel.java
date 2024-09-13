package com.fiap.locaweb.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user_preference")
public class UserPreferenceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String theme;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
}
