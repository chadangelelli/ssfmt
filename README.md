# Super Simple Formatting

This library provides incredibly basic and common formatting utilities for Clojure/script.

## Coordinate

**deps.edn:**

```clojure
io.github.chadangelelli/ssfmt #:git{:tag "v0.1" :sha "d68211f"}
```

## Usage

```
(reqiure '[ssfmt.fmt :as fmt :refer [echo BOLD GREEN BLUE RED NC]])

(echo :ok (str GREEN "Status: " NC BOLD "OK!" NC))

(echo :error (str RED "Error: " NC BOLD "..." NC))
```
