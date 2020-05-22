Feature: User registration to the Americanas application

  @Register
 Scenario Outline: As a client,  I need to register myself as a new user to the Americanas application

   Given I navigate to the register page
   When I add all information "<email>","<password>", "<cpf>", "<full_name>", "<birth_date>","<gender>" ,"<phone>"
   And save my information
   Then I must be able to view the Home Page again "<welcome>"


   Examples:
     | email                  |  password |cpf           | full_name    | birth_date | gender  |phone       |welcome    |
     |voluntaries@gmail.com   |12345678   |00130940097   |João Silva    |17/09/1978  |  Male   |81941363712 |olá João   |
     |chomicha4822@inserver.tk|95743212   |66770228033   |Maria Clara   |30/11/1976  |  Female |66995025548 |olá Maria  |