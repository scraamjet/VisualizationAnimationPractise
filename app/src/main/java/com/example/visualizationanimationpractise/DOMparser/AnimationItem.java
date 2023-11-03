package com.example.visualizationanimationpractise.DOMparser;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class AnimationItem {
    public class AnimationItem {
        private String duration;
        private String drawable;

        public AnimationItem(String duration, String drawable) {
            this.duration = duration;
            this.drawable = drawable;
        }


        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getDrawable() {
            return drawable;
        }

        public void setDrawable(String drawable) {
            this.drawable = drawable;
        }
    }

// ...

    NodeList items = root.getElementsByTagName("item");
    List<AnimationItem> animationItems = new ArrayList<>();
for (int i = 0; i < items.getLength(); i++) {
        Element item = (Element) items.item(i);
        String duration = item.getAttribute("duration");
        String drawable = item.getAttribute("drawable");
        AnimationItem animationItem = new AnimationItem(duration, drawable);
        animationItems.add(animationItem);
    }

}
