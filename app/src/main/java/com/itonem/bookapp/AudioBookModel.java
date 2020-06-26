package com.itonem.bookapp;

public class AudioBookModel {

    String audiobookTitle,
            audiobookImage,
            audiobookCategory,
            audiobookCreatedAt,
            audiobookAuthor;

    public AudioBookModel(String audiobookTitle,
                          String audiobookImage,
                          String audiobookCategory,
                          String audiobookCreatedAt,
                          String audiobookAuthor) {
        this.audiobookTitle = audiobookTitle;
        this.audiobookImage = audiobookImage;
        this.audiobookCategory = audiobookCategory;
        this.audiobookCreatedAt = audiobookCreatedAt;
        this.audiobookAuthor = audiobookAuthor;
    }

    public AudioBookModel() {
    }

    public String getAudiobookTitle() {
        return audiobookTitle;
    }

    public void setAudiobookTitle(String audiobookTitle) {
        this.audiobookTitle = audiobookTitle;
    }

    public String getAudiobookImage() {
        return audiobookImage;
    }

    public void setAudiobookImage(String audiobookImage) {
        this.audiobookImage = audiobookImage;
    }

    public String getAudiobookCategory() {
        return audiobookCategory;
    }

    public void setAudiobookCategory(String audiobookCategory) {
        this.audiobookCategory = audiobookCategory;
    }

    public String getAudiobookCreatedAt() {
        return audiobookCreatedAt;
    }

    public void setAudiobookCreatedAt(String audiobookCreatedAt) {
        this.audiobookCreatedAt = audiobookCreatedAt;
    }

    public String getAudiobookAuthor() {
        return audiobookAuthor;
    }

    public void setAudiobookAuthor(String audiobookAuthor) {
        this.audiobookAuthor = audiobookAuthor;
    }
}
