package com.modules.admin.feginService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("server-product")
public interface ProductServiceClient {



}
