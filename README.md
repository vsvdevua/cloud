# Spring cloud with eureka server and client


1.Download;

2.run eureka server and check http://localhost:8761;

3.run eureka client and check http://localhost:8761;
http://localhost:9888/greeting, 
http://localhost:9888/a, 
http://localhost:9888/b;

4.run eureka feign client and check http://localhost:8761;
http://localhost:9999/get (we will have gotten method from http://localhost:9888/greeting )

5.go to folder config application properties and set userValue=your value; 
 stop eureka client and run config server and then run eureka client;
  
  check "http://localhost:9888/a" you can see it will be injected "userValue"
  
6.run eureka server, eureka client, eureka feign client and zuulserver 
check http://localhost:8761;
http://localhost:7777/cloud/eclient/greeting;
http://localhost:7777/cloud/eclient/a;
http://localhost:7777/cloud/eclient/b;
http://localhost:7777/cloud/fclient/get;

7.test security run eureka server and check http://localhost:8761;
run authserver and check http://localhost:8761;
run secured client and check http://localhost:8761;
use postman!!!
check http://localhost:9090/try;
unauthorized
to authorization
go to http://localhost:8880/oauth/token and get token(access token)
POST Authorization(username=flametoken, password=thisissecret)  Body(grant_type=password,scope=webclient, username=alex,password=123)
and go to check
GET Authorization(Bearer token)and paste token 
  http://localhost:9090/try;
 then GET Authorization(Bearer token)and paste token
 http://localhost:9090/token/token/try 
 you will seen in console credentials
