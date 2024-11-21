package com.granja.oinc_system.dao;

import org.springframework.stereotype.Repository;

import com.granja.oinc_system.dao.model.Endereco;
@Repository
public class EnderecoDAO extends GenericDAO<Endereco> {
    public EnderecoDAO() {
        super(Endereco.class);
    }
}

