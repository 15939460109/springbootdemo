package com.czg.controller;

import com.czg.bean.Guest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/guest")
@Api(tags = "嘉宾相关的接口")
// Api声明接口的功能
public class GuestController {

    @GetMapping
    @ApiOperation("查询嘉宾列表")
    // ApiOperation声明接口的具体操作
    public String list() {
        return "list";
    }

    @GetMapping("/toAdd")
    @ApiIgnore
    // ApiIgnore忽略此接口
    public String toAdd() {
        return "add";
    }

    @PostMapping("/add")
    @ApiOperation("添加嘉宾")
    public String add(Guest guest) {
        return "add guest";
    }

    @GetMapping("/toUpdate/{name}")
    @ApiIgnore
    public String toUpdate(@PathVariable("name") String name) {
        return "update";
    }

    @PutMapping("/update")
    @ApiOperation("更新嘉宾")
    public String update(Guest guest) {
        return "update guest";
    }

    @DeleteMapping("/delete/{name}")
    @ApiOperation("删除嘉宾")
    @ApiImplicitParam(name = "name", value = "嘉宾姓名")
    // ApiImplicitParam声明参数的具体信息
    public String delete(@PathVariable("name") String name) {
        return "delete guest";
    }
}
