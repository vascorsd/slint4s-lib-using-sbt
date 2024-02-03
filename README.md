Experiments in generating slint bindings for scala.

First experiment is trying to bind the npm slint-ui 
library with scala.js.

The library is published with typescript types.

Tried to use ScalablyTyped thing in scala to generate
scala code for it that reads those typescript definitions.

Conclusion: Uterly failure, I cannot make this work.

There's too many moving parts that I don't know or understand.

----

My first attempt was trying to use scala-cli and the binary
from scalablytyped that reads the npm library and generates code.

But there's basically no docs that are readable about this weird
combination. The little things that exist are very bound to sbt.

That attempt is called - slint4s-lib-using-scalacli
