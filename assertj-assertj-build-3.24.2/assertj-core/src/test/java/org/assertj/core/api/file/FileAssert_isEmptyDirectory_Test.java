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
package org.assertj.core.api.file;

import static org.mockito.Mockito.verify;

import org.assertj.core.api.FileAssert;
import org.assertj.core.api.FileAssertBaseTest;

/**
 * Tests for <code>{@link FileAssert#isEmptyDirectory()}</code>
 *
 * @author Valeriy Vyrva
 */
class FileAssert_isEmptyDirectory_Test extends FileAssertBaseTest {

  @Override
  protected FileAssert invoke_api_method() {
    return assertions.isEmptyDirectory();
  }

  @Override
  protected void verify_internal_effects() {
    verify(files).assertIsEmptyDirectory(getInfo(assertions), getActual(assertions));
  }
}