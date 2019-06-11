package com.min.blog.common.global;

import com.min.blog.utils.DateUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class GlobalException{

    private static StringBuilder sb = new StringBuilder();

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        Map<String,Object> map = new HashMap<>(16);

        //错误信息
        wirte("异常时间："+ DateUtil.getCurrentDateTimeStr("yyyy-MM-dd HH:mm:ss:sss"));
        wirte("请求地址："+ httpServletRequest.getRequestURL());
        wirte("错误原因："+ e.toString());
        //详细异常
        sb.setLength(0);
        StackTraceElement[] error = e.getStackTrace();
        for (StackTraceElement stackTraceElement : error) {
            sb.append(stackTraceElement.toString()+"\n");
        }
        wirte("详细原因："+ sb.toString());
        //返回统一错误页面
        map.put("code",0);
        map.put("msg",e.toString());
        return map;

    }


    /**
     *  打印到控制台
     */
    void wirte(String msg){
        System.out.println(msg);
    }
}
