## **Spring based Coordinates Application**
- Web application is created to show knowledge of Spring Boot, together with Core, Security and Web modules.
- Application has inMemoryAuthentication.
- Application implements N-tier architecture and consists of DAO, service and controllers layers.
- Tt allows connection to third party API and users are able to search by address and get all addresses by coordinates.

This application has 2 endpoints:
- "/search" endpoint allows you to save and return coordinates entered.
  You must enter your request in the following format:
  "localhost:8080/search?format=json&housenumber=<ENTER HOUSER NUMBER>&streetname=<ENTER STREET>&city=<ENTER CITY>"
  Example: search?format=json&housenumber=218&streetname=Piccadilly Circus&city=london"
- "/addresses" will return address related to previously entered coordinates.

### **Technologies used:**
- Java 11
- Spring Boot
- Hibernate
- JSON
- Nominatim API

#### To run this app locally
- Fork project to your repository and open project on your computer.
- You may use Web Browser or Postman to be able to send requests.
- You have to login using credentials "bob@test.com" with password "1234"
