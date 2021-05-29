package com.project.bootcampweek.exceptions;

import com.project.bootcampweek.util.MessageUtils;

public class NotFoundException extends RuntimeException{
    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}