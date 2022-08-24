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

Distributed under the Eclipse Public License version 1.0, the same as Clojure.
