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
 * Copyright 2012-2023 the original author or authors.
 */
package org.assertj.core.api.float_;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.test.AlwaysEqualComparator.alwaysEqual;

import java.util.Comparator;

import org.assertj.core.api.FloatAssert;
import org.assertj.core.api.FloatAssertBaseTest;

/**
 * Tests for <code>{@link FloatAssert#usingComparator(java.util.Comparator)}</code>.
 *
 * @author Joel Costigliola
 */
class FloatAssert_usingComparator_Test extends FloatAssertBaseTest {

  private Comparator<Float> comparator = alwaysEqual();

  @Override
  protected FloatAssert invoke_api_method() {
    // in that, we don't care of the comparator, the point to check is that we switch correctly of comparator
    return assertions.usingComparator(comparator);
  }

  @Override
  protected void verify_internal_effects() {
    assertThat(getObjects(assertions).getComparator()).isSameAs(comparator);
    assertThat(getFloats(assertions).getComparator()).isSameAs(comparator);
  }
}