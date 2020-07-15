package com.maben.vo;

public class GoodsModel extends BaseModel<GoodsModel> {

    private String name;
    private String imgPath;
    private String description;

    @Override
    public String toString() {
        return "GoodsModel{" + "name='" + name + '\'' + ", imgPath='" + imgPath + '\'' + ", description='" + description + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
