pipeline{

agent any 
stages{
    stage ('compile Stage'){

		steps {
		    withMaven(maven : 'Maven'){
			     sh 'mvn clean complile'
		    }
		}
	} 
	stage ('testing Stage'){

		steps {
		    withMaven(maven : 'Maven'){
			     sh 'mvn test'
		    }
		}
		}
		stage ('Deployment Stage'){

		steps {
		    withMaven(maven : 'Maven'){
			     sh 'mvn deploy'
		    }
		}
		}
		}
		}
		