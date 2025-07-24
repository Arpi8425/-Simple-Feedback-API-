# 📝 Feedback API — HDFC Life Spring Boot Assessment

This project is a simple Feedback Collection API built using Spring Boot, Java 17, and PostgreSQL.
It allows users to submit feedback and view all previously submitted entries.

----------

🚀 How to Run the Project

    1. Set Up PostgreSQL Database
        Create a database named `feedback_db`:
    2. Configure the Database in application.properties (src/main/resources/application.properties)
       UPDATE:-
        spring.datasource.password=yourpassword  <<-------
    3. Start the Application
        i. Run this command in the terminal : -
            a] cd feedback-api
            b] .\mvnw.cmd spring-boot:run
                                OR
        ii. Just press the green run button

    DONEE
-------------------------------------------------------------------------------------------

 How to view the output ???
 There are 2 Waysss

 1. View API in Swagger
    👉 Open ( http://localhost:8080/swagger-ui/index.html#/ )
     From there, you can test both:
     a.POST /feedback
        i. Click on Post /feedback
        ii. Click on "Try it Out". (On right side)
        iii. Post your feedback.... (post it in given format )
            {
                   "name": "string",
                   "email": "string@gmail.com",
                   "message": "Great course to learn Springboot"
                 }
        iv. Click execute (You will see the 200 OK )

     b.GET /feedback  (To check all the feedbacks)
        i. Click on Get /feedback
        ii. Click on "try it out" (On right side)
        iii. Hit Execute ( You will see all the previous feedbacks )

                            OR

2.   Enter this command in new Terminal  :-

           curl -Method POST http://localhost:8080/feedback `
              -Headers @{ "Content-Type" = "application/json" } `
              -Body '{ "name":"String", "email":"string@email.com", "message":"Great course to learn Java!" }'

---------------------------------------------------------------------------------------------------------------------------

All required endpoints and validations match the PDF requirements.

Database is persistent with PostgreSQL.

Swagger and cURL can both be used for API testing.

Unit test for saveFeedback() is included and passes.


---

I'll include screenshots or a zip folder .
Hope you like it .