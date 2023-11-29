Feature: Registration on the W3Schools Portal 

@school
Scenario Outline: W3School

Given Launch the Browser
Given Load w3Url
When Given the frame
Given Given the fName as <firstName>
And Given the Email as <mail>
And Given the Address as <Address>
And Given the City as <city>
And Given the State as <state>
And Given the Zip as <zip>
And Given the ExYear as <exYear>
And Given the CVV as <cvv>
And Given the ExMonth as <exMonth>
And Given the CreditNumber as <CNum>
And Given the CreditName as <CName>
Then Then Close the browser


Examples:
|firstName|mail|Address|city|state|zip|exYear|cvv|exMonth|CNum|CName|
|prabha|prabha@gmail.com|1st Street|Chennai|TamilNadu|123|2018|cvv1|October|1111|Prabha.G|
|Ragul|ragul@gmail.com|2st Street|Thirunelveli|TamilNadu|456|2018|cvv2|October|2222|Ragul.G|
|Kesav|kesav@gmail.com|3st Street|Chennai|TamilNadu|789|2018|cvv3|October|3333|Kesav.K|
