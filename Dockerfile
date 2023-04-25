From openjdk:8
Expose 9191
Add build/libs/employee-management-system.jar employee-management-system.jar
ENTRYPOINT ["java","-jar","/employee-management-system.jar"]