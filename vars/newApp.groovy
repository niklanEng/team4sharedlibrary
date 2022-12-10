def uber(String repoUrl){
    pipeline{
        agent any
        stages{
            stage('1-build'){
                steps{
                    sh 'free -g'
                }
            }
            stage('checkout code'){
                steps{
                    git branch: 'main',
                           url: "${repoUrl}"
                }
            }
            stage('closing'){
                steps{
                    echo "new project"
                }
            }
        }
    }
}