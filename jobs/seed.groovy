// If you want, you can define your seed job in the DSL and create it via the REST API.
// See https://github.com/sheehan/job-dsl-gradle-example#rest-api-runner
job("seed") {
  wrappers {
    preBuildCleanup()
  }
  scm {
    git {
      remote {
        url('https://github.com/slalompdx/jenkins-dsl-gradle.git')
      }
    }
  }
  triggers {
      scm 'H/5 * * * *'
  }
  steps {
    gradle 'clean test'
    dsl {
      external 'jobs/**/*.groovy'
      additionalClasspath 'src/main/groovy'
      removeAction('DELETE')
    }
  }
  publishers {
      archiveJunit 'build/test-results/**/*.xml'
  }
}
