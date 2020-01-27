# Integration of 3rd party libraries with Grails, Spring Boot and others

This repo is a *proof of concept* of several ways of integrate a 3rd party library into applications.

The main purpose is create framework independent components to be freely integrated with every needed framework

## Projects inside this repo

* **jsonplaceholderclient**: Example of 3rd party library. Simple client of REST API in http://jsonplaceholder.typicode.com

* **jsonplaceholder-sb-autoconfigure**: Spring Boot Autoconfigure module

* **jsonplaceholder-spring-boot-starter**: Spring Boot Starter to be used as dependency in Spring Boot applications that integrate 3rd party library

* **springapp**: Simple Spring Boot application that uses Spring Boot Starter module

* **grailsapp**: Grails 4 application that uses Spring Boot Starter module

* **grailsapp-w-plugin-w-starter**: Grails 4 application, with grails plugin that uses Spring Boot Starter

* **grailsapp-w-plugin-wo-starter**: Grails 4 application with grils plugin that does not depend on Spring Boot Starter. Plugin integrates 3rd party library directly in its `doWithSpring()` method

* **graislapp-w-resources**: Grails 4 application that integrates 3rd party library using `spring/resources.groovy`

* **springapp-groovy**: The same as `springapp` but using Groovy instead of Java. It depends on *Groovy Markup* as the template engine
