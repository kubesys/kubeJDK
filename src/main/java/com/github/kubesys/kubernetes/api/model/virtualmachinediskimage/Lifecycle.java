/**
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys.kubernetes.api.model.virtualmachinediskimage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.kubesys.interior.annotations.Function;
import com.github.kubesys.interior.annotations.Parent;
import com.github.kubesys.kubernetes.ExtendedKubernetesConstants;

/**
 * @author  wuheng@otcaix.iscas.ac.cn
 * 
 * @version 1.0.0
 * @since   2019/9/4
 * 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@Parent(value = "VirtualMachineDiskImage")
public class Lifecycle {

	@Function(shortName = "将云盘镜像转化为云盘", description = "将云盘镜像转化为云盘，" 
			+ ExtendedKubernetesConstants.DESC_FUNCTION_DESC, 
		prerequisite = ExtendedKubernetesConstants.DESC_FUNCTION_VMDI, 
		exception = ExtendedKubernetesConstants.DESC_FUNCTION_EXEC)
	protected ConvertDiskImageToDisk convertDiskImageToDisk;

	@Function(shortName = "删除云盘镜像", description = "删除云盘镜像，" 
			+ ExtendedKubernetesConstants.DESC_FUNCTION_DESC, 
		prerequisite = ExtendedKubernetesConstants.DESC_FUNCTION_VMDI, 
		exception = ExtendedKubernetesConstants.DESC_FUNCTION_EXEC)
	protected DeleteDiskImage deleteDiskImage;
	
	@Function(shortName = "创建云盘镜像", description = "创建云盘镜像，" 
			+ ExtendedKubernetesConstants.DESC_FUNCTION_DESC, 
		prerequisite = "", 
		exception = ExtendedKubernetesConstants.DESC_FUNCTION_EXEC)
	protected CreateDiskImage createDiskImage;
	
	public ConvertDiskImageToDisk getConvertDiskImageToDisk() {
		return convertDiskImageToDisk;
	}
	
	public void setConvertDiskImageToDisk(ConvertDiskImageToDisk convertDiskImageToDisk) {
		this.convertDiskImageToDisk = convertDiskImageToDisk;
	}
	
	public DeleteDiskImage getDeleteDiskImage() {
		return deleteDiskImage;
	}
	
	public void setDeleteDiskImage(DeleteDiskImage deleteDiskImage) {
		this.deleteDiskImage = deleteDiskImage;
	}
	
	public CreateDiskImage getCreateDiskImage() {
		return createDiskImage;
	}
	
	public void setCreateDiskImage(CreateDiskImage createDiskImage) {
		this.createDiskImage = createDiskImage;
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
	public static class ConvertDiskImageToDisk {
		
		protected String pool;

		public String getPool() {
			return pool;
		}

		public void setPool(String pool) {
			this.pool = pool;
		}
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
	public static class DeleteDiskImage {
		
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
	public static class CreateDiskImage {
		
		protected String source;

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}
	}
	
}
