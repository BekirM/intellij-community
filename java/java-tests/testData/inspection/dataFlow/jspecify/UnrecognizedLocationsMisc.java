/*
 * Copyright 2020 The JSpecify Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.jspecify.annotations.DefaultNonNull;
import org.jspecify.annotations.Nullable;

@DefaultNonNull
class UnrecognizedLocationsMisc {
  interface Super {}

  static class Sub
      // jspecify_nullness_intrinsically_not_nullable
      extends @Nullable Object
      // jspecify_nullness_intrinsically_not_nullable
      implements @Nullable Super {
    // jspecify_nullness_intrinsically_not_nullable
    @Nullable
    Sub() {}
  }
}
