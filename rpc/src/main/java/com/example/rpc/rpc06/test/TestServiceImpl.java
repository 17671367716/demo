package com.example.rpc.rpc06.test;

public class TestServiceImpl implements TestService{
    @Override
    public Test getTest() {
        return new Test(123,"test","家里蹲",18);
    }
}
