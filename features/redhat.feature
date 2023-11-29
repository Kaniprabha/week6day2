Feature: Registration process on the RedHat Portal

@redhatRegistration
Scenario Outline: RedHat 

Given LaunchChrome
#Given Launch the browser
Then Load the redhatUrl
When Click the Notification 
And Click Registration Link
Given redhat UserName as <uName>
And redhat Password as <password>
And redhat Email as <mail>
And redhat phNum as <phone>
Then Then Close the chrome

Examples:
|uName|password|mail|phone|
|Prabha|Prabha357Ragul!|prabha@gmail.com|0123456789|
|Ragul|Prabha357Ragul!|ragul@gmail.com|0123456789|
|Kesav|Kesav357Ragul!|kesav@gmail.com|0123456789|
