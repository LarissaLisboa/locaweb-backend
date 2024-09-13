package com.fiap.locaweb.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.mapping.List;


@Getter
@Setter
@Entity
@Table(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;

//    @OneToMany(mappedBy = "user")
//    private List<EmailModel> emails;

    @OneToOne(mappedBy = "user")
    private UserPreferenceModel userPreference;
}
