package com.roiacademy.nestedClasses;

public class ClassA {
    private String name;

    public ClassA(String name) {
        this.name = name;
    }

    /**
     * Static Inner Class.
     */
    public static class StaticInnerClassA {
        private String nameFromStaticInnerClass;

        public StaticInnerClassA() {

        }
        public StaticInnerClassA(String staticInnerClassVariable) {
            this.nameFromStaticInnerClass = staticInnerClassVariable;
        }

        public void setNameFromStaticInnerClass(String a) {
            this.nameFromStaticInnerClass = a;
        }

        public String getNameFromStaticInnerClass() {
            return nameFromStaticInnerClass;
        }
    }

    /**
     * Inner Class.
     */
    public class InnerClass {
        //private static String test; //cant have static declarations.
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public void printAllName() {
            System.out.println(this.name);
            System.out.println(ClassA.this.name);
        }

        public void setAllNames(String name) {
            this.name = name;
            ClassA.this.name = name;
        }
    }

    public static void main(String[] args) {

        ClassA classA = new ClassA("Test"); // Outer Class.

        ClassA.StaticInnerClassA staticInnerClassA = new ClassA.StaticInnerClassA(); //Static inner class.
        staticInnerClassA.setNameFromStaticInnerClass("This is name");
        //staticInnerClassA.setStaticInnerClassVariable("Name from parent");

        System.out.println(staticInnerClassA.getNameFromStaticInnerClass()); // null
        InnerClass innerClass = classA.new InnerClass(); //Inner class.

        classA.name = "outer class name";
        innerClass.setName("inner class name.");

        System.out.println(classA.name);
        System.out.println(innerClass.name);

        innerClass.setAllNames("2 inner Names");
        innerClass.printAllName();
        System.out.println(classA.name);

    }
}
