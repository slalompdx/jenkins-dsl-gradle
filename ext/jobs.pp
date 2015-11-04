jenkins::job { 'seed':
  config => template('/vagrant/build/jobDsl/generated/seed.xml')
}
$jenkins_config = {
  'JENKINS_JAVA_OPTIONS' => { 'value' => '-Djava.awt.headless=true -XX:MaxPermSize=512m' },
}

class { '::jenkins':
  repo               => false,
  executors          => 8,
  config_hash        => $jenkins_config,
  configure_firewall => true,
}
