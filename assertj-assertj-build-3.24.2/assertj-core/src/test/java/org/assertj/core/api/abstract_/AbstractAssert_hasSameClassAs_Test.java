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
package org.assertj.core.api.abstract_;

import static org.mockito.Mockito.verify;

import org.assertj.core.api.AbstractAssertBaseTest;
import org.assertj.core.api.ConcreteAssert;
import org.assertj.core.api.ObjectAssert;


/**
 * Tests for <code>{@link ObjectAssert#hasSameClassAs(Object)}</code>.
 * 
 * @author Nicolas François
 */
class AbstractAssert_hasSameClassAs_Test extends AbstractAssertBaseTest {

  @Override
  protected ConcreteAssert invoke_api_method() {
    return assertions.hasSameClassAs("Luke");
  }

  @Override
  protected void verify_internal_effects() {
    verify(objects).assertHasSameClassAs(getInfo(assertions), getActual(assertions), "Luke");
  }
}
