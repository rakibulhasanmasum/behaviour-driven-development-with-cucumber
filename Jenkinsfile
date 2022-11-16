pipeline {
    agent any

    tools {
        maven "jenkins_maven"
    }

    stages {
        stage('Verify') {
            steps {
                git branch: 'alpha', credentialsId: '736fbb17-40df-4c61-b498-eac836ccbc70', url: 'https://devops.trucklagbe.com/tl_dev_qa/admin_panel_automation.git'
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
