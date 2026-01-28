pipeline {
	agent any
	
	environment {
		IMAGE_NAME = 'hongeunseo/boot-app:latest'
		CONTAINER_NAME = 'boot-app'
	}
	
	stages {
		stage('Checkout') {
			steps {
				echo 'Git Checkout'
				checkout scm
			}
		}
	}
}