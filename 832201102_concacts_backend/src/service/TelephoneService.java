package com.hqyj.service;

import com.hqyj.model.Telephone;

import java.util.List;

public interface TelephoneService {
    public List<Telephone> findAllTelephone();

    public boolean addTelephone(Telephone telephone);

    public boolean updateTelephone(Telephone telephone);

    public Telephone findTelephoneById(Integer id);

    public boolean deleteTelephoneById(Integer id);


}
