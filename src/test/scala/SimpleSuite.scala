package org.example
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SimpleSuite extends AnyFlatSpec with Matchers {
  "A simple test" should "pass" in {
    println("Hello world!")


    // in spark-rapids this prints "", we're trying to reproduce this behavior
    println(RelationalGroupedDataset.GroupByType.getClass.getSimpleName)
  }
}