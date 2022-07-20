Feature: Test buy SauceDemo products

  Scenario Outline: Buy a product
    Given that i login as a stander user
      |<userName>|<password>|
    When i buy a product
      |<firstName>|<lastName>|<zip>|
    Then i should see the complete message <buyMessage>
    Examples:
      |userName     |password    |firstName|lastName  |zip   |buyMessage         |
      |standard_user|secret_sauce|Jose     |Hernandez |124523|CHECKOUT: COMPLETE!|