Feature: This is a contact page functionality

@contactemail 
Scenario: Verify Contact Email field on Contact page
Given  open "<URL>" URL 
Then Click contact link                                                                   
Then Verify Contact email field in contact page                                                                                                                                                                                                                                                                                                                              Step-2 Click contact  link                                                                                                                                                                                                                                                                                                                     step-3 Verify  Contact email field  in contact page

@contactname
Scenario: Verify  Contact Name field on Contact page
Given  open URL   
Then Click contact  link                                                                  
Then Verify  Contact name field in contact page

@messagefield
Scenario: Verify Message field on Contact page
Given  open URL   
Then Click contact  link                                                                  
Then Verify  Message field  in contact page               

@sendMessageButton
Scenario: Verify Send Message button is clickable
Given  open URL   
Then Click contact  link                                                                  
Then  Click send message button  
Then Verify Send Message button is clickable  


@contactverification
Scenario: Verify user able to send a message after clicking the send button
Given  open URL   
Then Click contact  link  
Then Enter email address in contact email field 
Then Enter contact name  in contact name field 
Then  Enter message in message field 
Then click send message button    
Then User able to send a message after clicking send button                                                                                                                                                                                                                                                                                                                                                                           

       
