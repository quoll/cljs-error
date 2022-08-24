(ns error.core)


(defn name-of
  "Identifies the name of an error object, the configured name of a type, or just the object type name"
  [o]
  (or (.-name o)
      (let [t (type o)
            type-name (.-name t)]
        (if (seq type-name)
          type-name
          (pr-str t)))))

(defn Error->map
  "Convert a thrown object into a map representation"
  [e]
  (merge {:type (symbol (name-of e))
          :message (or (.-message e) (str e))}
         (when-let [data (ex-data e)]
           {:data data})
         (when-let [cause (.-cause e)]
           {:cause (Error->map cause)})
         (when-let [file (.-fileName e)]
           {:filename file})
         (when-let [line (.-lineNumber e)]
           {:line-number line})
         (when-let [column (.-columnNumber e)]
           {:column-number column})
         (when-let [stack (.-stack e)]
           (when (seq stack) {:stack stack}))))

(def Throwable->map Error->map)
