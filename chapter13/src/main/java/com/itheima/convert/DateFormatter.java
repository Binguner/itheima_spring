package com.itheima.convert;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter implements Formatter<Date> {

    // 定义日期格式
    private String datePattern = "yyyy-MM-dd HH:mm:ss";
    // 声明 SimpleDateFormat 对象
    private SimpleDateFormat simpleDateFormat;

    @Override
    public Date parse(String text, Locale locale) throws ParseException {
        simpleDateFormat = new SimpleDateFormat(datePattern);
        return simpleDateFormat.parse(text);
    }

    @Override
    public String print(Date object, Locale locale) {
        return new SimpleDateFormat().format(object);
    }
}
