package com.luban.feginClientService;

import com.luban.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("server-admin")
public interface AdminFeginService {


    @RequestMapping("/user/getUser")
    public R getUser(@RequestParam("username") String username);

    @RequestMapping("/user/register")
    public R register(@RequestParam("username") String username,@RequestParam("password")String password);
}
