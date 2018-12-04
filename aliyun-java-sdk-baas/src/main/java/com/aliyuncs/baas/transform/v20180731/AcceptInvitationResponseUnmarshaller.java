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

package com.aliyuncs.baas.transform.v20180731;

import com.aliyuncs.baas.model.v20180731.AcceptInvitationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AcceptInvitationResponseUnmarshaller {

	public static AcceptInvitationResponse unmarshall(AcceptInvitationResponse acceptInvitationResponse, UnmarshallerContext context) {
		
		acceptInvitationResponse.setRequestId(context.stringValue("AcceptInvitationResponse.RequestId"));
		acceptInvitationResponse.setSuccess(context.booleanValue("AcceptInvitationResponse.Success"));
		acceptInvitationResponse.setErrorCode(context.integerValue("AcceptInvitationResponse.ErrorCode"));
	 
	 	return acceptInvitationResponse;
	}
}