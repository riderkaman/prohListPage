package com.test.vo;


public class ProhListVO {

    public ProhListVO() {
    }

    public ProhListVO(int rnum, int no, String word, String name, String registerTime) {
        this.rnum = rnum;
        this.no = no;
        this.word = word;
        this.name = name;
        this.registerTime = registerTime;
    }

    public int getRnum() {
        return rnum;
    }

    public void setRnum(int rnum) {
        this.rnum = rnum;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    private int rnum;
    private int no;
    private String word;
    private String name;
    private String registerTime;

}
