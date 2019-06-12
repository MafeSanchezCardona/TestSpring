package com.test.spring.dao.impl;

import com.test.spring.dao.AddressDao;
import com.test.spring.domain.Address;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("addressDao")
public class AddressDaoImpl implements AddressDao {

    private List<Address> addressList;

    @Override
    public Address find(Address entity) {

        Address addressReturn = addressList.stream()
                .filter(address -> (entity.getStreet().equals(address.getStreet())
                        && entity.getApartment().equals(address.getApartment()) && entity.getNumber().equals(address.getNumber())))
                .findAny()
                .orElse(null);

        return addressReturn;
    }

    @Override
    public List<Address> findAll() {
        return addressList;
    }

    @Override
    public void insert(Address entity) {
        addressList.add(entity);
    }

    @Override
    public Address update(Address entity) {
        this.delete(entity);
        this.insert(entity);
        return entity;
    }

    @Override
    public void delete(Address entity) {
        Address addressFind = find(entity);
        addressList.remove(addressFind);
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
