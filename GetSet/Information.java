package GetSet;

class Information {
    private int age;
    private String name;

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("incorrect age");
            return;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Your name is incorrect");
            return;
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void sayWhoIam() {
        for (int i = 0; i < 3; i++) {
            System.out.println("I am " + getName() + " my age is " + getAge() + " years");
        }
    }
}