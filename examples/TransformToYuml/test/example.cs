module example

// Example "TransformToYuml" program (see src/TransformToYuml -Definitions.spx for the language definition)

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