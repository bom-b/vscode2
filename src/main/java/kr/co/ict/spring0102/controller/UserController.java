package kr.co.ict.spring0102.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ict.spring0102.vo.UserVO;

@RestController
public class UserController {
    @GetMapping(value = "/userList")
    public List<UserVO> getUserList() {
        List<UserVO> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserVO v = new UserVO();
            v.setNum(i);
            v.setName("춘시기" + i);
            v.setEmail("tess" + i + "@a.com");
            v.setUdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            list.add(v);
        }
        return list;

    }

    @GetMapping(value = "/detail")
    public UserVO getUserDetail(int num) {
        int i = num;
        UserVO v = new UserVO();
        v.setNum(i);
        v.setName("테스형" + i);
        v.setEmail("tess" + i + "@a.com");
        v.setUdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        return v;
    }
}
