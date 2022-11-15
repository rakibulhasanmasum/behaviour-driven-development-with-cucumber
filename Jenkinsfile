pipeline {
    agent any

    tools {
        maven "Maven from Apache"
    }

    stages {
        stage('Verify') {
            steps {
               git branch: 'alpha', credentialsId: 'd6b683f0-bc58-421c-9a51-8772581f609d', url: 'https://devops.trucklagbe.com/tl_dev_qa/admin_panel_automation.git'
                sh "mvn clean verify"
            }
            post {
                success {
                    ansiblePlaybook credentialsId: 'e4bfa74b-f8ba-4cdb-afbb-34432bdd8e9c', installation: 'homebrew_ansible', inventory: 'copy_sample_file_to_server/inventory', playbook: '/Users/r_hasan/Desktop/jenkins-scratchbook/ansible/copy_sample_file_to_server.yml'
                }
            }
        }
    }
}
