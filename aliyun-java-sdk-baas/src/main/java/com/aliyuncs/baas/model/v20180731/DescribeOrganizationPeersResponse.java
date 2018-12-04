/*
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

package com.aliyuncs.baas.model.v20180731;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20180731.DescribeOrganizationPeersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOrganizationPeersResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String name;

		private Boolean isAnchor;

		private String intranetIp;

		private String internetIp;

		private String domain;

		private Integer port;

		private String instanceType;

		private String createTime;

		private String updateTime;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getIsAnchor() {
			return this.isAnchor;
		}

		public void setIsAnchor(Boolean isAnchor) {
			this.isAnchor = isAnchor;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public DescribeOrganizationPeersResponse getInstance(UnmarshallerContext context) {
		return	DescribeOrganizationPeersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
