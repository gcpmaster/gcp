# How to work with spring boot hello-world with jib
Steps: 
    - mvn clean package
	- docker build -t hello-world:0.1 .
	- docker history hello-world:0.1
	- docker run -p 8080:80 --name my-app  hello-world:0.1

	- gcloud auth configure-docker us-central1-docker.pkg.dev,asia-south1-docker.pkg.dev
	- docker tag hello-world:0.1 asia-south1-docker.pkg.dev/$project_ID/docker-repo/hello-world:0.1
	- docker push asia-south1-docker.pkg.dev/$project_ID/docker-repo/hello-world:0.1

	#remove all conatiners
	- docker rm -f $(docker ps -a -q)
