package com.lc.sofa.core.framework.support.sql.expression;

/**
 *  SQL中between表达式
 * 
 * @author       YZ
 * @version 1.0, 2014-1-2
 * @since 1.0, 2014-1-2
 */
public class BetweenExpression extends BetweenOrNotExpression{
    
       public BetweenExpression(String fieldName,Object loValue,Object hiValue){
    	      this.fieldName=fieldName;
    	      this.loValue=loValue;
    	      this.hiValue=hiValue;
    	      this.op=Expression.SQL_BETWEEN;
       }
}
