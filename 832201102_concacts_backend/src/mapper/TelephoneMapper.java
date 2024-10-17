package com.hqyj.mapper;

import com.hqyj.model.Telephone;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TelephoneMapper
{
    public List<Telephone> findAllTelephone();

    public boolean addTelephone(Telephone telephone);

    public boolean updateTelephone(Telephone telephone);

    public Telephone findTelephoneById(Integer id);

    public boolean deleteTelephoneById(Integer id);
}
