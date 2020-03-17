package com.example.factorydemo.service;

import com.example.factorydemo.mapper.StaffMapper;
import com.example.factorydemo.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffMapper staffMapper;

    //查询所有员工
    public List<Staff> queryAllStaff() {
        return staffMapper.queryAllStaff();
    }

    public Staff queryStaffById(Integer staffId) {
        return staffMapper.queryStaffById(staffId);

    }

    public int updateStaffInfo(Staff staff) {
        return staffMapper.updateStaffInfo(staff);
    }


    public int addStaff(Staff staff) {
        return staffMapper.addStaff(staff);
    }

    public int delStaffById(int staffId) {
        return staffMapper.delStaffById(staffId);
    }
}
