# About this repository 
This repository contains [source code](https://bitbucket.org/adilakhter/spoofaxlang/src/41e76c9cf0bbe74297f842955511f156d166fde3/source/?at=master) of SpoofaxLang implementation using Spoofax language workbench. It also includes few [DSL implementations](https://bitbucket.org/adilakhter/spoofaxlang/src/41e76c9cf0bbe74297f842955511f156d166fde3/workspaces/experimental_langs/?at=master) to demonstrate language features of SpoofaxLang.

# What is SpoofaxLang?

SpoofaxLang is a meta-language that facilitates a uniform programming model for modular specification and integration of DSLs. It allows different aspects and cross-cutting concerns of a language definition to be specified using a single formalism. As a result, it offers static checking and cross-aspect verification, which in turn, assists in ensuring correctness of language implementations. 
In addition, by adhering to Steel’s “growing language” ideology, SpoofaxLang adopts a library-based approach in organizing language definition. By providing language libraries, it allows reuse, extension and composition of existing language implementation. By employing modularity and composibility characteristics, Spoofaxlang supports wide range of language composition strategies, which we have shown the case studies outlined next. 


# Case Studies 


- [EntLang](https://bitbucket.org/adilakhter/spoofaxlang/src/41e76c9cf0bbe74297f842955511f156d166fde3/workspaces/experimental_langs/ModularEntityLang/?at=master "EntityLang with Module "): A langauge to define domain entities. Support for module and function abstractions has also been added. 
- [EntTuple](https://bitbucket.org/adilakhter/spoofaxlang/src/41e76c9cf0bbe74297f842955511f156d166fde3/workspaces/experimental_langs/EntityTupleLang/?at=master): EntLang is extended with Tuple type and expression.  
- [EntXML](https://bitbucket.org/adilakhter/spoofaxlang/src/41e76c9cf0bbe74297f842955511f156d166fde3/workspaces/experimental_langs/EntityLangExtension/?at=master): EntLang with XML syntax embedding. It also supports embedding of expression in XML syntax demonstrating integration of Host language constructs into embedding language.   
- [EntEmbedded](https://bitbucket.org/adilakhter/spoofaxlang/src/41e76c9cf0bbe74297f842955511f156d166fde3/workspaces/experimental_langs/EntityLangEmbedded/?at=master): It demostrate polymorphic embedding of EntityLang with a Query Language (QL). Two variants of QL, namely MiniLinq  and TinySql have been constructed independently in separate SpoofaxLang projects. Depending on project's configuration and subsequent dependency injection, SpoofaxLang selects and activates appropriate QL and embeds it into EntLang. 
- [TinySql](https://bitbucket.org/adilakhter/spoofaxlang/src/41e76c9cf0bbe74297f842955511f156d166fde3/workspaces/experimental_langs/MiniLINQ/?at=master)
- [MiniLinq](https://bitbucket.org/adilakhter/spoofaxlang/src/41e76c9cf0bbe74297f842955511f156d166fde3/workspaces/experimental_langs/MiniLINQ/?at=master)

- [DBLang](https://bitbucket.org/adilakhter/spoofaxlang/src/41e76c9cf0bbe74297f842955511f156d166fde3/examples/SpxLangExamples/src/?at=master) : It shows bi-directional transformation from EntLang to Database schema and vice versa.   
