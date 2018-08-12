# Grafite

## Pre-requisites

1. Create Firebase project for your app
2. Add the google-services.json to the root of your project.
3. Install gcloud - https://cloud.google.com/sdk/docs/downloads-interactive
4. Set the gcloud project to the Firebase project created in step 1. (View all projects using `gcloud projects list` and set the gcloud project using `gcloud config set project `project_id_for_firebase_project
5. Go to gcloud console on web to create a new bucket called.
6. Specify this bucket name in the config.properties file.
7. Specify this bucket name for BUCKET_NAME in flank.sh

## Creating coverage reports

Run the following scripts:
1. `./scripts/apks_for_testing.sh`
2. `./scripts/flank.sh`
