/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.boot.nacos.actuate.autoconfigure;

import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.boot.nacos.actuate.endpoint.NacosConfigEndpoint;

/**
 * Nacos Config {@link Endpoint} Auto-{@link Configuration}
 *
 * @author <a href="mailto:fangjian0423@gmail.com">Jim</a>
 * @see Endpoint
 */
@Configuration
public class NacosConfigEndpointAutoConfiguration {
	/**
	 * 这是一个测试项目
	 * @return 我觉得也是
	 */
	@Bean
	@ConditionalOnMissingBean
	@ConditionalOnEnabledEndpoint
	public NacosConfigEndpoint nacosEndpoint() {

		return new NacosConfigEndpoint();
	}

}
