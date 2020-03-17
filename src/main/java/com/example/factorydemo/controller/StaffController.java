package com.example.factorydemo.controller;

import com.example.factorydemo.pojo.Staff;
import com.example.factorydemo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class StaffController {

    @Autowired
    private StaffService staffService;


    //查询全部员工
    @RequestMapping("/allStaff")
    public String queryAllStaff(Model model){
        List<Staff> staffList = staffService.queryAllStaff();
        System.out.println(staffList);
        model.addAttribute("staffList",staffList);
        return "allUserlist";
    }

    //根据id来到修改员工信息页面
    @RequestMapping("/updateStaffInfo/{staffId}")
    public String updateStaffInfo(@PathVariable(name = "staffId") Integer staffId, Model model){
        Staff staff = staffService.queryStaffById(staffId);
        model.addAttribute("staff",staff);
        return "updateStaff";
    }

    //提交表单
    @PostMapping("/updateStaffInfo")
    public String doUpdateStaffInfo(Staff staff, Model model){
        int i = staffService.updateStaffInfo(staff);
        if (i > 0) {
            System.out.println("ok的");
        } else {
            System.out.println("不ok");
        }
        return "redirect:/allStaff";
    }

    //跳转到增加员工页面
    @GetMapping("/toAddStaff")
    public String toAddStaff(){
        return "addStaffInfo";
    }

    //单条插入员工信息
    @PostMapping("/addStaff")
    public String addOneStaff(Staff staff, HttpServletResponse response) {
            staffService.addStaff(staff);
        return "redirect:/allStaff";
    }

    //删除员工信息
    @RequestMapping("/delStaffById/{staffId}")
    public String delStaffById(@PathVariable(name = "staffId") Integer staffId, Model model){
        staffService.delStaffById(staffId);
        return "redirect:/allStaff";
    }
}
