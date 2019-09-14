freeStyleJob("Myfirst_job_SSH_folder")
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
  steps {
  dsl {
            //external('projectA.groovy', 'projectB.groovy')
            external('first.groovy')
            removeAction('DISABLE')
            ignoreExisting()
            //additionalClasspath('lib')
        }
  }
}
