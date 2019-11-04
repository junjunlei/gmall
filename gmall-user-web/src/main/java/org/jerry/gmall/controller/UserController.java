package org.jerry.gmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.jerry.gmall.bean.UmsMember;
import org.jerry.gmall.bean.UmsMemberReceiveAddress;
import org.jerry.gmall.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户（会员）Controller
 *   dubbo消费者 调用
 * @author jerry
 * @create 2019-10-30 19:57
 */
@RestController
public class UserController {
    @Reference
    private UserService userService;

    @GetMapping("index")
    public String index() {
        return "hello user";
    }

    @GetMapping("list")
    public ResponseEntity<List<UmsMember>> getAllUser() {
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
    }
    @GetMapping("address-list")
    public ResponseEntity<List<UmsMemberReceiveAddress>> getAllAddress(@RequestParam("memberId")Long memberId){
        return  new ResponseEntity<>(userService.getReceiveAddressByMemberId(memberId),HttpStatus.OK);
    }
}
