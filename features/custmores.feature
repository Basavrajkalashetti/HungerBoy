Feature:customers
@sanity
Scenario:Add new customer
Given User Launch Chrome browser
  When User opens URL "https://demo.nopcommerce.com/login"
  And User enters Email as "admin@yourstore.com" and password as "admin"
  And Click on Login
  Then User can view Dashboard
  When User click on customer Menu
  And  click on customer Menu Item
  And click on Add new button
  Then User can view Add new customer page
  When User enter customer info
  And click on save button
  Then User can view confirmation message "The new customer has been added successfully"
  And close browser.