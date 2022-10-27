def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy(jobname,ip,context)
{
  sh "scp /home/jenkins/${jobname}/webapp/target/web.war ubuntu@${ip}:home/tomcat9/webapps/${context}.war"
}
