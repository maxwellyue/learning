# learning   
**spring + springMVC + mybatis**

## 环境
IDE：Intellij IDEA 2016

构建：Maven


## 遇到的问题总结

* 项目运行后报错：`org.apache.ibatis.binding.BindingException: Invalid bound statement (not found)`
<br>解决办法:[MyBatis绑定错误：Invalid bound statement (not found)](https://my.oschina.net/wangdaoliang/blog/652266)
* 在service中使用@Autowired注入dao的时候，IDEA提示could not autowire
<br>解决办法:[ IDEA在编辑时提示could not autowire]()

## 总体思路
* 创建maven项目，补全目录
* 在pom.xml中加入相关依赖
* 配置ssm：从dao层、service层、controller层依次配置
* 配置web.xml
* 配置服务器，运行项目

## 注意的地方
* classpath是什么？文件中classpath与classpath*的区别