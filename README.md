# CST-339 Activity 2 Report

**Date:** February 2, 2025
**Name:** Lauren Hutchens

## Introduction

This report details the development of a Spring MVC web application, encompassing model creation, view design, controller implementation, form handling with data validation, and the integration of Thymeleaf layouts. The project is structured according to the Model-View-Controller (MVC) architectural pattern, utilizing Spring Boot for rapid development and Thymeleaf for dynamic view rendering.  This report will walk through each part of the activity, detailing the code written, the diagrams associated with the code, and the results observed.

## Research Questions
1.
How does Spring MVC support the MVC design pattern? Draw a diagram that supports the answer tothis question.

Spring MVC is a framework that implements the Model-View-Controller (MVC) design pattern. It uses the DispatcherServlet as the central controller, handling incoming requests. This servlet then delegates to other components like controllers, which interact with the model. Views are generated based on the model data and returned to the user. This separation of concerns makes the application more modular and maintainable.
![image](https://github.com/user-attachments/assets/aed01ae4-bb1b-4681-9008-260094bf443e)

Research and identify 2 MVC Frameworks other than Spring MVC. What are the frameworks andhow do they differ from Spring MVC?

2.Besides Spring MVC, there are other MVC frameworks out there. Two that come to mind are Ruby on Rails and Apache Struts. Ruby on Rails, often just called Rails, is known for its "convention over configuration" philosophy, making development fast and easy for common tasks, which is different from Spring's more configuration-heavy approach. Rails is heavily opinionated, while Spring gives you more flexibility. Then you have Apache Struts, which is another Java-based framework. Struts uses interceptors to handle requests, which is a different approach than Spring's servlet-based dispatching. Struts, in my experience, can be a bit more complex to set up than Spring, and it's older, so Spring is generally more widely used now. Both frameworks, though, like Spring MVC, aim to separate concerns and make web development more structured.
