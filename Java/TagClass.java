package com.example;
import java.awt.Label;
public class Tag {

//string label containing user specified name
private Label tagName =  new Label();


// int time containing number of seconds the recording lasts
public int duration;


    //set label function
    public void setTagName(String userTagNameInput)
    {
        tagname.setText(userInput);

    }
    //set time function
public void setDuration(Int userDurationInput)
{
    duration = userDurationInput;
}    //display tag


public void displayTag()
{
    System.out.println(tagName);
    System.out.println(duration);
    //System.out.println(tagName, duration);
}




}
