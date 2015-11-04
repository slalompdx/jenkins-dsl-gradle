Very very basic instructions:

Fork this repository and add your specific definitions.

Groovy job definitions go in jobdefinitions/

./gradlew generateJenkinsJobs <--- builds jobs in build/ directory
vagrant up - bring up Centos 7 Jenkins server with the generated jobs installed
