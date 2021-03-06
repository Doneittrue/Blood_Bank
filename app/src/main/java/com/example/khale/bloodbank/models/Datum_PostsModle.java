
package com.example.khale.bloodbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum_PostsModle {


    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("is_favourite")
    @Expose
    private Boolean is_favourite;
    @SerializedName("created_at")
    @Expose
    private Object createdAt;
    @SerializedName("updated_at")
    @Expose
    private Object updatedAt;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("publish_date")
    @Expose
    private String publishDate;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("thumbnail_full_path")
    @Expose
    private String thumbnailFullPath;
    @SerializedName("category")
    @Expose
    private Category_PostsModle category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Object createdAt) {
        this.createdAt = createdAt;
    }

    public Object getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getThumbnailFullPath() {
        return thumbnailFullPath;
    }

    public void setThumbnailFullPath(String thumbnailFullPath) {
        this.thumbnailFullPath = thumbnailFullPath;
    }
    public Boolean is_favourite() {
        return is_favourite;
    }

    public void is_favourite(Boolean is_favourite) {
        this.is_favourite = is_favourite;
    }

    public Datum_PostsModle(int id, Boolean is_favourite, Object createdAt, Object updatedAt, String title, String content, String thumbnail, String publishDate, String categoryId, String thumbnailFullPath, Category_PostsModle category) {
        this.id = id;
        this.is_favourite = is_favourite;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.title = title;
        this.content = content;
        this.thumbnail = thumbnail;
        this.publishDate = publishDate;
        this.categoryId = categoryId;
        this.thumbnailFullPath = thumbnailFullPath;
        this.category = category;
    }

    public Category_PostsModle getCategory() {
        return category;
    }

    public void setCategory(Category_PostsModle category) {
        this.category = category;
    }

}
