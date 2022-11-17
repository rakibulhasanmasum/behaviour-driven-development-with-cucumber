pipeline {
    agent any

    tools {
        maven "jenkins_maven"
    }

    stages {
        stage('Verify') {
            steps {
                git branch: 'master', credentialsId: 'r_hasan_gitlab_credentials', url: 'https://devops.trucklagbe.com/tl_dev_qa/admin_panel_automation.git'
                sh "mvn clean verify"
            }
            post {
                success {
                    ansiblePlaybook credentialsId: 'e4bfa74b-f8ba-4cdb-afbb-34432bdd8e9c', installation: 'jenkins_ansible', inventory: 'ansible/inventory', playbook: 'ansible/playbook.yml'
                }
            }
        }
    }
}
