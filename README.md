# Microservices with Spring Boot (Version 3.X)

Welcome to our Microservices project based on Spring Boot, featuring MySQL integration. This repository includes three core services (Quiz and Questions currently), an API Gateway.

## Project Structure

1. **Quiz Service**: Handles Quiz-related operations.
2. **Question Service**: Manages Question ratings for quiz.

## Infrastructure

- **API Gateway**: Directs and manages incoming requests to the appropriate services.

## Service Registry

All services are registered on the Eureka Server, facilitating seamless service discovery and communication.

## GitHub Repositories

Find the source code for each service and infrastructure component on our GitHub repositories:
1. [User Service](https://github.com/Prasad-RP/Microservices-Quiz/tree/master/user-services)
2. [Question Service](https://github.com/Prasad-RP/Microservices-Quiz/tree/master/Question-Service)
3. [Quiz Service](https://github.com/Prasad-RP/Microservices-Quiz/tree/master/Quiz-Service)
4. [Service Registry](https://github.com/Prasad-RP/Microservices-Quiz/tree/master/Service-Registry)
5. [API Gateway](https://github.com/Prasad-RP/Microservices-Quiz/tree/master/Api-Gateway)


## Getting Started

Follow these steps to set up and run the microservices locally:

1. Clone each repository.
2. Build and run the services in the following order:Service Registry, API Gateway, User Service, Question Service and Quiz Service.
3. Access the services through the API Gateway.

This project provides a scalable and modular architecture for building microservices using Spring Boot and integrates well with MySQL databases. Explore each service's repository for more detailed instructions and documentation.

## Microservices Still WIP
