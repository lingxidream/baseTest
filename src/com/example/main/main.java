package com.example.main;

import org.omg.CORBA.Current;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;

public class main {
    public static void main(String[] args) throws Exception {

        Test1();
    }
    private static void Test1() throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat df3 = new SimpleDateFormat("MM dd yyyy HH:mm",Locale.US);
        Date date1 = df1.parse("2020-01-01T00:00:00");
        Date date2 = df1.parse("2020-01-01T00:00:00");

        Date date = new Date();

        String format = df.format(date);
        String format1 = df1.format(date);
        System.out.println(date);
        System.out.println(format);
        System.out.println(format1);

        System.out.println(date1);

       // System.out.println(date1+ "   "+ date2);

//        Date d1 = df.parse("2020-01-01 00:00:00");
//        Date d2 = df.parse("2020-02-01 00:00:00");
//        Date d3 = df.parse("2020-03-01 00:00:00");
//        Date d4 = df.parse("2020-04-01 00:00:00");
//
//        if(date1.before(d1)){
//            System.out.println(d1);
//        }

//        System.out.println(date1.getTime());
//        System.out.println(date2.getTime());
//        if(date1.before(date2)){
//            System.out.println("d1<d2");
//        }else if(date1.after(date2)){
//            System.out.println("d1>d2");
//        }else if(date1.equals(date2)){
//            System.out.println("d1=d2");
//        }

//        String dataStr1 = df.format(date1);
//
//        String dateStr2 = df1.format(new Date());
////        Calendar c1 = Calendar.getInstance();
////        c1.setTime(date1);
////        c1.add(c1.DATE,1);
////        date1 = c1.getTime();
//
////        Date date2 = new Date("2020-01-03 13:27:47");
////        String dataStr1 = df.format(date2);
//
//
//        //System.out.println(df2.format(date1));
//        System.out.println(dateStr2);


//        long d3 = 2020010100000L;
//        Calendar c1 = Calendar.getInstance();
//
//        long l1 = c1.getTimeInMillis();
//        System.out.println(l1);
//
//        System.out.println(c1.getTime());
//
//        c1.setTimeInMillis(d3);
        //System.out.println(c1.getTime());
    }

    private static void Test2(){
        Map<String, Student> map = new HashMap<String, Student>();
        Student s1 = new Student("1111",19);
        Student s2 = new Student("2222",18);
        Student s3 = new Student("3333",17);
        Student s4 = new Student("4444",16);

        map.put("a", s1);
        map.put("b", s2);
        map.put("c", s3);
        map.put("d", s4);
        // 根据key获取 其value
        System.out.println("通过key获取 其value");
        System.out.println("key 'what'的value为："+map.get("a")+"\n");
        Student a = map.get("a");
        a.setAge(20);
        map.put("a",a);
        System.out.println(map);

        List<Student> valuse = new ArrayList<>(map.values());
        System.out.println(valuse);
    }

    private static void Test3() throws InterruptedException {
        Thread thread = new Thread();
        System.out.println(new Date().toString() + "  "+ Thread.currentThread().getName());
        Thread.sleep(1000);
        System.out.println(new Date().toString() + "  "+ Thread.currentThread().getName());
        //thread.wait(1000);
        System.out.println(new Date().toString() + "  "+ Thread.currentThread().getName());
    }

    private static void Test4(){
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(null);
        Student student2 = new Student("222");
        Student student3 = new Student("333");
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student: students) {
            if(student.getName() == null ||student.getName().isEmpty()){
                continue;
            }
            student.setAge(18);
        }



        System.out.println(students);
    }
}
