`exoscale/clj-yaml` provides [YAML](http://yaml.org) encoding and
decoding for Clojure via the [snakeyaml](https://bitbucket.org/asomov/snakeyaml/) Java library.

[![Build Status](https://secure.travis-ci.org/exoscale/clj-yaml.png)](http://travis-ci.org/exoscale/clj-yaml)
[![Clojars Project](https://img.shields.io/clojars/v/exoscale/clj-yaml.svg)](https://clojars.org/exoscale/clj-yaml)

(This is a maintained fork of [the original](https://github.com/lancepantz/clj-yaml)).

## Usage

    (require '[clj-yaml.core :as yaml])
    
    (yaml/generate-string
      [{:name "John Smith", :age 33}
       {:name "Mary Smith", :age 27}])
    "- {name: John Smith, age: 33}\n- {name: Mary Smith, age: 27}\n"

    (yaml/parse-string "
    - {name: John Smith, age: 33}
    - name: Mary Smith
      age: 27
    ")
    => ({:name "John Smith", :age 33}
        {:name "Mary Smith", :age 27})

By default, keys are converted to clojure keywords.  To prevent this, 
add `:keywords false` parameters to the `parse-string` function:

    (yaml/parse-string "
    - {name: John Smith}
    " :keywords false)

## Installation

`exoscale/clj-yaml` is available as a Maven artifact from [Clojars](http://clojars.org/exoscale/clj-yaml):

```clojure
    [[exoscale/clj-yaml "0.5.7"]]

## Development

    $ git clone git://github.com/exoscale/clj-yaml.git
    $ lein deps
    $ lein test
    $ lein install
