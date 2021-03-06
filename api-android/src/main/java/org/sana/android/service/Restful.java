/**
 * Copyright (c) 2013, Sana
 * All rights reserved.
 * <p>
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * <p>
 * * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * * Neither the name of the Sana nor the
 * names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 * <p>
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL Sana BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.sana.android.service;

import android.os.ParcelUuid;
import android.os.Parcelable;

/**
 * REST like service which provides basic CRUD methods for accessing objects
 * which are considered unique and identified by UUID
 *
 * @author Sana Development
 *
 */
public interface Restful<T extends Parcelable> {

    /**
     * Creates an object.
     *
     * @param t
     * @return The uuid if successful
     * @throws IllegalArgumentException if t is not valid for creation.
     */
    ParcelUuid create(T t);

    /**
     * Fetches a unique object by uuid.
     *
     * @param uuid The uuid of the object to fetch.
     * @return The Parcelable representation of the object.
     */
    T read(ParcelUuid uuid);

    /**
     * Updates the an object whose uuid matches that of the parameter t.
     *
     * @param t The object and values to update.
     * @return true if successful
     * @throws IllegalArgumentException if t is not valid for updating.
     */
    boolean update(T t);

    /**
     * Deletes an object by uuid
     * @param uuid The uuid String of the object to delete.
     *
     * @return true if successful
     */
    boolean delete(ParcelUuid uuid);
}
