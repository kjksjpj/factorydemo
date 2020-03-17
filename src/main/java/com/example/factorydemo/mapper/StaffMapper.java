package com.example.factorydemo.mapper;

import com.example.factorydemo.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
public interface StaffMapper {
    //1.查询所有员工
    List<Staff> queryAllStaff();
    //2.添加员工信息
    int addStaff(Staff staff);
    //3.删除单条员工
    int delStaffById(@Param("staffId") int id);
    //4.根据id查询单条员工信息
    Staff queryStaffById(@Param("staffId") int id);
    //5.根据id修改员工信息
    int updateStaffInfo(Staff staff);
    //6.根据姓名模糊查询
    List<Staff> queryStaffByName(@Param("staffName") String staffName);
    //7.根据工号查询员工
    Staff queryStaffByNumber(@Param("staffNumber") String staffNumber);
    //8.order By 分类查询员工信息
    List<Staff> queryAllStaffByKind();
    //9测试结果集
    List<Staff> queryTest();
    //10.选择员工后更新员工任务
    int updateStaffInfoAfterChoice(Map<String, Object> map);
    //11.获得员工数目
    int getStaffCount();
    //12.获得分页数据
    List<Staff> getStaffInfo(Map<String, Object> map);
}
