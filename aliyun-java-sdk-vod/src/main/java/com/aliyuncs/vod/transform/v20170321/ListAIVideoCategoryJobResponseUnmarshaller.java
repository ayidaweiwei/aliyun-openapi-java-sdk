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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListAIVideoCategoryJobResponse;
import com.aliyuncs.vod.model.v20170321.ListAIVideoCategoryJobResponse.AIVideoCategoryJob;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAIVideoCategoryJobResponseUnmarshaller {

	public static ListAIVideoCategoryJobResponse unmarshall(ListAIVideoCategoryJobResponse listAIVideoCategoryJobResponse, UnmarshallerContext context) {
		
		listAIVideoCategoryJobResponse.setRequestId(context.stringValue("ListAIVideoCategoryJobResponse.RequestId"));

		List<String> nonExistAIVideoCategoryJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListAIVideoCategoryJobResponse.NonExistAIVideoCategoryJobIds.Length"); i++) {
			nonExistAIVideoCategoryJobIds.add(context.stringValue("ListAIVideoCategoryJobResponse.NonExistAIVideoCategoryJobIds["+ i +"]"));
		}
		listAIVideoCategoryJobResponse.setNonExistAIVideoCategoryJobIds(nonExistAIVideoCategoryJobIds);

		List<AIVideoCategoryJob> aIVideoCategoryJobList = new ArrayList<AIVideoCategoryJob>();
		for (int i = 0; i < context.lengthValue("ListAIVideoCategoryJobResponse.AIVideoCategoryJobList.Length"); i++) {
			AIVideoCategoryJob aIVideoCategoryJob = new AIVideoCategoryJob();
			aIVideoCategoryJob.setJobId(context.stringValue("ListAIVideoCategoryJobResponse.AIVideoCategoryJobList["+ i +"].JobId"));
			aIVideoCategoryJob.setMediaId(context.stringValue("ListAIVideoCategoryJobResponse.AIVideoCategoryJobList["+ i +"].MediaId"));
			aIVideoCategoryJob.setStatus(context.stringValue("ListAIVideoCategoryJobResponse.AIVideoCategoryJobList["+ i +"].Status"));
			aIVideoCategoryJob.setCode(context.stringValue("ListAIVideoCategoryJobResponse.AIVideoCategoryJobList["+ i +"].Code"));
			aIVideoCategoryJob.setMessage(context.stringValue("ListAIVideoCategoryJobResponse.AIVideoCategoryJobList["+ i +"].Message"));
			aIVideoCategoryJob.setCreationTime(context.stringValue("ListAIVideoCategoryJobResponse.AIVideoCategoryJobList["+ i +"].CreationTime"));
			aIVideoCategoryJob.setData(context.stringValue("ListAIVideoCategoryJobResponse.AIVideoCategoryJobList["+ i +"].Data"));

			aIVideoCategoryJobList.add(aIVideoCategoryJob);
		}
		listAIVideoCategoryJobResponse.setAIVideoCategoryJobList(aIVideoCategoryJobList);
	 
	 	return listAIVideoCategoryJobResponse;
	}
}