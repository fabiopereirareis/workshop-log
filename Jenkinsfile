
pipeline {
    agent any
    tools {    
        gradle 'Gradle-8'
    }
    stages {
        stage('Build') { 
            steps {
                sh 'gradle clean build -x test' 
            }
        }
        stage('Salvar artefato') {
            steps {
                archiveArtifacts artifacts: 'build/libs/*.jar', fingerprint: true
            }
        }
    }
}

