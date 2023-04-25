From openjdk:8
Expose 9191
Add build/libs/employee-management-system-0.0.1-SNAPSHOT.jar employee-management-system-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/employee-management-system-0.0.1-SNAPSHOT.jar"]