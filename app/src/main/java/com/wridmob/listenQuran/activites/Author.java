package com.wridmob.listenQuran.activites;

public class Author {

    public String RealName ;
    public String ServerName ;
    public String StateName ;
    public String ImgUrl ;

    public Author(){}

    public Author(String ServerName, String RealName) {
        this.ServerName=ServerName;
        this.RealName=RealName;
    }

    public Author(String ServerName, String RealName, String StateName, String ImgUrl) {
        this.ServerName=ServerName;
        this.RealName=RealName;
        this.StateName=StateName;
        this.ImgUrl=ImgUrl;
    }

}
