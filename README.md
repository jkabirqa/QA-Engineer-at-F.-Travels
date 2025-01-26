# QA-Engineer-at-F.-Travels

Test plan:
Mainly functional testing will be done for those test scenarios.
The scope can be like the following: 
Content updates dynamically on each refresh
Uniqueness of the content
Link validity and correct redirection and 
Content accuracy as well.
Other tests like usability, performance, and security can also be applied.
=========================================
Dynamic Content (Link) – The content changes each time the page is refreshed.
Dynamically Loaded Page Elements (Link) – Content is loaded asynchronously after a user action.
Forgot Password (Link) – Ensure error handling is included.
===================================================================

Test cases:
Dynamic Content (Link) – The content changes each time the page is refreshed.
1. visit the page and refresh it multiple times
2. check the link is unique
3. click on the link
4. wait for the dynamic link to be visible.
5. validate load time.

Dynamically Loaded Page Elements (Link) – Content is loaded asynchronously after a user action.
1. store initial contents and wait for loading and capturing contents after refreshing.
2. verify contents are differents for one page
3. verify dynamic contents are loading and not empty
4. repeat test case 1 for multiple refreshing and contents are differents from previous iterations.

Forgot Password (Link) – Ensure error handling is included.
1. verify with valid email
2. test with invalid email
3. check with empty email
4. verify with special character.

