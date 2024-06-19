package com.epsi.mspr.payetonkawa.clients;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class ClientAddress {

    @Id
    private long id;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "city")
    private String city;
}
