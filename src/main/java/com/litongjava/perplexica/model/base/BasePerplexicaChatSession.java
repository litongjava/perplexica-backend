package com.litongjava.perplexica.model.base;

import com.litongjava.db.activerecord.Model;
import com.litongjava.model.db.IBean;

/**
 * Generated by java-db, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePerplexicaChatSession<M extends BasePerplexicaChatSession<M>> extends Model<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}
	
	public M setUserId(java.lang.String userId) {
		set("user_id", userId);
		return (M)this;
	}
	
	public java.lang.String getUserId() {
		return getStr("user_id");
	}
	
	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}
	
	public M setType(java.lang.String type) {
		set("type", type);
		return (M)this;
	}
	
	public java.lang.String getType() {
		return getStr("type");
	}
	
	public M setChatType(java.lang.Integer chatType) {
		set("chat_type", chatType);
		return (M)this;
	}
	
	public java.lang.Integer getChatType() {
		return getInt("chat_type");
	}
	
	public M setOrg(java.lang.String org) {
		set("org", org);
		return (M)this;
	}
	
	public java.lang.String getOrg() {
		return getStr("org");
	}
	
	public M setFocusMode(java.lang.String focusMode) {
		set("focus_mode", focusMode);
		return (M)this;
	}
	
	public java.lang.String getFocusMode() {
		return getStr("focus_mode");
	}
	
	public M setFiles(java.lang.String files) {
		set("files", files);
		return (M)this;
	}
	
	public java.lang.String getFiles() {
		return getStr("files");
	}
	
	public M setMetadata(java.lang.String metadata) {
		set("metadata", metadata);
		return (M)this;
	}
	
	public java.lang.String getMetadata() {
		return getStr("metadata");
	}
	
	public M setCreatedAt(java.util.Date createdAt) {
		set("created_at", createdAt);
		return (M)this;
	}
	
	public java.util.Date getCreatedAt() {
		return getDate("created_at");
	}
	
	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}
	
	public M setCreator(java.lang.String creator) {
		set("creator", creator);
		return (M)this;
	}
	
	public java.lang.String getCreator() {
		return getStr("creator");
	}
	
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return getDate("create_time");
	}
	
	public M setUpdater(java.lang.String updater) {
		set("updater", updater);
		return (M)this;
	}
	
	public java.lang.String getUpdater() {
		return getStr("updater");
	}
	
	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}
	
	public java.util.Date getUpdateTime() {
		return getDate("update_time");
	}
	
	public M setDeleted(java.lang.Integer deleted) {
		set("deleted", deleted);
		return (M)this;
	}
	
	public java.lang.Integer getDeleted() {
		return getInt("deleted");
	}
	
	public M setTenantId(java.lang.Long tenantId) {
		set("tenant_id", tenantId);
		return (M)this;
	}
	
	public java.lang.Long getTenantId() {
		return getLong("tenant_id");
	}
	
}

