package com.cht.training;

class WrongIdException extends Exception{
    public WrongIdException(String description){
//        return description;
        super(description);
    }
}

public class Main79 {
    public static void main(String[] args) throws WrongIdException {
        String id = "abc-12345";
        if (id.length()!=8){
            throw new WrongIdException(id + " is not a correct id");
        }
    }
}
