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
package org.assertj.core.internal.strings;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.error.ShouldBeBlank.shouldBeBlank;
import static org.assertj.core.test.TestData.someInfo;
import static org.mockito.Mockito.verify;

import java.util.stream.Stream;

import org.assertj.core.api.AssertionInfo;
import org.assertj.core.internal.StringsBaseTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class Strings_assertJavaBlank_Test extends StringsBaseTest {

  public static Stream<String> blank() {
    return Stream.of(" ",
                     "\u005Ct", // tab
                     "\u005Cn", // line feed
                     "\u005Cr", // carriage return
                     " \u005Cn\u005Cr  ");
  }

  @ParameterizedTest
  @MethodSource("blank")
  void should_pass_string_is_blank(String actual) {
    strings.assertJavaBlank(someInfo(), actual);
  }

  public static Stream<String> notBlank() {
    return Stream.of(null,
                     "",
                     "a",
                     " bc ",
                     "\u00A0", // non-breaking space
                     "\u2007", // non-breaking space
                     "\u202F"); // non-breaking space
  }

  @ParameterizedTest
  @MethodSource("notBlank")
  void should_fail_if_string_is_not_blank(String actual) {
    Throwable error = catchThrowable(() -> strings.assertJavaBlank(someInfo(), actual));

    assertThat(error).isInstanceOf(AssertionError.class);
    verifyFailureThrownWhenStringIsNotBank(someInfo(), actual);
  }

  private void verifyFailureThrownWhenStringIsNotBank(AssertionInfo info, String actual) {
    verify(failures).failure(info, shouldBeBlank(actual));
  }
}