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


---
## 目录说明
 * doc
 存放一些文档，如接口文档等
 * db
 存放临时的数据库的相关文件
 * profile
 存放生产环境、测试环境、正式环境的配置文件；请务必与resources下的配置文件同名，以保证在maven打包时可以正确替换其中的配置文件
 * src
 项目主目录，代码均在此