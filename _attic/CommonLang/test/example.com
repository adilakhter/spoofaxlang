module example

// Example "CommonLang" program (see src/CommonLang -Definitions.spx for the language definition)

entity User {
  name     : String
  password : String
  homepage : URL
}

entity BlogPosting {
  poster : User
  body   : String
}

entity URL {
  location : String
}