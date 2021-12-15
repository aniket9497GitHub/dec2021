Feature: Switch Tab feature of gmail
Background: User is on Gmail Login page
Given user open browser "webdriver.chrome.driver" with exe "D:\\PerfectLearn\\Automation Support\\chromedriver.exe"
Given user enter url as "https://www.gmail.com"

Scenario: To check SwitchTab funcionality of gmail
When user click on help button
When user switch to second tab
When user click on Google Account button
When user switch on third tab
Then application shows focus on third tab of UI
 