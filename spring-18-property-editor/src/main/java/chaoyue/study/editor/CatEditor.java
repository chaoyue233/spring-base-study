package chaoyue.study.editor;

import chaoyue.study.beans.Cat;

import java.beans.PropertyEditorSupport;

/**
 * 自定义属性转化器
 * 将字符串转化为Cat对象
 */
public class CatEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Cat cat = new Cat();
        cat.setName(text);
        super.setValue(cat);
    }
}
