package com.test.spring.dao.impl;

import com.test.spring.dao.AddressDao;
import com.test.spring.domain.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddressDaoImpl implements AddressDao {


    @Override
    public Address find(Address entity) {
        return null;
    }

    @Override
    public List<Address> findAll() {
        return null;
    }

    @Override
    public void insert(Address entity) {

    }

    @Override
    public Address update(Address entity) {
        return null;
    }

    @Override
    public void delete(Address entity) {

    }
}
