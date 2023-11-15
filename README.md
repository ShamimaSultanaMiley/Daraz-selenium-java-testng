# Automated Testing of Daraz Website with Selenium and TestNG

## Overview

Automated testing of the Daraz website using Selenium with Java and TestNG. The test cases cover various functionalities and aspects of the website, ensuring a comprehensive evaluation of its features.

## Project Structure

### Packages

- **basePackage**
  - `base` class contains setup and teardown methods using TestNG annotations to initialize and close the WebDriver. It also includes a method to navigate to the Daraz homepage.

- **taskList**
  - `home_page_test` class contains test cases related to the Daraz homepage, including checks for the presence of search box, cart option, categories, and payment methods.

  - `test_after_search_first_page` class includes additional test cases specifically focused on searching for 'hp laptop core i5' in the search box.

## Test Cases

### Class name : public class home_page_test{}

1. **Is there any search box in Homepage?**
2. **Is there any cart option?**
3. **How many categories are there in the Home Page?**
4. **Print the category names that are visible on the homepage and match all the category types by assertion.**
5. **How many payment methods are shown in the footer?**

### Class name : public class test_after_search_first_page{}
Search 'hp laptop core i5' Tests
1. **How many laptops are shown on the first page?**
2. **In 'Short By', click on 'Price low to high' and check the total results shown on the first page.**
3. **In 'Short By', click on 'Price High to low' and check the total results shown on the first page.**
4. **In 'Short By', click on 'Price Best Match' and check the total results shown on the first page.**
5. **How many types of service are shown? Print the types of service and test the results.**
6. **How many types of warranty are shown? Print the types of warranty and test the results.**
7. **How many types of Location are shown? Print the types of Location and test the results.**
