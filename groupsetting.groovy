artifactory('Site') {
  ldap {
  groupSettings('static_group_settings_name') {
    settings // 'ldap settings ref'
    staticMapping {
      groupMemberAttribute 'uniqueMember' // mandatory
      groupNameAttribute 'cn' // mandatory
      descriptionAttribute 'description' // mandatory
      filter '(objectClass=groupOfNames)' // mandatory
      searchBase ''
      searchSubTree true
    }
  }
  groupSettings('dynamic_group_settings_name') {
    settings // 'ldap settings ref'
    dynamicMapping {
      groupMemberAttribute 'uniqueMember' // mandatory
      groupNameAttribute 'cn' // mandatory
      descriptionAttribute 'description' // mandatory
      filter '(objectClass=groupOfNames)' // mandatory
      searchBase ''
      searchSubTree true
    }
  }
  groupSettings('hierarchy_group_settings_name') {
    settings // 'ldap settings ref'
    hierarchyMapping {
      userDnGroupKey 'uniqueMember' // mandatory
      groupNameAttribute 'cn' // mandatory
      descriptionAttribute 'description' // mandatory
      filter '(objectClass=groupOfNames)' // mandatory
    }
  }
}
  
}
