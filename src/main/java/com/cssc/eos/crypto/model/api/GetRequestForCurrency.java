package com.cssc.eos.crypto.model.api;

import com.cssc.eos.crypto.model.types.TypeName;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by swapnibble on 2018-04-16.
 */
public class GetRequestForCurrency {
    @Expose
    protected boolean json = false;

    @Expose
    protected TypeName code;

    @Expose
    protected String symbol;

    public GetRequestForCurrency(String tokenContract, String symbol){
        this.code = new TypeName(tokenContract);
        this.symbol = StringUtils.isEmpty(symbol) ? null : symbol;
    }
}
