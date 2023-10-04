package org.launchcode.skills_tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SkillsController {

    @GetMapping("/home")
    @ResponseBody
    public String homeView() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<form action=\"/form\" method=\"post\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <title>Skills Tracker</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>We have a few skills we would like to learn. Here is the list!</h1>\n" +
                "\n" +
                "<ol>\n" +
                "    <li>Java</li>\n" +
                "     <li>Java Script</li>\n" +
                "    <li>Python</li>\n" +
                "</ol>\n" +
                "</body>\n" +
                "</form>\n" +
                "</html> ";
    }

    @GetMapping("/form")
    @ResponseBody
    public String formView() {
        return "<form action=\"/form\" method=\"post\">\n" +
                "    <label for=\"name\">Name:</label><br>\n" +
                "    <input type=\"text\" id=\"name\" name=\"name\"><br><br>\n" +
                "    \n" +
                "    <label for=\"myFavouriteLanguage\">My Favorite Language:</label><br>\n" +
                "    <select id=\"myFavouriteLanguage\" name=\"myFavouriteLanguage\">\n" +
                "        <option value=\"Java\">Java</option>\n" +
                "        <option value=\"JavaScript\">JavaScript</option>\n" +
                "        <option value=\"Python\">Python</option>\n" +
                "    </select><br><br>\n" +
                "    \n" +
                "    <label for=\"my2FavouriteLanguage\">My Second Favorite Language:</label><br>\n" +
                "    <select id=\"my2FavouriteLanguage\" name=\"my2FavouriteLanguage\">\n" +
                "        <option value=\"Java\">Java</option>\n" +
                "        <option value=\"JavaScript\">JavaScript</option>\n" +
                "        <option value=\"Python\">Python</option>\n" +
                "    </select><br><br>\n" +
                "    \n" +
                "    <label for=\"my3FavouriteLanguage\">My Third Favorite Language:</label><br>\n" +
                "    <select id=\"my3FavouriteLanguage\" name=\"my3FavouriteLanguage\">\n" +
                "        <option value=\"Java\">Java</option>\n" +
                "        <option value=\"JavaScript\">JavaScript</option>\n" +
                "        <option value=\"Python\">Python</option>\n" +
                "    </select><br><br>\n" +
                "    \n" +
                "    <input type=\"submit\" value=\"Submit\">\n" +
                "</form>";
    }


    @PostMapping("/form")
    @ResponseBody
    public String listView(@RequestParam String name, String myFavouriteLanguage, String my2FavouriteLanguage, String my3FavouriteLanguage) {
        return "<h1>" + name + "</h1>\n" +
                "\n" +
                "<ol>\n" +
                "    <li>" + myFavouriteLanguage + "</li>\n" +
                "    <li>" + my2FavouriteLanguage + "</li>\n" +
                "    <li>" + my3FavouriteLanguage + "</li>\n" +
                "</ol>";
    }


}
