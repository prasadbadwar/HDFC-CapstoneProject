From openjdk:8
Expose 9090
Add build/libs/employee-management-system.jar employee-management-system.jar
ENTRYPOINT ["java","-jar","/app.jar"]