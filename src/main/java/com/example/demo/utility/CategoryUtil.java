package com.example.demo.utility;

public class CategoryUtil {
    public static String generateCategoryPath(String currentPath, String categoryId) {
        if (currentPath == null || currentPath.isEmpty()) {
            return "/" + categoryId;
        } else {
            return currentPath + "/" + categoryId;
        }
    }
}
