freeStyleJob("Myfirst_job_SSH")
{
  description('My first job_SSH')
      scm {
        git {
            remote {
                name('origin')
                url('https://github.com/rayinianji/Programs.git')
            }
        }
      }
  dsl {
            //external('projectA.groovy', 'projectB.groovy')
            external('first.groovy')
            removeAction('DISABLE')
            ignoreExisting()
            additionalClasspath('lib')
        }
  
}
