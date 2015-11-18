package com.example.oranmoshe.lishi;

/**
 * Created by oranmoshe on 11/11/15.
 */

// simple class that just has one member property as an example
public class ListViewItem {

    private String TaskName;

    public ListViewItem(String name){
        TaskName = name;
    }

    private static final long serialVersionUID = 46543445;

    public String GetTaskName(){
        return TaskName;
    }


}

