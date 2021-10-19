# Shoe-Store_Auto - Ambia
Shoe Store!

## Technical Specifications
* TestNG v6.9.10
* Bonigarcia v3.8.1
* Selenium v3.141.59

## Test Case

###### Validate Home  
Given I am a customer  
When I enter the shoe store site with the following URL: https://shoe-store-july.herokuapp.com/  
Then I will land on Show Store home page  
And I will validate Page Title  

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
Then I will see error message in red center aligned **“Thanks! We will notify you of our new shoes at this email: <E-mail address here>”**  

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
Then I will see 254 brand names in alpha numeric case sensitve    


