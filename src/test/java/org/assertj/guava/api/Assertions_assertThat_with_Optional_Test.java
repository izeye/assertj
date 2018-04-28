/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2018 the original author or authors.
 */
package org.assertj.guava.api;

import static org.assertj.guava.api.Assertions.assertThat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.assertj.guava.api.Assertions;
import org.assertj.guava.api.OptionalAssert;
import org.junit.Test;

import com.google.common.base.Optional;

/**
 * Tests for <code>{@link Assertions#assertThat(Optional)}</code>.
 * 
 * @author Joel Costigliola
 */
public class Assertions_assertThat_with_Optional_Test {

  @Test
  public void should_create_Assert() {
    Optional<String> actual = Optional.of("value");
    assertNotNull(assertThat(actual));
    assertEquals(OptionalAssert.class, assertThat(actual).getClass());
  }

  @Test
  public void should_pass_actual() {
    Optional<String> actual = Optional.of("value");
    assertSame(actual, assertThat(actual).getActual());
  }
}
