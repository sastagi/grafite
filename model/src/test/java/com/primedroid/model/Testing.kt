package com.primedroid.model

import org.junit.Assert
import org.junit.Test

class ExampleUnitTest {
  @Test
  fun addition_isCorrect() {
    Assert.assertTrue(ModelUtil().isEmail(Person(email = "s@t.com")))
  }
}