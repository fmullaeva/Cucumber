Feature: All Menu Labels

    Background: Navigate to espoCrmURL
      Given user is on espoCRM

    Scenario: User validates menu labels
      When user logs in to HomePage
      Then user validates menu labels
        | Home          |
        | Accounts      |
        | Contacts      |
        | Leads         |
        | Opportunities |
        | Reports       |
        | Quotes        |
        | Sales Orders  |
        | Invoices      |
        | Products      |
        | Emails        |
        | Cases         |
        | Calender      |

      Scenario: Validate account creation
        When the user open the Accounts
        And the user clicks the Create Account button
        And the user fills name as "David"
        Then the user validate the new users is created