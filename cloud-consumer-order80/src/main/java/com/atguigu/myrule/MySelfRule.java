/**
 * Copyright By  2020年03月26日 09:16:31 techCoLtd
 * All right reserved
 */
package com.atguigu.myrule;/**
 * @Auther: admin
 * @Date: 2020/3/26 09:16
 * @Description:
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 版权归公司所有
 * 项目名称: 干部平台
 * @创建者 liuxiaoyang
 * @创建日期 2020年03月26日 09:16:31
 * @version 1.0
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}