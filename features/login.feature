Feature: Login

Scenario: BaseLogin

Given Launch the browser
And Load the url
And Enter the UserName as 'demosalesmanager'
And Enter the pwd as 'crmsfa'
When Click on the LoginButton
Then Verify Login success
When Click on the crmsfa link
And CloseDriver