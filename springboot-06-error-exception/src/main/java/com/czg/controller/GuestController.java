package com.czg.controller;

import com.czg.domain.Guest;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GuestController {

    /**
     * @Valid  直接放在bean前方
     * 用来校验它是否符合注解规则
     * 校验不通过时  直接返回400 和  失败原因
     * 处理方式是，遍历全部属性，失败结果全部返回
     * @param guest
     * @return
     */
    @PostMapping("/guest")
    public String add(@Valid Guest guest) {
        return "Success";
    }

    //自定义效果实现
    @PostMapping("/guest2")
    public String add2(@Valid Guest guest, BindingResult result) {
        if (result.getErrorCount() > 0) {
            List<FieldError> fieldErrorList = result.getFieldErrors();
            StringBuilder builder = new StringBuilder();
            for (FieldError fieldError : fieldErrorList) {
                builder.append(fieldError.getField());
                builder.append("\t");
                builder.append(fieldError.getDefaultMessage());
                builder.append("\n");
            }
            return builder.toString();
        }
        return "Success";
    }
}
