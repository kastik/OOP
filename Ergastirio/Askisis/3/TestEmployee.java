public class TestEmployee {
    public static void main(String[] args){
    Employee[] arr = new Employee[5];
    arr[0] = new Employee("abc","papas",12,300);
    arr[1] = new Employee("def","papas",23,300);
    arr[2] = new Employee("ghi","papas",34,300);
    arr[3] = new Employee("gkl","papas",45,300);
    arr[4] = new Employee("mno","papas",56,300);
    System.out.println(Employee.MyUtils.AnazitisiMeEpwnymo(arr,"ghi"));
    System.out.println(Employee.MyUtils.AnazitisiMeAFM(arr,45L));
    System.out.println(Employee.MyUtils.AnadromikiAnazitisiMeAFM(arr,0,arr.length,34));
    }
}
