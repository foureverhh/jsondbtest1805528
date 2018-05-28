package com.springtestdatabase180528.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
@AllArgsConstructor
public class Company {
    @Column(name = "company_name")
    private String name;
    private String catchPhrase;
    private String bs;

    public Company(){

    }
}
