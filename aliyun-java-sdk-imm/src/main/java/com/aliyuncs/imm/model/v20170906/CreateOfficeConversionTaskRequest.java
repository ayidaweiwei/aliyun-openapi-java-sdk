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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateOfficeConversionTaskRequest extends RpcAcsRequest<CreateOfficeConversionTaskResponse> {
	
	public CreateOfficeConversionTaskRequest() {
		super("imm", "2017-09-06", "CreateOfficeConversionTask", "imm");
	}

	private String srcType;

	private String notifyTopicName;

	private String modelId;

	private String project;

	private Long maxSheetRow;

	private Long maxSheetCount;

	private Long endPage;

	private String idempotentToken;

	private String tgtFileSuffix;

	private Boolean sheetOnePage;

	private String password;

	private Long startPage;

	private Long maxSheetCol;

	private String tgtType;

	private String notifyEndpoint;

	private Boolean fitToPagesWide;

	private String tgtFilePrefix;

	private Boolean fitToPagesTall;

	private String srcUri;

	private String tgtFilePages;

	private String tgtUri;

	public String getSrcType() {
		return this.srcType;
	}

	public void setSrcType(String srcType) {
		this.srcType = srcType;
		if(srcType != null){
			putQueryParameter("SrcType", srcType);
		}
	}

	public String getNotifyTopicName() {
		return this.notifyTopicName;
	}

	public void setNotifyTopicName(String notifyTopicName) {
		this.notifyTopicName = notifyTopicName;
		if(notifyTopicName != null){
			putQueryParameter("NotifyTopicName", notifyTopicName);
		}
	}

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putQueryParameter("ModelId", modelId);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public Long getMaxSheetRow() {
		return this.maxSheetRow;
	}

	public void setMaxSheetRow(Long maxSheetRow) {
		this.maxSheetRow = maxSheetRow;
		if(maxSheetRow != null){
			putQueryParameter("MaxSheetRow", maxSheetRow.toString());
		}
	}

	public Long getMaxSheetCount() {
		return this.maxSheetCount;
	}

	public void setMaxSheetCount(Long maxSheetCount) {
		this.maxSheetCount = maxSheetCount;
		if(maxSheetCount != null){
			putQueryParameter("MaxSheetCount", maxSheetCount.toString());
		}
	}

	public Long getEndPage() {
		return this.endPage;
	}

	public void setEndPage(Long endPage) {
		this.endPage = endPage;
		if(endPage != null){
			putQueryParameter("EndPage", endPage.toString());
		}
	}

	public String getIdempotentToken() {
		return this.idempotentToken;
	}

	public void setIdempotentToken(String idempotentToken) {
		this.idempotentToken = idempotentToken;
		if(idempotentToken != null){
			putQueryParameter("IdempotentToken", idempotentToken);
		}
	}

	public String getTgtFileSuffix() {
		return this.tgtFileSuffix;
	}

	public void setTgtFileSuffix(String tgtFileSuffix) {
		this.tgtFileSuffix = tgtFileSuffix;
		if(tgtFileSuffix != null){
			putQueryParameter("TgtFileSuffix", tgtFileSuffix);
		}
	}

	public Boolean getSheetOnePage() {
		return this.sheetOnePage;
	}

	public void setSheetOnePage(Boolean sheetOnePage) {
		this.sheetOnePage = sheetOnePage;
		if(sheetOnePage != null){
			putQueryParameter("SheetOnePage", sheetOnePage.toString());
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public Long getStartPage() {
		return this.startPage;
	}

	public void setStartPage(Long startPage) {
		this.startPage = startPage;
		if(startPage != null){
			putQueryParameter("StartPage", startPage.toString());
		}
	}

	public Long getMaxSheetCol() {
		return this.maxSheetCol;
	}

	public void setMaxSheetCol(Long maxSheetCol) {
		this.maxSheetCol = maxSheetCol;
		if(maxSheetCol != null){
			putQueryParameter("MaxSheetCol", maxSheetCol.toString());
		}
	}

	public String getTgtType() {
		return this.tgtType;
	}

	public void setTgtType(String tgtType) {
		this.tgtType = tgtType;
		if(tgtType != null){
			putQueryParameter("TgtType", tgtType);
		}
	}

	public String getNotifyEndpoint() {
		return this.notifyEndpoint;
	}

	public void setNotifyEndpoint(String notifyEndpoint) {
		this.notifyEndpoint = notifyEndpoint;
		if(notifyEndpoint != null){
			putQueryParameter("NotifyEndpoint", notifyEndpoint);
		}
	}

	public Boolean getFitToPagesWide() {
		return this.fitToPagesWide;
	}

	public void setFitToPagesWide(Boolean fitToPagesWide) {
		this.fitToPagesWide = fitToPagesWide;
		if(fitToPagesWide != null){
			putQueryParameter("FitToPagesWide", fitToPagesWide.toString());
		}
	}

	public String getTgtFilePrefix() {
		return this.tgtFilePrefix;
	}

	public void setTgtFilePrefix(String tgtFilePrefix) {
		this.tgtFilePrefix = tgtFilePrefix;
		if(tgtFilePrefix != null){
			putQueryParameter("TgtFilePrefix", tgtFilePrefix);
		}
	}

	public Boolean getFitToPagesTall() {
		return this.fitToPagesTall;
	}

	public void setFitToPagesTall(Boolean fitToPagesTall) {
		this.fitToPagesTall = fitToPagesTall;
		if(fitToPagesTall != null){
			putQueryParameter("FitToPagesTall", fitToPagesTall.toString());
		}
	}

	public String getSrcUri() {
		return this.srcUri;
	}

	public void setSrcUri(String srcUri) {
		this.srcUri = srcUri;
		if(srcUri != null){
			putQueryParameter("SrcUri", srcUri);
		}
	}

	public String getTgtFilePages() {
		return this.tgtFilePages;
	}

	public void setTgtFilePages(String tgtFilePages) {
		this.tgtFilePages = tgtFilePages;
		if(tgtFilePages != null){
			putQueryParameter("TgtFilePages", tgtFilePages);
		}
	}

	public String getTgtUri() {
		return this.tgtUri;
	}

	public void setTgtUri(String tgtUri) {
		this.tgtUri = tgtUri;
		if(tgtUri != null){
			putQueryParameter("TgtUri", tgtUri);
		}
	}

	@Override
	public Class<CreateOfficeConversionTaskResponse> getResponseClass() {
		return CreateOfficeConversionTaskResponse.class;
	}

}
