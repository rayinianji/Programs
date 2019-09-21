freeStyleJob("Foldercreation")
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
            external('foldercreation.groovy')
            removeAction('DISABLE')
            ignoreExisting()
            //additionalClasspath('lib')
        }
  }
}
