# task_tealiumdemo_ecoomerce

# Project Overview

This project involves testing key features of an application, including user registration, login, and end-to-end functionality from login to adding products to the cart.

## Features Tested

1. **User Registration**
   - **Valid Scenario ("Smoke Testing")**: Verified that a new user can register successfully with valid credentials.
   - **Invalid Scenario**: Tested various invalid inputs to ensure proper error handling and validation.

2. **Login**
   - Verified that registered users can log in with valid credentials.
   - Ensured appropriate error messages are displayed for invalid login attempts.

3. **End-to-End Scenario**
   - Tested the full workflow:
     - Logging in as a user.
     - Browsing products.
     - Adding products to the shopping cart.

## Testing Highlights

- **Techniques Used**:
  - Functional Testing
  - Smoke Testing
  - End-to-End Testing
- **Tools**:
  - Selenium WebDriver (for automation)
  - TestNG (for test execution and reporting)
  - Cucumber for BDD

## Future Improvements

- Extend test coverage for additional features (e.g., checkout process, order history).
- Implement data-driven testing for a wider range of input scenarios.
