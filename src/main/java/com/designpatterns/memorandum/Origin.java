package com.designpatterns.memorandum;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/6 19:53
 */
public class Origin {
    private int status;
    private String text;
    private MemorandumBook memorandumBook;

    @Override
    public String toString() {
        return "Origin{" +
                "status=" + status +
                ", text='" + text + '\'' +
                '}';
    }

    public Origin(String text, int status){
        this.text =text;
        this.status =status;
    }

    public void modify(String text,int status){
        this.text =text;
        this.status = status;
    }

    public MemorandumBook storeMemento(){
        this.memorandumBook = new MemorandumBook(this.status,this.text);
        return this.memorandumBook;
    }

    public void setMemorandumBook(MemorandumBook memorandumBook) {
        this.memorandumBook = memorandumBook;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    static class MemorandumBook{
        private int status;
        private String text;

        public MemorandumBook(int status, String text) {
            this.status = status;
            this.text = text;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
