package com.designpatterns.intermediary;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/5 16:53
 */
@Slf4j
public class SpecificIntermediary extends BaseIntermediary {
    private SpecificColleagueOne specificColleagueOne;
    private SpecificColleagueTwo specificColleagueTwo;

    public SpecificColleagueOne getSpecificColleagueOne() {
        return specificColleagueOne;
    }

    public void setSpecificColleagueOne(SpecificColleagueOne specificColleagueOne) {
        this.specificColleagueOne = specificColleagueOne;
    }

    public SpecificColleagueTwo getSpecificColleagueTwo() {
        return specificColleagueTwo;
    }

    public void setSpecificColleagueTwo(SpecificColleagueTwo specificColleagueTwo) {
        this.specificColleagueTwo = specificColleagueTwo;
    }

    @Override
    void interactiveBehavior(BaseColleague baseColleague) {
        if(baseColleague == specificColleagueOne){
            specificColleagueOne.modifyItself();
            log.info("使用One对象，One对象内部属性自增，自增后的值为{}",specificColleagueOne.getStatus());
            specificColleagueTwo.setOtherStatus(specificColleagueOne.getStatus());
            log.info("Two对象，Two对象内部的One属性被更新");
        }else if(baseColleague == specificColleagueTwo){
            specificColleagueTwo.modifyItself();
            log.info("使用Two对象，Two对象内部属性自增，自增后的值为{}",specificColleagueTwo.getStatus());
            specificColleagueOne.setOtherStatus(specificColleagueTwo.getStatus());
            log.info("Two对象，Two对象内部的One属性被更新");
        }else {
            log.info("未知的具体同事类!");
        }
    }
}
