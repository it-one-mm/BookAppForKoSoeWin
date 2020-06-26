package com.itonem.bookapp;

public class ChapterModel {

    String chapterTitle,
            chapterDownloadlink,
            chapterAudiobook;

    public ChapterModel(String chapterTitle,
                        String chapterDownloadlink,
                        String chapterAudiobook) {
        this.chapterTitle = chapterTitle;
        this.chapterDownloadlink = chapterDownloadlink;
        this.chapterAudiobook = chapterAudiobook;
    }

    public ChapterModel() {
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public String getChapterDownloadlink() {
        return chapterDownloadlink;
    }

    public void setChapterDownloadlink(String chapterDownloadlink) {
        this.chapterDownloadlink = chapterDownloadlink;
    }

    public String getChapterAudiobook() {
        return chapterAudiobook;
    }

    public void setChapterAudiobook(String chapterAudiobook) {
        this.chapterAudiobook = chapterAudiobook;
    }
}
