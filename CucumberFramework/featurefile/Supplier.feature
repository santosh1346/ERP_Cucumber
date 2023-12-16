Feature: validating Supplier module

  @Supplierdata
  Scenario Outline: As admin user validate add supplier
    When open browser
    When open aapplication url "http://webapp.qedgetech.com/"
    When wait for username with "xpath" and "//input[@id='username']"
    When enter username with "xpath" and "//input[@id='username']"
    When enter password with "xpath" and "//input[@id='password']"
    When click on login with "id" and "btnsubmit"
    When wait for supplier with "xpath" and "(//a[@href='a_supplierslist.php'])[2]"
    When click supplier with "xpath" and "(//a[@href='a_supplierslist.php'])[2]"
    When wait for add button with "xpath" and "(//span[@data-caption='Add'])[1]"
    When click on addbutton with "xpath" and "(//span[@data-caption='Add'])[1]"
    When wait for suppliernumber with "xpath" and "//input[@id='x_Supplier_Number']"
    Then capture data with "name" with "x_Supplier_Number"
    When enter in "<suppliername>" with "id" and "x_Supplier_Name"
    When enter in "<adress>" with "xpath" and "//textarea[@id='x_Address']"
    When enter in "<city>" with "xpath" and "//*[@id='x_City']"
    When enter in "<country>" with "xpath" and "//input[@id='x_Country']"
    When enter in "<cperson>" with "xpath" and "//input[@id='x_Contact_Person']"
    When enter in "<pnumber>" with "xpath" and "//input[@id='x_Phone_Number']"
    When enter in "<mail>" with "xpath" and "//input[@id='x__Email']"
    When enter in "<mnumber>" with "xpath" and "//input[@id='x_Mobile_Number']"
    When enter in "<note>" with "xpath" and "//textarea[@id='x_Notes']"
    When click add button after adding notes with "id" and "btnAction"
    When wait for button with "xpath" and "//button[contains(text(),'OK!')]"
    When click on ok button with "xpath" and "//button[normalize-space()='OK!']"
    When wait for alert with "xpath" and "//button[@class='ajs-button btn btn-primary']"
    When click on alert with "xpath" and "//button[@class='ajs-button btn btn-primary']"
    Then user validate the supplier table
    When user closes the browser

    Examples: 
      | suppliername | adress  | city     | country | cperson | pnumber | mail         | mnumber | note |
      | santosh      | bala na | amerepet | india   |     789 |     123 | santoh@gmail |     123 | nice |
      | oh yeah      | bala    | amerepet | india   |     789 |     123 | oh@gmail     |     123 | nice |
