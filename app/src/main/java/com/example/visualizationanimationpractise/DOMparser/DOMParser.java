package com.example.visualizationanimationpractise.DOMparser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class DOMParser {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document document = builder.parse(new File("example.xml"));

    Element root = document.getDocumentElement();

    NodeList items = root.getElementsByTagName("item");
    for (int i = 0; i < items.getLength(); i++) {
        Element item = (Element) items.item(i);
        String duration = item.getAttribute("duration");
        String drawable = item.getAttribute("drawable");
    }

}
