package org.sho.tocamelcase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution{

    static String toCamelCase(String s){

        var regex = "([-|_][a-zA-Z]*)";
        Matcher matcher = Pattern.compile(regex).matcher(s);

        var lastIndex = 0;
        var output = new StringBuilder();
        while (matcher.find()) {
            String group = matcher.group(1);
            output.append(s, lastIndex, matcher.start()).append(convert(group));
            lastIndex = matcher.end();
        }

        return output.toString();
    }

    private static String convert(String token) {
        return token.substring(1,2).toUpperCase() + token.substring(2);
    }
}