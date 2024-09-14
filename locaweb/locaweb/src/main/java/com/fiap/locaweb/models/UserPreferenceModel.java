package com.fiap.locaweb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user_preferences")
@NoArgsConstructor
@AllArgsConstructor
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
