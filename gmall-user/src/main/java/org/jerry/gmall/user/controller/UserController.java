package org.jerry.gmall.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junjun.lei@hand-china.com
 * @create 2019-10-30 19:57
 */
@RestController
public class UserController {
    @GetMapping("index")
    public String index(){
        return "hello user";
    }
}
