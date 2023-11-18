package com.example.test.functional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorInterface cal = new Calculator();
        cal.sum(10,20);
        cal.sum(30,40);
    }

    @Data
    public static class Address {
        private Long addressId;
        private String city;
        private String country;
    }

    public static interface Child extends Parent {
        void m1();
        void m2();
    }

    @Data
    public static class Employee {
        private Long id;
        private String name;
        private List<Address> addressList;
    }

    @FunctionalInterface
    public static interface Parent {
        void m1();
    }

    public static class Test {

        public static void main(String[] args) throws JsonProcessingException {
            String result = m1();
            System.out.println("Print result " + result);
        }

        private static String m1() throws JsonProcessingException {
            Address address1 = new Address();
            address1.setCity("Hyderabad");
            address1.setCountry("Bharath");

            Address address2 = new Address();
            address2.setCity("Chennai");
            address2.setCountry("Bharath");

            List<Address> addressList = new ArrayList<>();
            addressList.add(address1);
            addressList.add(address2);

            Employee employee = new Employee();
            employee.setId(1L);
            employee.setName("Sarath");
            employee.setAddressList(addressList);


            List<Address> addresses = employee.getAddressList()
                    .stream()
                    .peek(address -> address.setAddressId(UUID.randomUUID().getMostSignificantBits()))
                    .toList();

            ObjectMapper objectMapper = new ObjectMapper();
            // objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
        }



    }

    public static interface TestFunctionalInterface {
        void m1();
        default void m2(){
            System.out.println("Inside default method");
        }
        static void m3(){
            System.out.println("Inside static method");
        }
    }

    @FunctionalInterface
    public static interface TestFunctionalInterface2 {
        void m1();
        default void m2(){
            System.out.println("Inside default method");
        }
        static void m3(){
            System.out.println("Inside static method");
        }
    }

    @FunctionalInterface
    public static interface TestFunctionalInterface3 {
        void m1();
        // void m2();

        default void m3(){
            System.out.println("Inside default method");
        }
        static void m4(){
            System.out.println("Inside static method");
        }

    }

    //@FunctionalInterface
    public static interface TestFunctionalInterface4 {

        default void m3(){
            System.out.println("Inside default method");
        }
        static void m4(){
            System.out.println("Inside static method");
        }

    }
}
