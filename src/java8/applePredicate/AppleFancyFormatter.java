package applePredicate;

import entity.Apple;
import enums.Color;

public class AppleFancyFormatter implements AppleFormatter{
    @Override
    public String accept(Apple apple) {
        String result = "";

        if(Integer.parseInt(apple.getWeight())>200 && apple.getColor().equals(Color.GREEN)){
            result = "Accepted";
        }else{
            result = "Unaccepted";
        }

        result +=  " Apple weight : " + apple.getWeight() + " color : " + apple.getColor();

        return result;
    }
}
