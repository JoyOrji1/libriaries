def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}
def newDeploy(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: 'cd595cf8-6c78-42e2-8384-ef161cccf279', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
}
def newTest(path)
{
  sh 'java -jar "${path}"testing.jar'
}
