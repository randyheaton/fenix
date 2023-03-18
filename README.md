#A Fork of Firefox for Android with an extra button in the overflow menu

This is a fork of Firefox for Android with an extra button in the overflow menu. 

The button opens a dialog with a text-davinci-003 - rendered page summary. 

It also rolls back the gradle plugin because I'm still on Android Studio Chipmunk. 


## A super important point about testing:

gradle.properties is *not* followed by this repo. That means my openai api key is not in the repo and won't
find its way into configurations at build time. 

In order to test, add a valid openai api key to gradle.properties with the line:

```
summaryToken = sk-xxxxxxxxxxxxxxx

```