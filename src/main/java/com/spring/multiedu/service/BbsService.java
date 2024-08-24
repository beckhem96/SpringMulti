package com.spring.multiedu.service;

import com.spring.multiedu.dao.AnotherDAO;
import com.spring.multiedu.dao.BbsDAO;
import lombok.Setter;

public class BbsService {
    private BbsDAO bbsDAO;
    @Setter
    private AnotherDAO anotherDAO;

    public BbsService(BbsDAO bbsDAO) {
        this.bbsDAO = bbsDAO;
    }

    public int calcTwoNumbersAndSquare(int a, int b) {
        int result = bbsDAO.addTwoNumber(a, b);
        return anotherDAO.square(result);
    }
}
