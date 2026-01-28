pipeline {
	agent any
	
	environment {
		DOCKER_IMAGE = 'hongeunseo/boot-app'
	}
	
	stages {
		stage('Git → JenKins 연결 확인') {
			steps {
				echo 'GitHub push 감지 성공'
			}
		}
	}
}