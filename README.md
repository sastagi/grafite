# Grafite

## Pre-requisites

1. Create Firebase project for your app
2. Add the google-services.json to the root of your project.
3. Install gcloud - https://cloud.google.com/sdk/docs/downloads-interactive
4. Set the gcloud project to the Firebase project created in step 1. (View all projects using `gcloud projects list` and set the gcloud project using `gcloud config set project `project_id_for_firebase_project

## Creating coverage reports

1. Run the following script: `./scripts/apks_for_testing.sh`
2. Run the following command to make sure you are able to run tests on Firebase Testlab:
`gcloud firebase test android run   --type instrumentation   --app app/build/outputs/apk/debug/app-debug.apk   --test app/build/outputs/apk/androidTest/debug/app-debug-androidTest.apk  --locales en   --orientations portrait  `
