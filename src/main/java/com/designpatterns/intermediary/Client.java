package com.designpatterns.intermediary;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/5 16:35
 * 中介者模式
 */
public class Client {
    public static void main(String[] args) {
        SpecificIntermediary intermediary = new SpecificIntermediary();
        SpecificColleagueOne one = new SpecificColleagueOne(intermediary, 5);
        SpecificColleagueTwo two = new SpecificColleagueTwo(intermediary, 0);
        intermediary.setSpecificColleagueOne(one);
        intermediary.setSpecificColleagueTwo(two);
        one.change();
        two.change();
    }
}
