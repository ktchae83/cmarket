package com.example.cmarket.Order;

import com.example.cmarket.AppConfig;
import com.example.cmarket.discount.CurrentDiscountInfo;
import com.example.cmarket.discount.DiscountInfo;
import com.example.cmarket.discount.RateDiscountInfo;
import com.example.cmarket.user.User;
import com.example.cmarket.user.UserGrade;
import com.example.cmarket.user.UserService;

public class OrderApp {
    public static void main(String[] args) {
//        CurrentDiscountInfo discountInfo = new CurrentDiscountInfo();
//        DiscountInfo discountInfo = new RateDiscountInfo();

        AppConfig appConfig = new AppConfig();
        UserService userService = appConfig.userService();
        OrderService orderService = appConfig.orderService();

//        User user = new User(0L, "kimcoding", UserGrade.GRADE_1);
//        int discountedPrice = discountInfo.discount(user, 5000);
//
//        if (discountedPrice == 250) {
//            System.out.println("회원 등급에 알맞은 할인이 적용되었습니다.");
//            System.out.println("1등급 회원으로 5000 -> " + discountedPrice);
//        }
//
//        user = new User(0L, "leejava", UserGrade.GRADE_2);
//        discountedPrice = discountInfo.discount(user, 5000);
//
//        if(discountedPrice == 500) {
//            System.out.println("회원 등급에 알맞은 할인이 적용되었습니다.");
//            System.out.println("2등급 회원으로 5000 -> " + discountedPrice);
//        }

        Long memberId = 0L;
        User user = new User(memberId, "kimlucky", UserGrade.GRADE_1);
        userService.signup(user);

        Order order = orderService.createOrder(memberId, "coffee", 5000);
        System.out.println("order = " + order.toString());
    }
}
