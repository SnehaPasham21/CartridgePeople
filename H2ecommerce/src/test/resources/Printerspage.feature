Feature: Printers page
  
  Background:
    Given I navigate to cartridgepeople Homepage
    And I accept cookies message
    
    @run
    Scenario: Verify Printers 
      
      When I hover on "Printers" and follow "Inkjet Printers" link
        And I select "Canon PIXMA TS705 A4 Colour Inkjet Printer (Wireless)" from the list
        And I add the printer to the basket
        And I close the add to basket prompt
        And I click on checkout button
      Then I should see "Canon PIXMA TS705 A4 Colour Inkjet Printer (Wireless)" in checkout page
        And I should see "1" quantity selected
        And I should see "£59.90" in item price
        And I should see "£59.90" in total price
        
      