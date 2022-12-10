def call(String repoUrl){
    pipeline{
        agent any
        stages {
            stage("Tools initialization") {
                steps {
                    sh 'lscpu'
                    sh 'java -version'
                }
            }
            stage("checkout code") {
                steps {
                    git branch: 'main',
                           url: "${repoUrl}"
                }
            }
            stage('to-test-maven'){
                steps {
                    sh 'df -h'
                }
            }
        }
    }
}
