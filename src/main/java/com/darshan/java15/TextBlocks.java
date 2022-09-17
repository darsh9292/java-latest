package com.darshan.java15;

public class TextBlocks {

    String someRandomStr = "Hello";

    String beforeHTML = "<tr>\n" +
            "<td>Retweets : " + someRandomStr + "</td>\n" +
            "</tr>";


    String afterHTML = """
            <tr>
                <td>Retweets : %s</td>
            </tr>
            """.formatted(someRandomStr);    

    public static void main(String[] args) {

    }

}
