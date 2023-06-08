package com.dao_.view;

import com.dao_.domain.*;
import com.dao_.service.*;
import com.dao_.utils.Utility;
import java.util.List;


/**
 * 主界面
 */
public class homeView {

    // 控制是否退出菜单
    private boolean loop = true;
    // 接收用户的选择
    private String key = "";
    // 作为返回信息的编号
    int num = 1;
    // 调用 domain 的属性1
    private BillService billService = new BillService();
    private EmployeeService employeeService = new EmployeeService();
    private FoodService foodService = new FoodService();
    private MakerService makerService = new MakerService();
    private OrdersService ordersService = new OrdersService();
    private WarehouseService warehouseService = new WarehouseService();

    public static void main(String[] args) {
        new homeView().mainMenu();
    }

    // 显示主菜单
    public void mainMenu() {
        while (loop) {
            System.out.println("=============仓库系统=============");
            System.out.println("\t\t 1. 登录仓库系统");
            System.out.println("\t\t 2. 退出仓库系统");
            System.out.print("请输入你的选择:");
            key = Utility.readString(1);
            switch (key) {
                case "1" :
                    // 显示二级菜单
                    while (loop) {
                        System.out.println("=========仓库系统(二级菜单)=========");
                        System.out.println("\t\t 1. 查询");
                        System.out.println("\t\t 2. 删除");
                        System.out.println("\t\t 3. 增加");
                        System.out.println("\t\t 4. 更改");
                        System.out.println("\t\t 5. 退出");
                        System.out.print("请输入你的选择:");
                        key = Utility.readString(1);
                        switch (key) {
                            case "1" :
                                System.out.println("=============查询操作=============");
                                System.out.println("\t\t 1. Bill");
                                System.out.println("\t\t 2. Employee");
                                System.out.println("\t\t 3. Food");
                                System.out.println("\t\t 4. Maker");
                                System.out.println("\t\t 5. Orders");
                                System.out.println("\t\t 6. Warehouse");
                                System.out.print("选择你所要操作的表:");
                                String key1 = Utility.readString(1);
                                switch (key1) {
                                    case "1" :
                                        System.out.println("=============请选择查询类型=============");
                                        System.out.println("\t\t 1. 整表查询");
                                        System.out.println("\t\t 2. 依据编号单条查询");
                                        System.out.print("请输入你的选择:");
                                        String keyOfBill = Utility.readString(1);
                                        switch (keyOfBill) {
                                            case "1" :
                                                List<Bill> list = billService.list();
                                                num = 1;
                                                for (Bill bill : list) {
                                                    System.out.print((num++) + ". ");
                                                    System.out.println(bill);
                                                }
                                                break;
                                            case "2" :
                                                System.out.print("请输入你所要查询的信息的编号:");
                                                String idOfBill = Utility.readString(10);
                                                Bill bill = billService.querySingle(idOfBill);
                                                System.out.println(bill);
                                                break;
                                        }
                                        break;
                                    case "2" :
                                        System.out.println("=============请选择查询类型=============");
                                        System.out.println("\t\t 1. 整表查询");
                                        System.out.println("\t\t 2. 依据编号单条查询");
                                        System.out.print("请输入你的选择:");
                                        String keyOfEmployee = Utility.readString(1);
                                        switch (keyOfEmployee) {
                                            case "1" :
                                                List<Employee> list = employeeService.list();
                                                num = 1;
                                                for (Employee employee : list) {
                                                    System.out.print((num++) + ". ");
                                                    System.out.println(employee);
                                                }
                                                break;
                                            case "2" :
                                                System.out.print("请输入你所要查询的信息的编号:");
                                                String idOfEmployee = Utility.readString(10);
                                                Employee employee = employeeService.querySingle(idOfEmployee);
                                                System.out.println(employee);
                                                break;
                                        }
                                        break;
                                    case "3" :
                                        System.out.println("=============请选择查询类型=============");
                                        System.out.println("\t\t 1. 整表查询");
                                        System.out.println("\t\t 2. 依据编号单条查询");
                                        System.out.print("请输入你的选择:");
                                        String keyOfFood = Utility.readString(1);
                                        switch (keyOfFood) {
                                            case "1" :
                                                List<Food> list2 = foodService.list();
                                                num = 1;
                                                for (Food food : list2) {
                                                    System.out.print((num++) + ". ");
                                                    System.out.println(food);
                                                }
                                                break;
                                            case "2" :
                                                System.out.print("请输入你所要查询的信息的编号:");
                                                String idOfFood = Utility.readString(10);
                                                Food food = foodService.querySingle(idOfFood);
                                                System.out.println(food);
                                                break;
                                        }
                                        break;
                                    case "4" :
                                        System.out.println("=============请选择查询类型=============");
                                        System.out.println("\t\t 1. 整表查询");
                                        System.out.println("\t\t 2. 依据编号单条查询");
                                        System.out.print("请输入你的选择:");
                                        String keyOfMaker = Utility.readString(1);
                                        switch (keyOfMaker) {
                                            case "1" :
                                                List<Maker> list3 = makerService.list();
                                                num = 1;
                                                for (Maker maker : list3) {
                                                    System.out.print((num++) + ". ");
                                                    System.out.println(maker);
                                                }
                                                break;
                                            case "2" :
                                                System.out.print("请输入你所要查询的信息的编号:");
                                                String idOfMaker = Utility.readString(10);
                                                Maker maker = makerService.querySingle(idOfMaker);
                                                System.out.println(maker);
                                                break;
                                        }
                                        break;
                                    case "5" :
                                        System.out.println("=============请选择查询类型=============");
                                        System.out.println("\t\t 1. 整表查询");
                                        System.out.println("\t\t 2. 依据编号单条查询");
                                        System.out.print("请输入你的选择:");
                                        String keyOfOrders = Utility.readString(1);
                                        switch (keyOfOrders) {
                                            case "1" :
                                                List<Orders> list4 = ordersService.list();
                                                num = 1;
                                                for (Orders orders : list4) {
                                                    System.out.print((num++) + ". ");
                                                    System.out.println(orders);
                                                }
                                                break;
                                            case "2" :
                                                System.out.print("请输入你所要查询的信息的编号:");
                                                String idOfOrders = Utility.readString(10);
                                                Orders orders = ordersService.querySingle(idOfOrders);
                                                System.out.println(orders);
                                                break;
                                        }
                                        break;
                                    case "6" :
                                        System.out.println("=============请选择查询类型=============");
                                        System.out.println("\t\t 1. 整表查询");
                                        System.out.println("\t\t 2. 依据编号单条查询");
                                        System.out.print("请输入你的选择:");
                                        String keyOfWarehouse = Utility.readString(1);
                                        switch (keyOfWarehouse) {
                                            case "1" :
                                                List<Warehouse> list5 = warehouseService.list();
                                                num = 1;
                                                for (Warehouse warehouse : list5) {
                                                    System.out.print((num++) + ". ");
                                                    System.out.println(warehouse);
                                                }
                                                break;
                                            case "2" :
                                                System.out.print("请输入你所要查询的信息的编号:");
                                                String idOfWarehouse = Utility.readString(10);
                                                Warehouse warehouse = warehouseService.querySingle(idOfWarehouse);
                                                System.out.println(warehouse);
                                                break;
                                        }
                                        break;
                                }
                                break;
                            case "2" :
                                System.out.println("=============删除操作=============");
                                System.out.println("\t\t 1. Bill");
                                System.out.println("\t\t 2. Employee");
                                System.out.println("\t\t 3. Food");
                                System.out.println("\t\t 4. Maker");
                                System.out.println("\t\t 5. Orders");
                                System.out.println("\t\t 6. Warehouse");
                                System.out.print("选择你所要操作的表:");
                                String key2 = Utility.readString(1);
                                System.out.print("请输入你想删除的信息的编号:");
                                String deleteNum = Utility.readString(5);
                                switch (key2) {
                                    case "1" :
                                        System.out.println(billService.deleteSingle(deleteNum));
                                        break;
                                    case "2" :
                                        System.out.println(employeeService.deleteSingle(deleteNum));
                                        break;
                                    case "3" :
                                        System.out.println(foodService.deleteSingle(deleteNum));
                                        break;
                                    case "4" :
                                        System.out.println(makerService.deleteSingle(deleteNum));
                                        break;
                                    case "5" :
                                        System.out.println(ordersService.deleteSingle(deleteNum));
                                        break;
                                    case "6" :
                                        System.out.println(warehouseService.deleteSingle(deleteNum));
                                        break;
                                }
                                break;
                            case "3" :
                                System.out.println("=============插入操作=============");
                                System.out.println("\t\t 1. Employee");
                                System.out.println("\t\t 2. Food");
                                System.out.println("\t\t 3. Maker");
                                System.out.println("\t\t 4. Warehouse");
                                System.out.print("选择你所要操作的表:");
                                String key3 = Utility.readString(1);
                                switch (key3) {
                                    case "1" :
                                        System.out.print("请输入Eno:");
                                        String Eno = Utility.readString(10);
                                        System.out.print("请输入Ename:");
                                        String Ename = Utility.readString(20);
                                        System.out.print("Esex:");
                                        String Esex = Utility.readString(20);
                                        System.out.print("请输入Eage:");
                                        Integer Eage = Utility.readInt();
                                        System.out.print("请输入Eid:");
                                        String Eid = Utility.readString(10);
                                        System.out.println(employeeService.add(Eno, Ename, Esex, Eage, Eid));
                                        break;
                                    case "2" :
                                        System.out.print("请输入Fno:");
                                        String Fno = Utility.readString(10);
                                        System.out.print("请输入Fname:");
                                        String Fname = Utility.readString(20);
                                        System.out.print("请输入Fclass:");
                                        String Fclass = Utility.readString(20);
                                        System.out.print("请输入Wno:");
                                        String Wno = Utility.readString(10);
                                        System.out.print("请输入Eno:");
                                        String Eno1 = Utility.readString(10);
                                        System.out.println(foodService.add(Fno, Fname, Fclass, Wno, Eno1));
                                        break;
                                    case "3" :
                                        System.out.print("请输入Mno:");
                                        String Mno = Utility.readString(10);
                                        System.out.print("请输入Mname:");
                                        String Mname = Utility.readString(20);
                                        System.out.print("请输入Mplace:");
                                        String Mplace = Utility.readString(20);
                                        System.out.print("请输入Mphone:");
                                        String Mphone = Utility.readString(10);
                                        System.out.print("请输入Memail:");
                                        String Meamil = Utility.readString(10);
                                        System.out.println(makerService.add(Mno, Mname, Mplace, Mphone, Meamil));
                                        break;
                                    case "4" :
                                        System.out.print("请输入Wno:");
                                        String Wno1 = Utility.readString(10);
                                        System.out.print("请输入Wclass:");
                                        String Wclass = Utility.readString(20);
                                        System.out.print("请输入Wnum:");
                                        Integer Wnum = Utility.readInt();
                                        System.out.println(warehouseService.add(Wno1, Wclass, Wnum));
                                        break;
                                }
                                break;
                            case "4" :
                                System.out.println("=============更改操作=============");
                                System.out.println("\t\t 1. Employee");
                                System.out.println("\t\t 2. Food");
                                System.out.println("\t\t 3. Maker");
                                System.out.println("\t\t 4. Warehouse");
                                System.out.print("选择你所要操作的表:");
                                String key4 = Utility.readString(1);
                                switch (key4) {
                                    case "1" :
                                        System.out.print("请输入你所要更改的信息的编号:");
                                        String updateId = Utility.readString(10);
                                        System.out.print("请输入你所要更改的信息的属性:");
                                        String updateKey = Utility.readString(20);
                                        System.out.print("请输入更改后的值:");
                                        switch (updateKey) {
                                            case "Ename" :
                                                String updateValue = Utility.readString(20);
                                                System.out.println(employeeService.updateEname(updateId, updateValue));
                                                break;
                                            case "Esex" :
                                                String updateValue1 = Utility.readString(20);
                                                System.out.println(employeeService.updateEsex(updateId, updateValue1));
                                                break;
                                            case "Eage" :
                                                Integer updateValue2 = Utility.readInt();
                                                System.out.println(employeeService.updateEage(updateId, updateValue2));
                                                break;
                                            case "Eid" :
                                                Integer updateValue3 = Utility.readInt();
                                                System.out.println(employeeService.updateEid(updateId, updateValue3));
                                                break;
                                        }
                                        break;
                                    case "2" :
                                        System.out.print("请输入你所要更改的信息的编号:");
                                        String updateIdOfFood = Utility.readString(10);
                                        System.out.print("请输入你所要更改的信息的属性:");
                                        String updateKeyOfFood = Utility.readString(20);
                                        System.out.print("请输入更改后的值:");
                                        switch (updateKeyOfFood) {
                                            case "Fname" :
                                                String updateFoodeOfFname = Utility.readString(20);
                                                System.out.println(foodService.updateFname(updateIdOfFood, updateFoodeOfFname));
                                                break;
                                            case "Fclass" :
                                                String updateFoodOfFclass = Utility.readString(20);
                                                System.out.println(foodService.updateFclass(updateIdOfFood, updateFoodOfFclass));
                                                break;
                                            case "Fplace" :
                                                String updateFoodOfFplace = Utility.readString(20);
                                                System.out.println(foodService.updateFplace(updateIdOfFood, updateFoodOfFplace));
                                                break;
                                            case "Fid" :
                                                String updateFoodOfFid = Utility.readString(20);
                                                System.out.println(foodService.updateFid(updateIdOfFood, updateFoodOfFid));
                                                break;
                                        }
                                        break;
                                    case "3" :
                                        System.out.print("请输入你所要更改的信息的编号:");
                                        String updateIdOfMaker = Utility.readString(10);
                                        System.out.print("请输入你所要更改的信息的属性:");
                                        String updateKeyOfMaker = Utility.readString(20);
                                        System.out.print("请输入更改后的值:");
                                        switch (updateKeyOfMaker) {
                                            case "Mname" :
                                                String updateMakerOfMname = Utility.readString(20);
                                                System.out.println(makerService.updateMname(updateIdOfMaker, updateMakerOfMname));
                                                break;
                                            case "Mplace" :
                                                String updateMakerOfMplace = Utility.readString(20);
                                                System.out.println(makerService.updateMplace(updateIdOfMaker, updateMakerOfMplace));
                                                break;
                                            case "Mphone" :
                                                String updateMakerOfMphone = Utility.readString(20);
                                                System.out.println(makerService.updateMphone(updateIdOfMaker, updateMakerOfMphone));
                                                break;
                                            case "Memail" :
                                                String updateMakerOfMemail = Utility.readString(20);
                                                System.out.println(makerService.updateMemail(updateIdOfMaker, updateMakerOfMemail));
                                                break;
                                        }
                                        break;
                                    case "4" :
                                        System.out.print("请输入你所要更改的信息的编号:");
                                        String updateIdOfWarehouse = Utility.readString(10);
                                        System.out.print("请输入你所要更改的信息的属性:");
                                        String updateKeyOfWarehouse = Utility.readString(20);
                                        System.out.print("请输入更改后的值:");
                                        switch (updateKeyOfWarehouse) {
                                            case "Wclass" :
                                                String updateWarehouseOfWclass = Utility.readString(20);
                                                System.out.println(warehouseService.updateWclass(updateIdOfWarehouse, updateWarehouseOfWclass));
                                                break;
                                            case "Wnum" :
                                                Integer updateWarehouseOfWnum = Utility.readInt(20);
                                                System.out.println(warehouseService.updateWnum(updateIdOfWarehouse, updateWarehouseOfWnum));
                                                break;
                                        }
                                        break;
                                }
                                break;
                            case "5" :
                                loop = false;
                                break;
                            default:
                                System.out.println("你的输入有误, 请重新输入!");
                                break;
                        }
                    }
                    break;
                case "2" :
                    loop = false;
                    break;
            }
        }

        System.out.println("你退出了仓库系统");
    }
}
