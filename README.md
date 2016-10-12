# my-calculator

Minimal repo to reproduce an issue with JS module inlcusion where the module can't be used with the name that it is required with.

## Setup

Build your project with the following script:

    ./scripts/build

You should see the following errors:

````
Building ...
WARNING: No such namespace: my.calc, could not locate my/calc.cljs, my/calc.cljc, or Closure namespace "" at line 6 src/my_calculator/core.cljs
WARNING: Use of undeclared Var my.calc/add at line 6 src/my_calculator/core.cljs
WARNING: No such namespace: my.calc, could not locate my/calc.cljs, my/calc.cljc, or Closure namespace "" at line 7 src/my_calculator/core.cljs
WARNING: Use of undeclared Var my.calc/subtract at line 7 src/my_calculator/core.cljs
... done. Elapsed 4.052406091 seconds
````

## License

Copyright © 2016 Maria Geller

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
