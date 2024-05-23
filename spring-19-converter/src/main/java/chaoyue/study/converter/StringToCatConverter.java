package chaoyue.study.converter;

import chaoyue.study.beans.Cat;
import org.springframework.core.convert.converter.Converter;

public class StringToCatConverter implements Converter<String, Cat> {
    @Override
    public Cat convert(String s) {
        Cat cat = new Cat();
        cat.setName(s);
        return cat;
    }
}
