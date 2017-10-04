# ServerServiceRepo

# Problem Statement
Our product owner would like a service that can be used to manage some of our servers.  This service should allow the user to fetch server(s), create, update, and delete them.  The product owner has indicated that servers will need to have a name, region, and a customer  that owns the server.  We plan to expose the service to only a handful of users, < 5, for now but it's expected to grow by the end of next year to ~100.

# Assignment
Your assignment is to create a REST service that will fulfill the product owner's request.  You may use the JVM language of your choice and either JEE or Spring.  You DO NOT need to create an actual database, an in-memory map is acceptable for this assignment.  The code should be as production-ready as possible since it will be handed off to a new team to manage it.  All artifacts should be checked into a git repository of your choosing.  

## Misc
* The new team that will own the code is very familiar with JVM languages
* Including a Dockerfile for running the app is preferred but not required
* Including a Jenkinsfile for building the app is preferred but not required
* Feel free to ask clarifying questions


This project by default initialize certain server list when the application started .Please use the below Sample URL to invoke the repective functions.
sample rest call 

for fetch 
localhost:8080/server/fetch

for insert 
http://localhost:8080/insert?name=""&customer=""&region=""

for update 
http://localhost:8080/update?name=""&customer=""&region=""

for delete 

http://localhost:8080/delete?name=""

