
@Regression
  Feature: Buy Mac Book from the homepage
@BuyMacbookSucess
    Scenario Outline: Buy Mac book sucess
      Given user logged
      |url|username|password|
      |<url>|<username>|<password>|
      When user buy the mac book
      |coments|
      |<coments>|
      Then user validate purchase sucess
      |textValidate|
      |<textValidate>|
      Examples:
      |url|username|password|coments|textValidate|
      |https://opencart.abstracta.us/index.php?route=common/home|nc1505696@gmail.com|Colombia2024*|compra de prueba|Your order has been placed!|


