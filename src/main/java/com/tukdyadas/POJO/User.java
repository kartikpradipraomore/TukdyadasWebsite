package com.tukdyadas.POJO;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank(message = "First Name Required")
    private String firstName;

    @NotBlank(message = "Last Name Required")
    private String lastName;

    @Email(message = "Email Address Required")
    private String email;

    @NotBlank(message = "Phone Number Required")
    private String phNumber;

    @NotBlank(message = "Password Required")
    private String password;


}
