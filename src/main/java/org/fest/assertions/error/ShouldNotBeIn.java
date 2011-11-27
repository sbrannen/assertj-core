/*
 * Created on Feb 4, 2011
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2011 the original author or authors.
 */
package org.fest.assertions.error;

import org.fest.util.*;

/**
 * Creates an error message indicating that an assertion that verifies that a value is not in a
 * group of values (e.g. an array or collection) failed.
 *
 * @author Yvonne Wang
 * @author Joel Costigliola
 */
public class ShouldNotBeIn extends BasicErrorMessageFactory {

  /**
   * Creates a new <code>{@link ShouldNotBeIn}</code>.
   * @param actual the actual value in the failed assertion.
   * @param values the group of values where {@code actual} is expected to be in.
   * @param comparisonStrategy the {@link ComparisonStrategy} used to evaluate assertion.
   * @return the created {@code ErrorMessageFactory}.
   */
  public static ErrorMessageFactory shouldNotBeIn(Object actual, Object values, ComparisonStrategy comparisonStrategy) {
    return new ShouldNotBeIn(actual, values, comparisonStrategy);
  }

  /**
   * Creates a new <code>{@link ShouldNotBeIn}</code>.
   * @param actual the actual value in the failed assertion.
   * @param values the group of values where {@code actual} is expected to be in.
   * @return the created {@code ErrorMessageFactory}.
   */
  public static ErrorMessageFactory shouldNotBeIn(Object actual, Object values) {
    return new ShouldNotBeIn(actual, values, StandardComparisonStrategy.instance());
  }
  
  private ShouldNotBeIn(Object actual, Object values, ComparisonStrategy comparisonStrategy) {
    super("expecting:<%s> not to be in:<%s>%s", actual, values, comparisonStrategy);
  }
  
}
