/*
 * Copyright 2020 Hazelcast Inc.
 *
 * Licensed under the Hazelcast Community License (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://hazelcast.com/hazelcast-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.hazelcast.client.osgi;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.osgi.HazelcastOSGiService;

/**
 * Contract point for {@link HazelcastInstance} implementations based on OSGi service.
 */
public interface HazelcastOSGiClientInstance
        extends HazelcastInstance {

    /**
     * Gets the delegated (underlying) {@link HazelcastInstance}.
     *
     * @return the delegated (underlying) {@link HazelcastInstance
     */
    HazelcastInstance getDelegatedInstance();

    /**
     * Gets the owner {@link HazelcastOSGiService} of this instance.
     *
     * @return the owner {@link HazelcastOSGiService} of this instance
     */
    HazelcastClientOSGiService getOwnerService();

}
