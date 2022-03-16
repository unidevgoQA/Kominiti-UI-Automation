## JAVA SELENIUM UI TEST TEMPLATE


## Execution
Tests execute by running Maven Surefire plugin configurated by testng.xml file:

`mvn clean test`

Tests doesn't run in parallel because of the way Maven Surefire plugin works.
### Example
For tests example, I implemented interactions with WebElements using Selenium listed on http://demoqa.com/ using Page Object Pattern.

### Test parameters
Test can be parametrized by parameters.xml file, where we input key as XML Tag and value between tags, i.e: `<browser>Chrome</browser>`. We receive parameters value using _ParametersReader_ class and method _getPropertyByName()_

#### Browsers
For test in different browser update POM file with the desired browser name.

Note: For now webdriver manager is implemented so you don't need any driver locally to kick off test. If you don't want webdriver manager just update Browser file with the location of the driver or store driver in environment.
