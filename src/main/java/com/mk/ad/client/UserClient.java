package com.mk.ad.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient( value = "ad-user" )
public interface UserClient {
    /*
     *  根据token查询出userid
     **/
    @RequestMapping(value = "/ad-user/api/userIdByToken",method = RequestMethod.POST)
    String getUserId(@RequestBody  String accessToken);
}
