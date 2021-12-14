# testLog4jBug
Log4j2爆出了利用难度极低的JNDI注入漏洞，当程序将用户输入的数据进行日志记录时，即可触发此漏洞，成功利用此漏洞可以在目标服务器上执行任意代码
jndi下载https://github.com/welk1n/JNDI-Injection-Exploit
![image](https://user-images.githubusercontent.com/22991359/145966457-c667f2f7-a5dc-44bd-b056-f294f6037e40.png)
图上地址复制到代码里注入就行了
