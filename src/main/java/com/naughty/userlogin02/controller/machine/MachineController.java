package com.naughty.userlogin02.controller.machine;

import com.alibaba.fastjson.JSON;
import com.naughty.userlogin02.bean.Machine;
import com.naughty.userlogin02.bean.User;
import com.naughty.userlogin02.dao.MachineDao;
import com.naughty.userlogin02.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MachineController {
    @Autowired
    MachineDao machineDao;

    @CrossOrigin
    @RequestMapping("/machine")
    public String getAllMachineInfo() {
        List<Machine> allMachineInfo = machineDao.getAllMachineInfo();
        String users_json = JSON.toJSONString(allMachineInfo);
        return users_json;
    }
    @RequestMapping("/machine/ooo")
    public String getMachineInfoByMachineId() {
        List<Machine> allMachineInfo = machineDao.getAllMachineInfo();
        String users_json = JSON.toJSONString(allMachineInfo);
        return users_json;
    }
}
