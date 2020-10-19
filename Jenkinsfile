node {

    withMaven(maven:'maven') {

        stage('Checkout') {
            git url: 'https://github.com/sairamakrishna137/RealEstate-Springboot.git', credentialsId: 'github', branch: 'main'
        }
        stage('Build') {
            bat 'mvn clean install'

            def pom = readMavenPom file:'pom.xml'
            print pom.version
            env.version = pom.version
        }
      }
     }
       
