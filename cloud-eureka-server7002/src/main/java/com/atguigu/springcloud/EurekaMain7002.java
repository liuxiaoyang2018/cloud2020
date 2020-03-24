/**
 * Copyright By  2020年03月24日 10:46:31 techCoLtd
 * All right reserved
 */
package com.atguigu.springcloud;/**
 * @Auther: admin
 * @Date: 2020/3/24 10:46
 * @Description:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * 版权归公司所有
 * 项目名称: 干部平台
 * @创建者 liuxiaoyang
 * @创建日期 2020年03月24日 10:46:31
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }


}