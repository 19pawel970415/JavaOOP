public class Person {
    private String name;
    private String surname;
    private Sex sex;
    private Integer age;
    private String peselNumber;

    public Person() {
    }

    public Person(String name, String surname, Sex sex, Integer age, String peselNumber) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.peselNumber = peselNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public void setPeselNumber(String peselNumber) {
        this.peselNumber = peselNumber;
    }

    public boolean hasReachedRetirementAge() {
        if (this.age >= 60 && this.sex == Sex.WOMAN || this.age >= 65 && this.sex == Sex.MAN) {
            return true;
        } else {
            return false;
        }
    }

    public int getAgeDifference(Person person) {
        int diff = this.age - person.getAge();
        return Math.abs(diff);
    }

    public int getYearsToRetirement() {
        if (this.age >= 60 && this.sex == Sex.WOMAN || this.age >= 65 && this.sex == Sex.MAN) {
            return 0;
        } else {
            if (this.sex == Sex.MAN) {
                return 65 - this.age;
            } else {
                return 60 - this.age;
            }
        }
    }
}
