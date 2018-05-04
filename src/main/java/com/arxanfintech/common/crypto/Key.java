/*******************************************************************************
Copyright ArxanFintech Technology Ltd. 2018 All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

                 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*******************************************************************************/

package com.arxanfintech.common.crypto;

import java.math.BigInteger;

/**
 * An ECC public or private key
 */
public interface Key {

    /**
     * Safe access to the key's internal representation
     *
     * @return a copy of the key's internal representation
     */
    byte[] toByteArray();

    /**
     * Return a key computable for this key with an offset.
     * Due to a homomorphic property of EC one may compute the offset key of
     * both private and public keys independently such that they build a valid new pair.
     *
     * @param offset offset
     * @return a key derived of this with an offset.
     */
    Key offsetKey(BigInteger offset);
}
