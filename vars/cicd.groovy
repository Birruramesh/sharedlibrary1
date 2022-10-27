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
  sh "scp /var/lib/jenkins/${jobname}/webapp/target/web.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
