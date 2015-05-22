package com.processor.batch.processor;

import com.processor.batch.model.CreditBill;
import org.springframework.batch.item.ItemProcessor;

/**
 * Title com.processor.batch.processor.CreditBillProcessor
 * Copyright: Copyright (c) 2005
 * Description: <br> </br>
 * Company: »¥¶¯ÔÚÏß
 * Created on 2015/5/22 18:35
 * author madong
 */
public class CreditBillProcessor implements ItemProcessor<CreditBill,CreditBill>{

    @Override
    public CreditBill process(CreditBill item) throws Exception {
        System.out.println(item.toString());
        return item;
    }
}
