package com.example.config;

import com.example.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *   中国平安保险（集团）股份有限公司
 *   待上线域名pingan.com
 *   http://39.103.176.186/  admin:pingan
 *   xiehua@pingan.com
 **/
@Configuration
public class ConfigAdapter implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/*").excludePathPatterns("materils_v2.0/index.html");
    }
}
