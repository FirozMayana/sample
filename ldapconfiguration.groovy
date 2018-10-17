artifactory('Glcc') {
  ldap {
  settings('LDAP') {
    url 'ldap://vistcorp.ad.visteon.com:389/DC=vistcorp,DC=ad,DC=visteon,DC=com' // mandatory
    emailAttribute 'mail'
    enabled true // default value - true
    autoCreateUser true // default value - true
    search {
      filter '(sAMAccountName={0})'
      searchSubTree true
      managerDn 'CN=phxicore,CN=Users,DC=vistcorp,DC=ad,DC=visteon,DC=com'
      managerPassword 'p8C82nmt?'
    }
  }
}

}

