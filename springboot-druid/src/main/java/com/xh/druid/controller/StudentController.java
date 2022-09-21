package com.xh.druid.controller;


import com.xh.druid.model.StudentEntity;
import com.xh.druid.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author H.Yang
 * @since 2021-06-10
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/listAll")
    public List<StudentEntity> listAll() {

        return studentService.list();
    }

    @PostMapping("/saveOrUpdate")
    public boolean saveOrUpdate(@RequestBody StudentEntity entity) {

        return studentService.saveOrUpdate(entity);
    }
}

