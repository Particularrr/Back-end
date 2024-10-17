package com.hqyj.controller;
import com.hqyj.model.Telephone;
import com.hqyj.service.TelephoneService;
import com.hqyj.util.ResponseResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/telephones")  //标识请求该类中的处理方法前必须添加/users前缀
public class TelephoneController {

    @Resource
    private TelephoneService telephoneService;

    @GetMapping("/findAllTelephone")
    public ResponseResult<List<Telephone>> findAllTelephone()
    {
        ResponseResult<List<Telephone>> result = null;
        List<Telephone> users = telephoneService.findAllTelephone();
        result = ResponseResult.success(users);
        return result;
    }

    @PostMapping("/addTelephone")
    public ResponseResult<Boolean> addTelephone(@RequestBody Telephone telephone)
    {
        return ResponseResult.success(telephoneService.addTelephone(telephone));
    }

    @PostMapping("/updateTelephone")
    public ResponseResult<Boolean> updateTelephone(@RequestBody Telephone telephone)
    {
        return ResponseResult.success(telephoneService.updateTelephone(telephone));
    }

    @GetMapping("/deleteTelephoneById/{id}")
    public ResponseResult<Boolean> deleteTelephoneById(@PathVariable Integer id)
    {
        return ResponseResult.success(telephoneService.deleteTelephoneById(id));
    }

    @GetMapping("/findTelephoneById/{id}")
    public ResponseResult<Telephone> findTelephoneById(@PathVariable Integer id)
    {
        return ResponseResult.success(telephoneService.findTelephoneById(id));
    }



}
