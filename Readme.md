# Spring boot 2 backend template architecture
Created by maven 3.5.4
## Architecture
- root
    - api module : web api
    - common module : common service supports
    
### Tips
1. Make sure that your maven version is about 3.5.* or you will encounter the properties question when children use parent's properties.
2. Remember to extends UnitTest class.That make you code less.
3. Resources are placed in common module as recommended. Common module doesn't import api dependency. So you could place them in api unless they are unnecessary for your test.
4. Change Application class `@ComponentScan` value to your wanted package name.
5. Remove the properties `maven.deploy.skip` in pom of common module if you want to deploy it to your server.
6. The Swagger-ui url is `http://localhost:8079/swagger-ui.html`.BTW in 2.9.2 version you must `@ApiModelProperty` to your properties of models

# Spring boot 2 后端框架
Maven 3.5.4构建
## 结构
- 根目录
    - api 模块：web侧的api
    - common 模块：一些支持服务
    
### 小提示
1. Maven最好用3.5版本，低于这个版本会遇到子模块不能引用父模块的属性，3.6版本构建会出问题
2. 单元测试记得继承UnitTest，可以少写点代码
3. 资源文件最好放在common模块的resources里，因为common没有依赖api模块。所以你可以放单元测试用不到的资源在api里面
4. Application类中的注解`@ComponentScan`里面的值记得改成自己的包名
5. 如果你想把common包也部署到私服，记得把common模块pom中的`maven.deploy.skip`去掉
6. Swagger接口文档地址是`http://localhost:8079/swagger-ui.html`，2.9.2版本的swagger必须要加`@ApiModelProperty`在你的model类的属性里

#### TODO 
~~- swagger~~ Done
- common result
- aop exception