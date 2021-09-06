package com.example.myapplication;

public class ModalClass {
    private String imageName;
    private String ImageContent;

    public ModalClass(String imageName, String imageContent) {
        this.imageName = imageName;
        ImageContent = imageContent;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageContent() {
        return ImageContent;
    }
}
