package com.matrix;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.InputStream;
import java.util.List;

/*
*   目标：学会使用dom4j解析XML文件中的数据
*   1.导入dom4j框架
*   2.准备一个xml文件
* */
public class Dem4JHelloWorldDemo1 {
    @Test
    public void parseXMLData() throws Exception {
        //1.创建一个Dom4j的解析器对象，代表了整个dom4j框架
        SAXReader saxReader = new SAXReader();
        //2.把XML文件加载到内存中成为一个Document文档对象
        //Document document = saxReader.read(new File("xml-app/src/Contacts.xml"));//需要通过模块名去定位文件

        //注意：getResourceAsStream中的/是直接去src下寻找文件
        Document document = saxReader.read(Dem4JHelloWorldDemo1.class.getResourceAsStream("/Contacts.xml"));

        //3.获取根元素对象
        Element root = document.getRootElement();
        System.out.println(root.getName());

        //4.拿根元素下的全部子元素对象
        List<Element> sonEles = root.elements();
        for (Element sonEle : sonEles) {
            System.out.println(sonEle.getName());
        }
        //拿指定子元素
        Element userEle = root.element("user");
        System.out.println(userEle.getName());
        //如果同名，默认提取第一个子元素对象
        Element contactEle = root.element("contact");
        //直接提取属性值
        System.out.println(contactEle.attributeValue("id"));
        System.out.println("===========================");

        //获取子元素文本
        String name1 = contactEle.elementText("name");
        //去掉前后空格
        String name2 = contactEle.elementTextTrim("name");
        System.out.println(name2);
        //根据元素获取属性值
        Attribute idAttr = contactEle.attribute("id");
        System.out.println(idAttr.getName() + "--" + idAttr.getValue());
        //获取当前元素下的子元素对象
        Element email = contactEle.element("email");
        System.out.println(email.getName() + "---" + email.getText());




    }














}
