package com.crud.CRUDAPI;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CrudController {
    CrudOperations crud=new CrudOperations();
    @RequestMapping("api/displayall")
    public List<String> displayall(){
        return crud.getList();
    }
    @RequestMapping("api/create")
    public String create(@RequestParam String name){
        return crud.create(name);
    }
    @RequestMapping("api/read")
    public String read(@RequestParam int index){
        return crud.read(index);
    }
    @RequestMapping("api/update")
    public String update(@RequestParam int index,@RequestParam String name){
        return crud.update(index,name);
    }
    @RequestMapping("api/delete")
    public String delete(@RequestParam int index){
        return crud.delete(index);
    }

}
