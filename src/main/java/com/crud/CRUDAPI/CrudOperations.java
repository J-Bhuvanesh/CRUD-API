package com.crud.CRUDAPI;
import java.util.*;
public class CrudOperations {

    List<String> list=new ArrayList<>(Arrays.asList("bhuvanesh","bhuvan","virat","dhoni"));
    public String create(String name){
        list.add(name);
        return "The data "+name+" has created.";
    }
    public String read(int index){
        return "The data in that index is "+list.get(index);
    }
    public List<String> getList() {
        return list;
    }

    public String update(int index, String name) {
        String name1=list.get(index);
        list.set(index,name);
        return "The name has update from "+name1+" to "+name;
    }

    public String delete(int index) {
        String name=list.get(index);
        list.remove(index);
        return "The data removed in the list is "+name;
    }
}
