Contanizer the spring boot application

First: Goto the root directory of the application
Second: run the following command in your terminal
        i. docker build -t spring-boot-docker.jar   
       ii. docker run -p9090:8080 spring-boot-docker.jar

Here in the step <i> it will build the image with name spring-boot-docker.jar if you wanted to change then name you can used the following command
 docker build -t --name <name of the image> spring-boot-docker.jar

In the step <ii> you will run the image hosting port 9090 where 8080 is the container port.

Application will be run inside the container you can check by triggering the end point
localhost:9090/message 

