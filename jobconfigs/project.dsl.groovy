job('seed') {
  description('Seed job')
  customWorkspace('/vagrant')
  steps {
    gradle('clean generateJenkinsJobs')
  }
}
