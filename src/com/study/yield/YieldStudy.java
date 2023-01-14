/*
 * Copyright(c) 2022 长沙市希尚网络科技有限公司
 * 注意：本内容仅限于长沙市希尚网络科技有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */

package com.study.yield;

import com.study.PrivateMethodInterface;
import com.study.PrivateMethodInterfaceImpl;
import java.util.List;

/**
 * TODO
 *
 * @author Leo
 * @version 1.0 2023/1/14
 */
public class YieldStudy {

    public static void main(String[] args) {
        PrivateMethodInterfaceImpl anInterface = new PrivateMethodInterfaceImpl();

        // calc("+");

    }

    public static void calc(String operation) {
        var result = switch (operation) {
            case "+" -> "2" + "a";
            case "*" -> "1" + "a";
            default -> "";
        };
        System.out.println(result);

        var b = switch (operation) {
            case "1" -> "";
            case "2" -> "";
            default -> "";
        };

        List<String> of = List.of();
        List<Integer> integers = List.of(1, 2, 3);

    }
}
