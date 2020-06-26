package com.itonem.bookapp;

public class BookModel {
    String bookTitle,bookImage,bookDownloadLink,createAt,bookCategory,bookAuthor;

    public BookModel(String bookTitle, String bookImage, String bookDownloadLink, String createAt, String bookCategory, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookImage = bookImage;
        this.bookDownloadLink = bookDownloadLink;
        this.createAt = createAt;
        this.bookCategory = bookCategory;
        this.bookAuthor = bookAuthor;
    }

    public BookModel() {
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public String getBookDownloadLink() {
        return bookDownloadLink;
    }

    public void setBookDownloadLink(String bookDownloadLink) {
        this.bookDownloadLink = bookDownloadLink;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
