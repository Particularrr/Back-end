package com.hqyj.service.impl;

import com.hqyj.mapper.TelephoneMapper;
import com.hqyj.model.Telephone;
import com.hqyj.service.TelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TelephoneServiceImpl implements TelephoneService {

    //调用数据访问层
    @Autowired
    private TelephoneMapper telephoneMapper;

    @Override
    public List<Telephone> findAllTelephone() {
        return telephoneMapper.findAllTelephone();
    }

    @Override
    public boolean addTelephone(Telephone telephone) {
        return telephoneMapper.addTelephone(telephone);
    }

    @Override
    public boolean updateTelephone(Telephone telephone) {
        return telephoneMapper.updateTelephone(telephone);
    }

    @Override
    public Telephone findTelephoneById(Integer id) {
        return telephoneMapper.findTelephoneById(id);
    }

    @Override
    public boolean deleteTelephoneById(Integer id) {
        return telephoneMapper.deleteTelephoneById(id);
    }

}
