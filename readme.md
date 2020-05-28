##常用配置
###改端口
server.port = 8080
###改随机端口
server.port = ${random.int[1024,9999]}
为什么不用固定端口
1.容易造成端口冲突
2.开发中开发人员不用记住ip和端口
##自定义配置
###@value
@value("${wei.name}")
##spring boot日志框架原理
###logback
###log4j
###slf4j
logback和log4j是日志实现框架
slf4j提供了框架日志框架的简单抽象（门面模式），实际就是一个api，不能单独使用，必须结合logback或log4j使用
spring boot2.0底层采用了logback+log4j的日志模式
###日志级别
日志级别debug info warn info
spring boot默认采用info级别的日志
###日志级别设置
logging.level.com.wei.springboot.hello = trace
###配置日志的存储路径和存储形式
####配置在项目根路径下
logging.file.path = output/logs
路径为/output/logs/spring.log,默认的日志名为spring.log
####配置在自定义目录下
logging.file = /volumes/data/logs/springboot.log
##lombok的使用
###lombok安装
idea中搜索lombok
安装玩重启idea
###lombok使用
####@Data
注解在实体类上，自动生成set/get方法，写构造器，equals等方法
pom文件添加依赖包
####@Slf4j
注解在要打印日志的类上，代替 private static final Logger log = LoggerFactory.getLogger(MyController.class)
##spring异步调用
###目的
容错性：如注册送积分的业务，不能因为送积分失败导致注册失败
提升性能：无需等待，直接返回
###@Async使用
在配置类类上添加@Configuration注解（给springIOC容器）
在配置类类上添加@EnableAsync注解（异步注解）
在异步方法上添加@Async注解即可
###为@Async配置自定义线程池
####原因
@Async默认的线程是递增的，不可重用
####配置
在配置类里配置线程池的bean
使用@sync注解的时候指定线程池的名字（bean的名字）
##swagger
微服务过多的时候会有很多的接口调用，要写很多接口的文档（API），采用swagger自动生成接口文档
###步骤
引入swagger的依赖包

    <!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger2 -->
    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger2</artifactId>
        <version>2.9.2</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger-ui</artifactId>
        <version>2.9.2</version>
    </dependency>
application.yml中添加配置 spring.swagger.enabled = true
新增swagger的配置类
###常用注解
####@Api
描述类的作用，注解在类上
####@ApiOperation
描述类的方法的作用，注解在方法上
####@ApiParam
描述类的方法参数的作用，注解在方法的参数上
####@ApiModel
描述对象的作用，注解在请求或返回对象上
####@ApiModelPropert
描述对象里字段的作用，注解在请求或返回对象的字段上
