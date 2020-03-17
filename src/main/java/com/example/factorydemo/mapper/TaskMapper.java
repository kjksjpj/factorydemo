package com.example.factorydemo.mapper;

import com.example.factorydemo.pojo.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
public interface TaskMapper {
    //1.插入任务信息
    int addTask(Task task);
    //2.根据父订单id查询子任务
    List<Task> queryTaskByFatherId(@Param("taskFatherId") int id);
    //3.根据id删除任务
    int delTaskById(@Param("taskId") int taskId);
    //4.选择员工后更新员工任务
    int updateTaskInfoAfterChoice(Map<String, Object> map);
    //5.查询所有的任务
    List<Task> queryAllTask();
}
