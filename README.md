# week9作业
学号：42435014  
姓名：唐小欢

## 项目简介
基于SpringBoot+Spring Security+MySQL实现用户登录认证与权限控制系统，完成用户认证、密码加密和角色访问控制。

## 实现功能
1. 搭建SpringBoot项目，引入Spring Security、JPA和MySQL依赖
2. 配置数据库连接，创建用户表和角色表并初始化测试账号
3. 使用BCryptPasswordEncoder对用户密码进行加密存储
4. 实现UserDetailsService，从数据库加载用户认证信息
5. 配置SecurityFilterChain，实现登录、退出和未授权访问控制
6. 基于角色完成普通用户和管理员页面的权限限制

## 启动
先执行`sql/schema.sql`和`sql/data.sql`初始化数据库，修改`application.yml`中的数据库用户名和密码后启动项目，访问`http://localhost:8080/login`进入登录页面。
