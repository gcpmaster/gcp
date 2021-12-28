# How to work with spring boot hello-world with jib
Steps: 
    - Create new service account with minimum Roles as "Artifact Registry Writer"
    - Create the key file
    - Go to cloud shell & execute below commands:
        - gcloud auth activate-service-account SERVICE_ACCOUNT_EMAIL --key-file=KEY_FILE.json
        - gcloud auth configure-docker us-central1-docker.pkg.dev,asia-south1-docker.pkg.dev 
        - mvn compile jib:build