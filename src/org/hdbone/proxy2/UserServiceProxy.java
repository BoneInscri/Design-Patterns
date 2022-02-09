package org.hdbone.proxy2;

public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    public void setUserServiceProxy(UserServiceImpl userService) {
        this.userService=userService;
    }
    @Override
    public void add() {
        log("add");
        userService.add();
    }
    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }
    @Override
    public void update() {
        log("update");
        userService.update();
    }
    @Override
    public void query() {
        log("query");
        userService.query();
    }
    public void log(String msg)
    {
        System.out.println("使用了"+msg+"方法");
    }
}
