# reproducers

## importing a platform to testFixturesApi when the dependency tree has a fork

run `./reproduce1.sh`

review the output of each run of dependencyInsight, the first will show 2 variants selected (as expected)

```

> Task :core:dependencyInsight
org.example:base:1.0.0 (by constraint)
  Variant testFixturesApiElements:
    | Attribute Name                 | Provided | Requested    |
    |--------------------------------|----------|--------------|
    | org.gradle.status              | release  |              |
    | org.gradle.category            | library  | library      |
    | org.gradle.dependency.bundling | external | external     |
    | org.gradle.jvm.version         | 23       | 23           |
    | org.gradle.libraryelements     | jar      | classes      |
    | org.gradle.usage               | java-api | java-api     |
    | org.gradle.jvm.environment     |          | standard-jvm |
  Variant apiElements:
    | Attribute Name                 | Provided | Requested    |
    |--------------------------------|----------|--------------|
    | org.gradle.status              | release  |              |
    | org.gradle.category            | library  | library      |
    | org.gradle.dependency.bundling | external | external     |
    | org.gradle.jvm.version         | 23       | 23           |
    | org.gradle.libraryelements     | jar      | classes      |
    | org.gradle.usage               | java-api | java-api     |
    | org.gradle.jvm.environment     |          | standard-jvm |

```

the 2nd run will show just one variant

```
> Configure project :core
TRIGGERING BUG *** importing platform to testFixturesApi

> Task :core:dependencyInsight
org.example:base:1.0.0 (by constraint)
  Variant apiElements:
    | Attribute Name                 | Provided | Requested    |
    |--------------------------------|----------|--------------|
    | org.gradle.status              | release  |              |
    | org.gradle.category            | library  | library      |
    | org.gradle.dependency.bundling | external | external     |
    | org.gradle.jvm.version         | 23       | 23           |
    | org.gradle.libraryelements     | jar      | classes      |
    | org.gradle.usage               | java-api | java-api     |
    | org.gradle.jvm.environment     |          | standard-jvm |

```

## importing a platform to testFixturesApi when the dependency tree has no fork

run `./reproduce2.sh`

review the output of each run of dependencyInsight, 2 variants selected (as expected) in each run

```

> Task :core:dependencyInsight
org.example:base:1.0.0 (by constraint)
  Variant testFixturesApiElements:
    | Attribute Name                 | Provided | Requested    |
    |--------------------------------|----------|--------------|
    | org.gradle.status              | release  |              |
    | org.gradle.category            | library  | library      |
    | org.gradle.dependency.bundling | external | external     |
    | org.gradle.jvm.version         | 23       | 23           |
    | org.gradle.libraryelements     | jar      | classes      |
    | org.gradle.usage               | java-api | java-api     |
    | org.gradle.jvm.environment     |          | standard-jvm |
  Variant apiElements:
    | Attribute Name                 | Provided | Requested    |
    |--------------------------------|----------|--------------|
    | org.gradle.status              | release  |              |
    | org.gradle.category            | library  | library      |
    | org.gradle.dependency.bundling | external | external     |
    | org.gradle.jvm.version         | 23       | 23           |
    | org.gradle.libraryelements     | jar      | classes      |
    | org.gradle.usage               | java-api | java-api     |
    | org.gradle.jvm.environment     |          | standard-jvm |

```

the 2nd run also shows 2 variants

```
> Configure project :core
TRIGGERING BUG *** importing platform to testFixturesApi


> Task :core:dependencyInsight
org.example:base:1.0.0 (by constraint)
  Variant testFixturesApiElements:
    | Attribute Name                 | Provided | Requested    |
    |--------------------------------|----------|--------------|
    | org.gradle.status              | release  |              |
    | org.gradle.category            | library  | library      |
    | org.gradle.dependency.bundling | external | external     |
    | org.gradle.jvm.version         | 23       | 23           |
    | org.gradle.libraryelements     | jar      | classes      |
    | org.gradle.usage               | java-api | java-api     |
    | org.gradle.jvm.environment     |          | standard-jvm |
  Variant apiElements:
    | Attribute Name                 | Provided | Requested    |
    |--------------------------------|----------|--------------|
    | org.gradle.status              | release  |              |
    | org.gradle.category            | library  | library      |
    | org.gradle.dependency.bundling | external | external     |
    | org.gradle.jvm.version         | 23       | 23           |
    | org.gradle.libraryelements     | jar      | classes      |
    | org.gradle.usage               | java-api | java-api     |
    | org.gradle.jvm.environment     |          | standard-jvm |

```
