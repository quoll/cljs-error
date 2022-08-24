# error

Function for converting ClojureScript (and JavaScript) errors

## Usage

```clojure
(require '[error.core :refer [Throwable->map]])

;; convert a JavaScript error to a map
(Throwable->map (js/Error "An error occurred"))

;; convert a ClojureScript ExceptionInfo to a map
(Throwable->map (ex-info "help!" {:context "I can't get up!"}))

;; Simple objects can also be converted
(Throwable->map "No plan.")
```


## License

Copyright © 2022 Paula Gearon

_EPLv1.0 is just the default for projects generated by `deps-new`: you are not_
_required to open source this project, nor are you required to use EPLv1.0!_
_Feel free to remove or change the `LICENSE` file and remove or update this_
_section of the `README.md` file!_

Distributed under the Eclipse Public License version 1.0.