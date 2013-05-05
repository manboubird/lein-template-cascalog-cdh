A leiningen template for creating new cascalog projects with cdh.

To install:

```bash
git clone https://github.com/manboubird/lein-template-cascalog-cdh.git 
cd lein-template-cascalog-cdh
lein install
```

To use:

```bash
lein new cascalog-cdh my-cascalog-project
cd my-cascalog-project
lein compile && lein uberjar
hadoop jar ./target/my-cascalog-project-0.1.0-standalone.jar my-cascalog-project.core
```

## License

Copyright (C) 2013

Distributed under the Eclipse Public License, the same as Clojure.

