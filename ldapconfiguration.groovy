artifactory('Site') {
  ldap {
  settings('LDAP') {
    url 'ldap://DC=,DC=,DC=,DC=' // mandatory
    emailAttribute 'mail'
    enabled true // default value - true
    autoCreateUser true // default value - true
    search {
      filter '(sAMAccountName={0})'
      searchSubTree true
      managerDn 'CN=,CN=,DC=,DC=,DC=,DC=com'
      managerPassword ''
    }
  }
}

}

