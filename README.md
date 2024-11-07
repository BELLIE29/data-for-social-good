# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 

> As an ice cream maker, <br> 
> I want to analyze frozen strawberry stocks, <br> 
> so I know what month is best for me to restock my strawberries for my ice cream shop. 

## Dataset 

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type. 

Dataset: https://www.nass.usda.gov/Charts_and_Maps/Crops_Cold_Storage/straw.php

https://docs.google.com/spreadsheets/d/1g6OkmJQ1xsdx7fYMOkEEJ6H_Zv4cBqGv6AZz2-IMCdM/edit?usp=sharing

- **Month** (String) - months of the year 
- **2021** (int) - number of frozen strawberries per month over the year of 2021
- **2022** (int) - number of frozen strawberries per month over the year of 2022
- **2023** (int) - number of frozen strawberries per month over the year of 2023
- **2024** (int) - number of frozen strawberries per month over the year of 2024 so far

## UML Diagram 

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README. 

![alt text](<Copy of (Unit 3) UML Diagram.png>)

## Description 

Write a description of your project here. In your description, include as many vocab words from your class to explain your User Story, the chosen dataset and how your project addressed that users goals. If your project used the Scanner class for user input, explain how the user will interact with your project.

In this project my partner and I chose a story about an ice cream maker. Our ice cream maker specializes in strawberry ice cream. This means he needs a lot of frozen strawberries. He wants to analyze frozen strawberry stocks so he knows which month he should restock his frozen strawberries. The dataset we chose was one from USDA.gov. This dataset showed us how many frozen strawberries there were in stock per month in the years 2021, 2022, 2023, and 2024. From this dataset, we decided to use the columns month and 2023. We didn't go with 2024 as the year is not over yet, so we chose 2023. In this project, to answer our question, we used the two columns we chose as arrays. The month array being a string and the poundsOfStrawberries (using the pounds of frozen strawberries in 2023 column) as an integer array. We then made an enhanced for loop method which calucated what the max amount of strawberries were in the 2023 pounds text file. It would then return the max. We then had a toString method which returns the max pounds of frozen strawberries and the month that max was found in, which would be called/displayed in our tester class. When our project is ran, what's displayed is our question, "What Month Had the Most Frozen Strawberries?", and then our answer to the question, "Month: July" "Pounds of Frozen Strawberries: 260".