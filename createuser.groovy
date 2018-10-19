art = userInput (
  type : "ARTIFACTORY",
  name : "Instance",
  description : "Please select the artifactory instance to run against"
)
userName = userInput (
  type : "STRING",
  name : "User Name",
  description : "Please provide a username"
)
groupNames = userInput (
  type : "STRING",
  name : "Group Names",
  description : "Please provide a group/s name (comma separated, if multiple groups need to be created)"
)