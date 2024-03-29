# Shoe-Store-Automate
Shoe Store!

## Technical Specifications
* TestNG v6.9.10
* Bonigarcia v3.8.1
* Selenium v3.141.59
* Allure Reports v2.13.2

## How to Run Project
* git clone https://github.com/ambiaahmed1/Shoe-Store_Auto.git (Do not download as zip)
* maven clean, install (will run tests if not skipped)
* run test individually from test package
* Go to > test-output > reports > current date > report.html (See below)

![image](https://user-images.githubusercontent.com/9343284/138035981-875c2d96-f631-4c46-b284-8ea73eb8529d.png)


## Test Case

###### Validate Home  
Given I am a customer  
When I enter the shoe store site with the following URL: https://shoe-store-july.herokuapp.com/  
Then I will land on Show Store home page  
And I will validate Page Title
And I will validate static content
And I will see 3 components:  
* Remind me of new Shoes
* Promotional Code
* Choose a Brand  

###### Navigation
Given I am a customer  
When I enter the shoe store site with the following URL: https://shoe-store-july.herokuapp.com/  
Then I will land on Show Store home page  
And I will be able to navigate across the page from January through December and All Shoes  
And I will see header and static contents  


###### Remind me of new shoes
Given I am customer  
When E-mail Address is blank  
And I click submit  
Then I will see error message in red center aligned **“Please enter an email address”**  

Given I am customer  
When E-mail Address is in invalid format  
And I click submit  
Then I will see error message in red center aligned **“Invalid email format. Ex. name@example.com”**  

Given I am customer  
When E-mail Address is in valid format   
And I click submit  
Then I will see error message in red center aligned **“Thanks! We will notify you of our new shoes at this email: E-mail address here”**  

###### Promotional Code 
Given I am customer  
When Promotional Code is blank   
And I click submit  
Then I will see error message in red center aligned **“Please enter a promotional code”**  

Given I am customer  
When Promotional Code is in invalid format   
And I click submit  
Then I will ee error message in red center aligned **“Invalid code format”**  
  
###### Choose a Brand
Given I am customer  
When I DO NOT select a brand from the drop down  
And I click Search  
Then I will see message center aligned top **“Please Select a Brand”** 

Given I am customer  
When I DO select a brand from the drop down  
And I click Search  
Then I will see brand name on the next page: **/brands/name**  

Given I am customer  
When I view the brands from the drop down  
Then I will see 254 brand names  
  
Given I am customer  
When I view the brands from the drop down  
Then I will see 254 brand names in alpha numeric  


  
**Issues:**
 1.	Title for all shoes is missing.
 2.	Promotional Code does not give you the valid format on error message.
 3.	After completing a brand search and clicking the back button, message remains “Please Select a Brand”.
 4.	Input Text fields does not have any boundaries.
 5.	Failing to load images.
 6.	kate spade newyork starts with lowercase.
 7.	rag bone starts with lowercase.

