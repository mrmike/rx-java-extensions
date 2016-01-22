/*
 * Copyright (C) 2007 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.appunite.rx.internal;

import java.util.Arrays;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/**
 * Helper functions that can operate on any {@code Object}.
 * <p/>
 * <p>See the Guava User Guide on <a
 * href="http://code.google.com/p/guava-libraries/wiki/CommonObjectUtilitiesExplained">writing
 * {@code Object} methods with {@code Objects}</a>.
 *
 * @author Laurence Gonsalves
 * @since 2.0 (imported from Google Collections Library)
 */
public final class Objects {
    private Objects() {
    }

    /**
     * Determines whether two possibly-null objects are equal. Returns:
     * <p/>
     * <ul>
     * <li>{@code true} if {@code a} and {@code b} are both null.
     * <li>{@code true} if {@code a} and {@code b} are both non-null and they are
     * equal according to {@link Object#equals(Object)}.
     * <li>{@code false} in all other situations.
     * </ul>
     * <p/>
     * <p>This assumes that any non-null objects passed to this function conform
     * to the {@code equals()} contract.
     * <p/>
     * <p><b>Note for Java 7 and later:</b> This method should be treated as
     * deprecated; use {@link java.util.Objects#equals} instead.
     */
    @CheckReturnValue
    public static boolean equal(@Nullable Object a, @Nullable Object b) {
        return a == b || (a != null && a.equals(b));
    }

    /**
     * Generates a hash code for multiple values. The hash code is generated by
     * calling {@link Arrays#hashCode(Object[])}. Note that array arguments to
     * this method, with the exception of a single Object array, do not get any
     * special handling; their hash codes are based on identity and not contents.
     * <p/>
     * <p>This is useful for implementing {@link Object#hashCode()}. For example,
     * in an object that has three properties, {@code x}, {@code y}, and
     * {@code z}, one could write:
     * <pre>   {@code
     *   public int hashCode() {
     *     return Objects.hashCode(getX(), getY(), getZ());
     *   }}</pre>
     * <p/>
     * <p><b>Warning:</b> When a single object is supplied, the returned hash code
     * does not equal the hash code of that object.
     * <p/>
     * <p><b>Note for Java 7 and later:</b> This method should be treated as
     * deprecated; use {@link java.util.Objects#hash} instead.
     */
    public static int hashCode(@Nullable Object... objects) {
        return Arrays.hashCode(objects);
    }
}
