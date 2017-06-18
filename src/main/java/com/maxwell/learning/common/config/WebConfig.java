package com.maxwell.learning.common.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/************************************************************************************
 * 文件功能描述：跨域配置
 * 创建人：岳增存
 * 创建时间： 2017年05月09日 --  10:48 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
/*@Configuration
@EnableWebMvc*/
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/*")
                .allowedOrigins("*")
                .allowedMethods("POST,OPTIONS")
                .allowedHeaders("token","Content-Type","Origin");
    }
}
