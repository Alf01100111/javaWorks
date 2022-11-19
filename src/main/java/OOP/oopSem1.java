package OOP;

public class oopSem1 {
    public static void main(String[] args) {
        // модель генеалогического дерева
        // возможность посмотреть всех детей человека

    }

    class Human {
        private int ID;
        private String gender;
        private String name;
        private String surname;
        private int age;
        private String status;


        public Human (int ID, String gender, String name, String surname, int age, String status) {
            this.ID = ID;
            this.gender = gender;
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.status = status;

        }

        public int getID() {
            return ID;
        }
        public void setID(int ID) {
            this.ID = ID;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(int ID){
            this.gender = gender;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }
        public String toString() {
           return String.format("ID : %d, Surname : %s, Name : %s, Age : %d, Status : %s, Gender: %s",
                    this.ID, this.surname, this.name, this.age, this.status, this.gender);
        }




    }

    class research {

    }
}


